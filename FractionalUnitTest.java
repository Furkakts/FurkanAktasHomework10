package fractionaltesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FractionalUnitTest {
// To learn what N and I mean,read the description next to the variable defined in class 'Fractional'.
	
	@Test
	void constructorTest() {
		Fractional rationalNumber = new Fractional(1,4,' ');
		assertEquals(0.25,rationalNumber.getValue());
	}
	
	
	@Test
	void isNaNTest() {
		Fractional rationalNumber = new Fractional(0,0,'N');
		assertEquals(Fractional.NotANumber,rationalNumber.toString());
	}

	@Test
	void isInfinityTest() {
		Fractional rationalNumber = new Fractional(5,0,'I');
	    assertEquals(rationalNumber.numerator>0? Fractional.PositiveInfinity : Fractional.NegativeInfinity,
	    		rationalNumber.toString());
	}
	
	@Test
	void equalsMethodTest() {
		Fractional rationalNumber = new Fractional(6,6,' ');
		assertEquals(Boolean.TRUE,rationalNumber.equals(rationalNumber));
	}
	
	@Test
	void getValueTest() {
		Fractional rationalNumber = new Fractional(300,6789,' ');
		assertEquals(0.04418912947414936,rationalNumber.getValue());
	}
	
	@Test
	void signTest() {
		Fractional rationalNumber = new Fractional(-1,5,' ');
		assertEquals(0, Fractional.sign(0, 5));
		//assertEquals(-1, rationalNumber.sign());
		//assertEquals(+1, Fractional.sign(9, 5)); 
	}
	
	@Test
	void toStringTest() {
		Fractional rationalNumber = new Fractional(-10,3,' ');
		assertEquals("-10/3", rationalNumber.toString());
	}
	
	@Test
	void simplificationTest() {
		Fractional rationalNumber = new Fractional(-24,16,' ');
		assertEquals("3/-2", rationalNumber.simplify().toString());
		//When answer is corect,but sign is wrong.Like (3/-2) doesnt work.So change it to (-3/2).
	}
	
	

}

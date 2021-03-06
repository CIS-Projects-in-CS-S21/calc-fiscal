package edu.temple.cis3296;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorModelTest {
	CalculatorModel calc; 

	@Before 
	public void initialize(){
		calc = new CalculatorModel();
	}

	@Test
	public void shouldAddTwoPlusTwo(){
		// Assert 2.0 plus 2.0 is equals 4.0 plus or minus 0.1 epsilon
		// Double comparaison necessite to specify an epsilon. 
		assertEquals(4.0, calc.operationAdd(2.0, 2.0), 0.1);
	} 

	@Test
	public void shouldSubstTwoAndTwo(){
		assertEquals(0.0, calc.operationSubst(2.0, 2.0), 0.1);
	} 

	@Test
	public void shouldSubtNineAndFour(){
		assertEquals(5.0, calc.operationSubst(9.0, 4.0), 0.1);
	}

	@Test
	public void shouldMultTwoByOne(){
		assertEquals(2.0, calc.operationMult(2.0, 1.0), 0.1);
	} 

	@Test
	public void shouldDivTwoByOne(){
		assertEquals(2.0, calc.operationDiv(2.0, 1.0), 0.1);
	}
	@Test
	public void shouldAddFourAndFive(){assertEquals(9.0, calc.operationAdd(4.0, 5.0), 0.1);}

	@Test
	public void shouldMultFiveBySix() {
		assertEquals(30.0, calc.operationMult(5.0, 6.0), 0.1);
	}
  @Test
	public void shouldDiv0by10(){ assertEquals(0.0, calc.operationDiv(0.0, 10.0), 0.1);}


}

package perscholas.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Calculatortest {

	@ParameterizedTest
	@CsvSource({
		"5 ,5, 10",
		"10,10,20",
		"5.5,5.5,11"
	})
	public void additionTest(double a,double b,double result) {
		Calculator c = new Calculator();
		
		double actual = c.add(a, b);
		
		//double actual = c.add(5.0, 5.0);
		
		Assertions.assertEquals(result,actual);
		
		//Assertions.assertEquals(15.0, c.add(7.5,7.5));
	}
	
	@ParameterizedTest
	@CsvSource({
		"5 ,5, 12",
		"10,10,22",
		"5.5,5.5,12"
	})
	public void additionErrorTest(double a,double b,double result) {
		Calculator c = new Calculator();
		
		double actual = c.add(a, b);
		
		//double actual = c.add(5.0, 5.0);
		
		Assertions.assertNotEquals(result,actual);
		
		//Assertions.assertEquals(15.0, c.add(7.5,7.5));
	}
	
	@ParameterizedTest
	@CsvSource({
		"12 ,7, 5",
		"10,10,0",
		"5.5,5.5,0.0"
	})
	public void subtractionTest(double a,double b,double result) {
		Calculator c = new Calculator();
		//double expected = 0.0;
		
		double actual = c.subtract(a,b);
		
		Assertions.assertEquals(result,actual);
		
		//Assertions.assertEquals(0.0, c.subtract(5.5,5.5));
	}
	
	@ParameterizedTest
	@CsvSource({
		"12 ,7, 8",
		"10,10,2",
		"5.5,5.5,2.0"
	})
	public void subtractionErrorTest(double a,double b,double result) {
		Calculator c = new Calculator();
		//double expected = 0.0;
		
		double actual = c.subtract(a,b);
		
		Assertions.assertNotEquals(result,actual);
		
		//Assertions.assertEquals(0.0, c.subtract(5.5,5.5));
	}
	
	@ParameterizedTest
	@CsvSource({
		"2 ,1, 2",
		"10,2,20",
		"5.0,5.0,25.0"
	})
	public void multiplyTest(double a,double b,double result) {
		Calculator c = new Calculator();
		//double expected = 0.0;
		
		double actual = c.multiply(a,b);
		
		Assertions.assertEquals(result,actual);
		
		//Assertions.assertEquals(0.0, c.subtract(5.5,5.5));
	}
	
	@ParameterizedTest
	@CsvSource({
		"2 ,1, 12",
		"10,2,200",
		"5.0,5.0,250.0"
	})
	public void multiplyErrorTest(double a,double b,double result) {
		Calculator c = new Calculator();
		//double expected = 0.0;
		
		double actual = c.multiply(a,b);
		
		Assertions.assertNotEquals(result,actual);
		
		//Assertions.assertEquals(0.0, c.subtract(5.5,5.5));
	}
	@ParameterizedTest
	@CsvSource({
		"50 ,2, 25",
		"50,3,16.666666666666668",
		"1.0,1.0,1.0"
	})
	public void divideTest(double a,double b,double result) {
		Calculator c = new Calculator();
		//double expected = 0.0;
		
		double actual = c.divide(a,b);
		
		Assertions.assertEquals(result,actual);
		
		//Assertions.assertEquals(0.0, c.subtract(5.5,5.5));
	}
	
	@ParameterizedTest
	@CsvSource({
		"2 ,1, 12",
		"10,2,200",
		"5.0,5.0,250.0"
	})
	public void divideErrorTest(double a,double b,double result) {
		Calculator c = new Calculator();
		//double expected = 0.0;
		
		double actual = c.divide(a,b);
		
		Assertions.assertNotEquals(result,actual);
		
		//Assertions.assertEquals(0.0, c.subtract(5.5,5.5));
	}
}

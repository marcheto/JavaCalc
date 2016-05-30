package lesson6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {


	@Test
	public void evaluatesExpression() {
	//testing
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);
	}

	@Test
	public void addSum() {
		Calculator calculator = new Calculator();
		int sumAdd = calculator.add(25, 12);
		assertEquals(37, sumAdd);
	}

	@Test
	public void SubSum() {
		Calculator calculator = new Calculator();
		int sum = calculator.sub(2, 2);
		assertEquals(0, sum);
	}
}



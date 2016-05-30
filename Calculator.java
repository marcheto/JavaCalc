package lesson6;

public class Calculator {
	public int evaluate(String expression) {
		int sum = 0;
		for (String summand : expression.split("\\+"))
			sum += Integer.valueOf(summand);
		return sum;
	}

	public int add(int a, int b) {

		return a + b;
	}

	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i - j;
	}
}

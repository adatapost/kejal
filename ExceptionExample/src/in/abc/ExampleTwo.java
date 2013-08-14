package in.abc;

class MathException extends Exception {
	public MathException() {
		super("Something is wrong");
	}

	public MathException(String msg) {
		super(msg);
	}
}

class MyMath {
	public static double div(double no1, double no2) throws MathException {
		if (no2 == 0)
			throw new MathException("Divisor cannot be ZERO.");
		return no1 / no2;
	}
}

public class ExampleTwo {
	public static void main(String[] args) {

		double value;
		try {
			value = MyMath.div(10, 0);
			System.out.println(value);
		} catch (MathException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Empoyee emp = new Empoyee(31, "aaa", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

package ph1_basic;

public class p03_operator {
	public static void main(String[] args) {
		int numberOne	= 20;
		int numberTwo	= 3;
		int result;

		// +
		result	= numberOne + numberTwo;
		System.out.println(numberOne + " + " + numberTwo + " = " + result);

		// -
		result	= numberOne - numberTwo;
		System.out.println(numberOne + " - " + numberTwo + " = " + result);

		// *
		result	= numberOne * numberTwo;
		System.out.println(numberOne + " * " + numberTwo + " = " + result);

		// /
		// 20 / 3 = 6 du 2
		result	= numberOne / numberTwo;
		System.out.println(numberOne + " / " + numberTwo + " = " + result);

		// %
		result	= numberOne % numberTwo;
		System.out.println(numberOne + " % " + numberTwo + " = " + result);
	}
}

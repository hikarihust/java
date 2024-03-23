package ph1_basic;

public class p03_operator {
	public static void main(String[] args) {
		int numberOne		= 3;
		int numberTwo		= 5;
		boolean result	= false;

		result	= numberOne > numberTwo;
		System.out.println(numberOne + " > " + numberTwo + " is " + result);

		result	= numberOne >= numberTwo;
		System.out.println(numberOne + " >= " + numberTwo + " is " + result);
		
		result	= numberOne < numberTwo;
		System.out.println(numberOne + " < " + numberTwo + " is " + result);

		result	= numberOne <= numberTwo;
		System.out.println(numberOne + " <= " + numberTwo + " is " + result);
		
		result	= (numberOne == numberTwo);
		System.out.println(numberOne + " == " + numberTwo + " is " + result);

		result	= (numberOne != numberTwo);
		System.out.println(numberOne + " != " + numberTwo + " is " + result);
	}
	
	// 003 Toan tu ++ --
	public static void main003(String[] args) {
		/*
		 * numberStart++ tra ve gia tri cua numberStart, sau đo tang number lan mot đon vi
		 * numberStart-- tra ve gia tri cua numberStart, sau đo giam number xuong mot đon vi
		 * ++numberStart tang numberStart len mot don vi, sau đo tra ve gia tri cua numberStart
		 * --numberStart giam numberStart xuong mot don vi, sau đo tra ve gia tri cua numberStart
		 */
		int numberStart	= 20;
		int numberEnd	= 0;
		
		numberEnd		= ++numberStart;
		numberEnd		= --numberStart;
		System.out.println("Number Start = " + numberStart);
		System.out.println("Number End   = " + numberEnd);
	}
	
	// 002 Toan tu gan += -= *= /= %=
	public static void main002(String[] args) {
		int number	= 20;
		System.out.println("Start = " + number);
		
		number += 10;	// number	= number + 10;
		number -= 10;	// number	= number - 10
		number *= 10;	// number	= number * 10
		number /= 10;	// number	= number / 10
		number %= 10;	// number	= number % 10
		System.out.println("End = " + number);
	}
	
	// 001 Toan tu so hoc  + - * / %
	public static void main001(String[] args) {
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

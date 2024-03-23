package ph1_basic;

public class p03_operator {
	public static void main(String[] args) {
		int numberOne		= 15;
		int numberTwo		= 125;
		double numberThree	= 123.145;	// 123 124

		int maxNumber		= Math.max(numberOne, numberTwo);
		System.out.println("Max: " + maxNumber);
		
		int minNumber		= Math.min(numberOne, numberTwo);
		System.out.println("Min: " + minNumber);
		
		System.out.println("ceil: " + Math.ceil(numberThree));
		System.out.println("floor: " + Math.floor(numberThree));
		System.out.println("round: " + Math.round(numberThree));
		
		double randomNumber	= Math.random();
		System.out.println("randomNumber: " + randomNumber);
	}
	
	// 005 Toán tử logic && || !
	public static void main005(String[] args) {
		int numberOne	= 20;
		int numberTwo	= 10;
		boolean result	= false;

		// && true tất cả biểu thức true
		// && false chỉ cần 1 biểu thức false
		result	= (numberOne > numberTwo) && (numberOne >= numberTwo);
		System.out.println("(numberOne > numberTwo) && (numberOne >= numberTwo is " + result);

		// || true chỉ cần 1 biểu thức true
		// || false tất cả biểu thức false
//		result	= (3<2) || (5 <= 3) || (1<0);
		result	= (numberOne > numberTwo) || (numberOne >= numberTwo);
		
		System.out.println("(numberOne > numberTwo) || (numberOne >= numberTwo is " + result);

		// true
//		result	= !(3>2 && 5>8);
		result = !(numberOne > numberTwo);
		System.out.println("!(numberOne > numberTwo) " + result);
	}
	
	// 004 Toán tử so sánh > < >= <= == != 
	public static void main004(String[] args) {
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

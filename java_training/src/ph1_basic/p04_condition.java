package ph1_basic;

public class p04_condition {
	public static void main(String[] args) {
		int number		= 15;
		String result	= "Số chắn";

		if(number % 2 == 1) result	= "Số lẻ"; 
		System.out.println(result);
	}
	
	// 001 IF - Dạng 03
	public static void main003(String[] args) {
		int number	= 15;
		int tmp		= number % 2;
		String result	= "";

		if(tmp == 1) result	= "Số lẻ"; 
		if(tmp == 0) result	= "Số chắn"; 
		System.out.println(result);
	}
	
	// 001 IF - Dạng 02
	public static void main002(String[] args) {
		int number	= 15;
		int tmp		= number % 2;
		System.out.println("tmp: " + tmp);

		if(tmp == 0) System.out.println("Số chắn");
		if(tmp == 1) System.out.println("Số lẻ");
	}
	
	// 001 IF - Dạng 01
	public static void main001(String[] args) {
		int number		= 15;
		int tmp		= number % 2;
		System.out.println("tmp: " + tmp);

		if(tmp == 0) {
			System.out.println("Số chắn");
		}

		if(tmp == 1) {
			System.out.println("Số lẻ");
		}
	}
}

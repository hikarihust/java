package ph4_exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) {
		try {
			myFunction(2,0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Throws throw
	public static void myFunction(int number1, int number2) throws ArithmeticException, Exception{
		if(number2 == 0) throw new ArithmeticException("Lỗi chia cho 0");
		if(number2%2 == 0) throw new ArithmeticException("Lỗi chia cho số chẵn");
		System.out.println(number1/number2);
	}
	
	// Finnaly
	public static void study005() {
		int number1 = 5;
		int number2 = 0;
		
		/*
		// Case 01 Thẻ ATM bị nhốt trong máy ATM
		System.out.println("Nhận thẻ ATM");
		System.out.println(number1/number2);
		System.out.println("Trả thẻ ATM");
		*/
		
		// Case 02 Thẻ ATM được nhả ra khi có lỗi giao dịch (catch)
		/*
		System.out.println("Nhận thẻ ATM");
		try {
			System.out.println(number1/number2);
		} catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		} 
		System.out.println("Trả thẻ ATM");
		*/
		
		// Case 03 Thẻ ATM được nhả ra khi có lỗi giao dịch (finally)
		System.out.println("Nhận thẻ ATM");
		try {
			System.out.println(number1/number2);
		} finally {
			System.out.println("Trả thẻ ATM");
		}
	}
	
	// Exception: Runtime + Checked
	public static void study004() {
		// Exception: Runtime Checked
		try {
			FileOutputStream fileObj	= new FileOutputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Try catch 
	public static void study003() {
		int number1 = 5;
		int number2 = 1;
		int[] arrInt	= {1, 2, 3};
		System.out.println("Nhận thẻ ATM");
		
		try {
			System.out.println(number1/number2);
			System.out.println(arrInt[3]);
		}  catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Trả thẻ ATM");
	}
	
	// Ví dụ truy cập phần tử không tồn tại trong mảng
	public static void study002() {
		int[] arrInt	= {1, 2, 3};
		
		System.out.println("Nhận thẻ ATM");
		System.out.println(arrInt[0]);
		System.out.println(arrInt[1]);
		System.out.println(arrInt[2]);
		System.out.println(arrInt[3]);
		System.out.println("Trả thẻ ATM");
	}
	
	// Ví dụ phép chia cho 0 và việc dừng chương trình đột ngột
	public static void study001() {
		// Giao dịch rút tiền ở máy ATM
		// Có lỗi xảy ra chương trình bị ngưng đột ngột ảnh hưởng đến các xử lý khác của hệ thống
		
		System.out.println("Nhận thẻ ATM");
		System.out.println(5/0);
		System.out.println("Trả thẻ ATM");
	}
}

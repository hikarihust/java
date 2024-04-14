package ph5_string;

import java.util.Scanner;

public class StrRE {
	
	public static void main(String[] args) {
		// study001();
		// study002();
		// study003();
		study004();
	}
	
	// 001 Number
	// Dữ liệu nhập vào phải là số tự nhiên (0 < 100)	\d{1,2}
	public static void study001() {
		boolean flagMatch 	= false;
		String input		= "";
		Scanner sc			= new Scanner(System.in);
		
		do {
			System.out.println("Input: " ); 
			input	= sc.nextLine();
			
			if(input.matches("\\d{1,2}") == true){
				flagMatch	= true;
				System.out.println("Dữ liệu hợp lệ");
			}else{
				System.out.println("Dữ liệu không hợp lệ");
			}
			
		} while (flagMatch == false);
		
		sc.close();
	}
	
	// 002 ID
	// ID phải có chiều dài là 7 ký tự XXX-YYY
	// XXX phải nằm trong tập hợp các giá trị ký tự A-Z hoặc a-z 
	// YYY phải là các giá trị số từ 2 đến 8
	// [A-z]{3}-[2-8]{3}
	public static void study002() {
		boolean flagMatch 	= false;
		String input		= "";
		Scanner sc			= new Scanner(System.in);
		
		do {
			System.out.println("Input: " ); 
			input	= sc.nextLine();
			
			if(input.matches("[A-z]{3}-[2-8]{3}") == true) {
				System.out.println("Dữ liệu hợp lệ");
				flagMatch	= true;
			}else{
				System.out.println("Dữ liệu không hợp lệ");
			}
			
		} while (flagMatch == false);
		
		sc.close();
	}
	
	// 003 Username
	// Tên đăng nhập phải bắt đầu bằng một ký tự hoặc dấu gạch dưới
	// Tên đăng nhập là tập hợp của các ký tự a-z, 0-9 và có thể có các ký tự như dấu chấm ( . ), dấu gạch dưới ( _ )
	// Độ dài tối thiểu của tên đăng nhập là là 5 ký tự và độ dài tối đa là 32 ký tự
	// [A-z_]{1}[\w\.]{4,31}
	public static void study003() {
		boolean flagMatch 	= false;
		String input		= "";
		Scanner sc			= new Scanner(System.in);
		
		do {
			System.out.println("Input: " ); 
			input	= sc.nextLine();
			
			if(input.matches("[A-z_]{1}[\\w\\.]{4,31}") == true) {
				System.out.println("Dữ liệu hợp lệ");
				flagMatch	= true;
			}else{
				System.out.println("Dữ liệu không hợp lệ");
			}
			
		} while (flagMatch == false);
		
		sc.close();
	}
	
	// 004 Website
	// ^(https?://(www\.)?|(www\.))[a-z0-9\-]{3,}(\.[a-z]{2,4}){1,2}$
	// http://www.zend.vn
	// https://www.zend.vn.vn
	// http://zend.vn
	// https://zend.vn
	// www.zend.vn
	public static void study004() {
		boolean flagMatch 	= false;
		String input		= "";
		Scanner sc			= new Scanner(System.in);
		
		do {
			System.out.println("Input: " ); 
			input	= sc.nextLine();
			
			if(input.matches("((https?://)(www\\.)?|(www\\.))[a-z0-9-]{3,20}(\\.[a-z]{2,4}){1,2}") == true) {
				System.out.println("Dữ liệu hợp lệ");
				flagMatch	= true;
			}else{
				System.out.println("Dữ liệu không hợp lệ");
			}
			
		} while (flagMatch == false);
		
		sc.close();
	}
}

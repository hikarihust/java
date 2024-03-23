package ph1_basic;

public class p02_variable {
	// 004 Type casting
	public static void main(String[] args) {
		int var1 = 12;
		double var2 = 1.23;
		int var3 = var1 + (int)var2;
		double var4 = (double) var1 + var2;
		
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}
	
	// 003 Data Type
	public static void main003(String[] args) {
		int var1	= 12;
		byte var2	= 10;
		boolean var3 = true;
		double var4 = 123.456;
		String name = "John Smith";
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("name: " + name);
	}
	// 002 Constant
	public static void main002(String[] args) {
		final int YOUR_BIRTHDAY = 1990;
		System.out.println(YOUR_BIRTHDAY);
	}
	
	// 001 Variable
	public static void main001() {
		System.out.println("p02_variable");
		// Khai bao bien
		/*
		 * Ctrl + D: Xoa di dong code muon xoa
		 */
//		int age;
//		int year;
//		char name;
//		char city;
//		int age, year;
//		char name, city;
		
		// First name
//		char firstname;		// normal
//		char firstName;		// camelCase
//		char first_name;	// underscores
		
		int age		= 20;
		int year 		= 2015;
		char name   = 'Q';
		System.out.println("age: " + age);
		System.out.println("year: " + year);
		System.out.println("name: " + name);
		
		age += 10;
		System.out.println("age: " + age);
	}
}

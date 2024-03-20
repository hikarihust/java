package ph1_basic;

public class p02_variable {
	public static void main(String[] args) {
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

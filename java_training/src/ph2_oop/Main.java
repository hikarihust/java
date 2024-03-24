package ph2_oop;

public class Main {

	public static void main(String[] args) {
		
		Student studentOne	= new Student();
		
		//studentOne.setCode("S001");
		studentOne.setCode(456);
		
		System.out.println("Code: " + studentOne.getCode());
	}
	
	// 002 Setter + Getter + Method
	public static void main002(String[] args) {
		
		Student studentOne	= new Student();
		Student studentTwo	= new Student();
		
		// studentOne
		studentOne.setBirthday(1994);
		studentOne.setName("John");
		studentOne.setCode("S001");
		studentOne.showInfo();
		
		// studentTwo
		studentTwo.setBirthday(1990);
		studentTwo.setName("Peter");
		studentTwo.setCode("S002");
		studentTwo.showInfo();
	}
	
	// 001 Property
	public static void main001(String[] args) {
		
		Student studentOne	= new Student();
		Student studentTwo	= new Student();
		
		studentOne.birthday	= 1994;
		studentOne.name		= "John";
		studentOne.code		= "S001";
		
		studentTwo.birthday	= 1990;
		studentTwo.name		= "Peter";
		studentTwo.code		= "S002";
		
		System.out.println("Student Info: ");
		System.out.println("- Name: " + studentOne.name);
		System.out.println("- Code: " + studentOne.code);
		System.out.println("- Birthday: " + studentOne.birthday);
		
		System.out.println("--------------------------");
		
		System.out.println("Student Info: ");
		System.out.println("- Name: " + studentTwo.name);
		System.out.println("- Code: " + studentTwo.code);
		System.out.println("- Birthday: " + studentTwo.birthday);
	}

}

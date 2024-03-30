package ph2_oop;

public class Main {

	// 009 Fraction  
	// Khởi tạo phân số
	// Nhập phân số
	// In phân số
	public static void main(String[] args) {

		Fraction fractionA	= new Fraction(2, 4);
		Fraction fractionB	= new Fraction(3, 9);
		
		System.out.println(fractionA.print());
		System.out.println(fractionB.print());
	}
	
	// 008 Static
	/*
	public static void main08(String[] args) {

		Counter counterObj1	= new Counter();	// object instance
		Counter counterObj2	= new Counter();
		Counter counterObj3	= new Counter();

		counterObj1.showCount();
		System.out.println("-----------------");
		counterObj2.showCount();
		System.out.println("-----------------");
		counterObj3.showCount();
		System.out.println("-----------------");
		System.out.println(Counter.count);
		System.out.println("-----------------");
		Counter.showCount();
	}
	*/
	
	// 007 Access modifier 
	/*
	public static void main007(String[] args) {

		Person personObj	= new Person("Peter", "SV001", 1997);
		personObj.name      = "Abcd"; 
		personObj.showInfo();
	}
	*/
	
	// 006 Overriding  
	/*
	public static void main006(String[] args) {

			Student studentObj	= new Student("Peter", "SV001", 1997);
//			studentObj.setName("Peter");
//			studentObj.setCode("SV001");
//			studentObj.setBirthday(1997);
			studentObj.setScore(8.5);
			
			studentObj.showInfo();
	}
	*/
	
	// 005 Inheritance 
	/*
	public static void main005(String[] args) {
		
		Student studentObj	= new Student();
		studentObj.setName("Peter");
		studentObj.showInfo();
		
		Teacher teacherObj	= new Teacher();
		teacherObj.setName("Mr Peter");
		teacherObj.showInfo();
	}
	*/
	
	// 004 Constructor
	/*
	public static void main004(String[] args) {
		
		Student studentOne	= new Student("John", "Sv009", 2000);
		studentOne.showInfo();
	}
	*/
	// 003 Overloading
	/*
	public static void main003(String[] args) {
		
		Student studentOne	= new Student();
		
		//studentOne.setCode("S001");
		studentOne.setCode(456);
		
		System.out.println("Code: " + studentOne.getCode());
	}
	
	// 002 Setter + Getter + Method
	/*
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
	*/
	
	// 001 Property
	/*
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
	*/
}

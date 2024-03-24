package ph2_oop;

public class Main {

	public static void main(String[] args) {
		Student studentOne = new Student();

		studentOne.setBirthday(1994);
		studentOne.setName("John");
		studentOne.setCode("S001");
		
		System.out.println("Name: " + studentOne.getName());
		System.out.println("Code: " + studentOne.getCode());
		System.out.println("Year: " + studentOne.getBirthday());
	}

}

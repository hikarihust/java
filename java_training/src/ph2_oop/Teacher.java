package ph2_oop;

public class Teacher extends Person {
	public double salary;
	
	public Teacher(String name, String code, int birthday) {
		super(name, code, birthday);
	}
	
	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

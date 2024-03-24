package ph2_oop;

public class Student {
	public String name;
	public String code;
	public int birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	// Show Student Info
	public void showInfo() {
		System.out.println("Student Info: ");
		System.out.println("Name \t\t:" + this.getName());
		System.out.println("Code \t\t:" + this.getCode());
		System.out.println("Birthday \t:" + this.getBirthday());
	}
}

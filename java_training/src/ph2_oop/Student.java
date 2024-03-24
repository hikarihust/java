package ph2_oop;

import java.util.Calendar;

public class Student {
	public String name;
	public String code;
	public int birthday;
	
	// CONSTRUCTOR
	public Student(String name, String code, int birthday) {
		this.name = name;
		this.code = code;
		this.birthday = birthday;
	}
	
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
	
	public void setCode() {
		this.code = "SV000";
	}
	
	public void setCode(String str, int number) {
		this.code = str + number;
	}
	
	public void setCode(int number) {
		this.code = "SV" + number;
	}
	
	public int getBirthday() {
		return birthday;
	}
	
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	public int getAge() {			
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR) - this.getBirthday();
	}
	
	// Show Student Info
	public void showInfo() {
		System.out.println("Student Info: ");
		System.out.println("Name \t\t:" + this.getName());
		System.out.println("Code \t\t:" + this.getCode());
		System.out.println("Birthday \t:" + this.getBirthday());
		System.out.println("Age \t\t:" + this.getAge());
	}
}

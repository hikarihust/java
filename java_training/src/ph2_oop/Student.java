package ph2_oop;

import java.util.Calendar;

public class Student extends Person {
	public double score;
	
	public Student(String name, String code, int birthday) {
		super(name, code, birthday);
	}
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	public void showInfo(){
		super.showInfo();
		System.out.println("Score \t\t:" + this.getScore());
	}
}

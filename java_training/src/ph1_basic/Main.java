package ph1_basic;

import ph2_oop.Person;

public class Main {
	// 007 Access modifier  
	//	Private chỉ truy cập được trong class 				(property, method)
	//	Null (rỗng) truy cập trong package 					(class,property, method)
	//	Protected truy cập trong package và các subclasses 	(property, method)
	//	Public truy cập từ bất kỳ đâu 						(class, property, method)

	public static void main(String[] args) {
		Person personObj	= new Person("Peter", "SV001", 1997);
		personObj.name      = "Abc"; 
		personObj.showInfo();
	}
}

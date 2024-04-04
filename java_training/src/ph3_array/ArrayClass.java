package ph3_array;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		study002();
	}
	
	// 002 Sao chép mảng - copyOfRange
	public static void study002(){
							//	0			1		2		3
		String arrString[] 	= { "Zend 2", "PHP", "Java", "Javascript" };
		
		String newArr[]		= Arrays.copyOfRange(arrString, 1, 3);
		System.out.println(newArr.length);
		System.out.println(newArr[0]);
		System.out.println(newArr[1]);
	}
	
	// 001 Sao chép mảng - copyOf
	public static void study001(){
							//  PT 1 (0)	(1)		(2)
		String arrString[] 	= { "Zend 2", "PHP", "Java", "Javascript" };
		arrString[0]		= "Android";
		
		String newArr[]		= Arrays.copyOf(arrString, 6);	// { "Android", "PHP", "Java", "Javascript", null, null }
		newArr[4]			= "Android";
		newArr[5]			= "IOS";
		System.out.println(newArr[0]);
		System.out.println(newArr[4]);
		System.out.println(newArr[5]);
	}
}

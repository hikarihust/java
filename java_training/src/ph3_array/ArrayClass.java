package ph3_array;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		study003();
	}
	
	// 003 In mảng
	public static void study003(){
		String arrString[] 	= { "Zend 2", "PHP", "Java", "Javascript" };
		
		System.out.println("----------------------");
		int length	= arrString.length;
		for(int i = 0; i < length; i++){
			System.out.printf("Phần tử thứ %d: %s %n", i, arrString[i]);
		}
		
		System.out.println("----------------------");
		for(String str : arrString){
			System.out.println(str);
		}
		
		System.out.println("----------------------");
		System.out.println(Arrays.toString(arrString));
		
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

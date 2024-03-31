package ph3_array;

public class ArrayBasic {

	public static void main(String[] args) {
		study001();
	}
	
	// 001 Khai báo mảng và truy cập mảng
	public static void study001(){
		// Khai báo mảng
		int arrOne[];
		int[] arrTwo;
		
		// Khai báo mảng và cấp vùng nhớ
//		int[] arrInt	= new int[5];
//		arrInt[0]		= 30;
//		arrInt[1]		= 31;
//		arrInt[2]		= 32;
//		arrInt[3]		= 33;
//		arrInt[4]		= 34;
		int[] arrInt	= {30,31,32,33,34};
		String arrStr[]	= {"Zend 2", "PHP", "Java"};
		
		System.out.println("Phần tử thứ 1: " + arrInt[0]);
		System.out.println("Phần tử thứ 2: " + arrInt[1]);
		System.out.println("Phần tử thứ 3: " + arrInt[2]);
		System.out.println("Phần tử thứ 4: " + arrInt[3]);
		System.out.println("Phần tử thứ 5: " + arrInt[4]);
		
		System.out.println("Phần tử thứ 1: " + arrStr[0]);
		System.out.println("Phần tử thứ 2: " + arrStr[1]);
		System.out.println("Phần tử thứ 3: " + arrStr[2]);
	}
}

package ph3_array;

public class ArrayBasic {

	public static void main(String[] args) {
		study002();
	}
	
	// 002 Truy cập phần tử và in mảng
	public static void study002(){
		int[] arrInt	= {30, 31, 32, 33, 34, 35, 36, 37};
		// 30, 31, 32		31	1	(3-1)/2
		// 30, 31, 32, 33	31	1	(4-1)/2
		
		System.out.println("Phần tử thứ 1: " + arrInt[0]);
		System.out.println("Phần tử thứ 2: " + arrInt[1]);
		System.out.println("Phần tử thứ 3: " + arrInt[2]);
		System.out.println("Phần tử thứ 4: " + arrInt[3]);
		System.out.println("Phần tử thứ 5: " + arrInt[4]);
		
		System.out.println("Tổng số phần tử: " + arrInt.length);
		System.out.println("Phần tử đầu tiên: " + arrInt[0]);
		System.out.println("Phần tử cuối cùng: " + arrInt[arrInt.length - 1]);
		System.out.println("Phần tử ở giữa: " + arrInt[(arrInt.length - 1)/2]);
		
		int length	= arrInt.length;
		for(int i = 0; i < length; i++){
			System.out.printf("Phần tử thứ %d: %d %n", i, arrInt[i]);
		}
		
		for(int n : arrInt){
			System.out.println(n);
		}
		
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

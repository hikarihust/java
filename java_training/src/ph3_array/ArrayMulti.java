package ph3_array;

public class ArrayMulti {
	public static void main(String[] args) {
		study001();
	}
	
	// Khai báo mảng đa chiều
	public static void study001(){
		// 2 9 1
		// 3 6 7
		int[][]	arrMulti	= new int[2][3];
		
		// Hàng thứ nhất row = 0
		arrMulti[0][0]		= 2;
		arrMulti[0][1]		= 9;
		arrMulti[0][2]		= 1;
		
		// Hàng thứ hai row = 1
		arrMulti[1][0]		= 3;
		arrMulti[1][1]		= 6;
		arrMulti[1][2]		= 7;		
	}
}

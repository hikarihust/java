package ph3_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMulti {
	public static void main(String[] args) {
		study003();
	}
	
	// Nhập mảng đa chiều
	public static void study003(){
		int rows, columns;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Rows: ");
		rows	= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Columns: ");
		columns	= sc.nextInt();
		sc.nextLine();
		
		int[][] arrMulti = new int[rows][columns] ;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				System.out.printf("Dòng %d cột %d: %n", i+1, j+1);
				arrMulti[i][j]	= sc.nextInt();
				sc.nextLine();
			}
		}
		sc.close();
		
		// 2 5 7 3
		// 4 1 2 2
		// 6 7 1 1
		System.out.println(Arrays.deepToString(arrMulti));
		
	}
	
	// Truy cập và in mảng đa chiều
	public static void study002(){
		// 2 9 1
		// 3 6 7
		int[][]	arrMulti	= {{2, 9, 1},{3, 6, 7}};
		
		
		// Dòng 2 Cột 1
		System.out.println("So phan tu cua mang(So hang): " + arrMulti.length);
		System.out.println("Dòng 2 Cột 1: " + arrMulti[1][0]);
		System.out.println("Dòng 1 Cột 3: " + arrMulti[0][2]);
		System.out.println("So phan tu cua hang 1(So cot): " + arrMulti[0].length);
		
		// Cách 1
		int row	= arrMulti.length;
		for(int i = 0; i < row; i++){
			for(int j = 0; j < arrMulti[i].length; j++){
				System.out.printf("Dòng %d cột %d: %d %n", i+1, j+1, arrMulti[i][j]);
			}
		}
		
		// Cách 2
		for(int i = 0; i < row; i++){
			for(int j = 0; j < arrMulti[i].length; j++){
				System.out.print(arrMulti[i][j] + " ");
			}
			System.out.println();
		}
		
		// Cách 3
		System.out.println(Arrays.deepToString(arrMulti));
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
		
		// Dòng 2 Cột 1
		System.out.println("Dòng 2 Cột 1: " + arrMulti[1][0]);
		System.out.println("Dòng 1 Cột 3: " + arrMulti[0][2]);
	}
}

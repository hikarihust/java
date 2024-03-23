package ph1_basic;

public class p05_loop {
	public static void main(String[] args) {
		int i = 2;
		while(i <= 9){
			System.out.println("Bảng cửu chương " + i);
			for(int j = 1; j <= 10; j++){
				System.out.printf("%d x %d = %d%n", i, j, i*j);
			}
			System.out.println();
			i++;
		}
	}
	
	// 002 BẢNG CỬU CHƯƠNG - BASIC
	public static void main002(String[] args) {
		int number = 9;
		
		// FOR
		System.out.println("=============FOR=============");
		for(int i = 1; i <= 10; i++){
			System.out.printf("%d x %d = %d%n", number, i, number*i);
		}
		System.out.println("=============FOR=============");
		// WHILE
		System.out.println("=============WHILE=============");
		int j = 1;
		while(j <= 10){
			System.out.printf("%d x %d = %d%n", number, j, number*j);
			j++;
		}
		System.out.println("=============WHILE=============");
		// DO WHILE
		System.out.println("=============DO WHILE=============");
		int k = 1;
		do {
			System.out.printf("%d x %d = %d%n", number, k, number*k);
			k++;
		}while(k <= 10);
		System.out.println("=============DO WHILE=============");
	}
	
	// 001 LOOP
	public static void main001(String[] args) {
		// FOR
		for(int i = 1; i <= 10; i++){
			System.out.println(i + " - FOR");
		}
		
		// WHILE
		int j = 1;
		while(j <= 10){
			System.out.println(j + " - (WHILE)JAVA is not difficult!");
			j++;
		}
		
		// DO WHILE
		int k = 1;
		do {
			System.out.println(k + " - (DO WHILE)JAVA is not difficult!");
			k++;	// k11
		} while (k < 10);
	}
}

package ph1_basic;

public class p05_loop {
	public static void main(String[] args) {
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

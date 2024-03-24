package ph1_basic;

public class p08_shape {
	public static void main(String[] args) {
		/*
		 	*				 number=1 
		 	*  *			 number=2
		 	*  *  *			 number=3
		 	*  *  *  *  	 number=4
		 	*  *  *  *  *	 number=5
	 	*/
		
		int number = 1;
		while(number <= 9){
			for(int i = 1; i <= number; i++){
				System.out.print("* ");
			}
			System.out.println();
			number++;
		}
	}
}

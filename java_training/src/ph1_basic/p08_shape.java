package ph1_basic;

public class p08_shape {
	
	// 004 Shape 4
	public static void main(String[] args) {
		/*
		 	*  *  *  *  *
		 	   *  *  *  *    
		 	   	  *  *  *
		 	   	  	 *  *
		 	   	  	 	*
	 	*/
		
		int number = 9;
		while(number >= 1){
			for(int i = 1; i<= 9-number; i++) System.out.print("  ");
			for(int j = 1; j<= number; j++) System.out.print("* ");
			System.out.println();
			number--;
		}
	}
	
	// 003 Shape 3
	public static void main003(String[] args) {
		/*
				         *
				      *  *
				   *  *  *
				*  *  *  *
			 *  *  *  *  *
		
		 		*	1	4
		 	   **	2	3	
		      ***
		     ****
		    *****
		*/
		
		int number = 1;
		while(number <= 5){
			for(int i = 1; i<= 5-number; i++) System.out.print("  ");
			for(int j = 1; j<= number; j++) System.out.print("* ");
			System.out.println();
			number++;
		}
	}
	
	// 002 Shape 2
	public static void main002(String[] args) {
		/*
		 	*  *  *  *  *	number=5
			*  *  *  *		number=4
			*  *  *  		number=3
			*  *  			number=2
			*				number=1
	 	*/
		int number = 5;
		while(number >= 1){
			for(int i = 1; i <= number; i++) System.out.print("* ");
			System.out.println();
			number--;
		}
	}

	// 001 Shape 1
	public static void main001(String[] args) {
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

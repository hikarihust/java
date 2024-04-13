package ph5_string;

public class StrBuilder {
	public static void main(String[] args) {
		
	       StringBuilder strBuilderObj = new StringBuilder("Java");
	       System.out.println(strBuilderObj);
	       
	      
	       // append
	       strBuilderObj.append(" easy");	// Java + easy
	       System.out.println(strBuilderObj);
	       
	       // insert
	       // Java easy
	       // 012345678
	       System.out.println(strBuilderObj.length());
	       strBuilderObj.insert(5, "is very ");
	       System.out.println(strBuilderObj);
	       System.out.println(strBuilderObj.length());
	       
	      
	       // deleteCharAt
	       // Java
	       strBuilderObj.deleteCharAt(0);
	       strBuilderObj.deleteCharAt(strBuilderObj.length()-1);
	       System.out.println(strBuilderObj);
	       
	       // delete
	       // Jaxnd
	       strBuilderObj.delete(1, 3 + 1);
	       System.out.println(strBuilderObj); 
		}
}

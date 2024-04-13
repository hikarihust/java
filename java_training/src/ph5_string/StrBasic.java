package ph5_string;

public class StrBasic {
	public static void main(String[] args) {
		// 001 Khởi tạo đối tượng chuỗi
		// study001();
		 
		// 002 Nối chuỗi
		// study002();
		 
		// 003 Chuyển đổi chuỗi số thành giá trị số
		// study003();
		
		// 004 So sánh chuỗi ==
		// study004();
		 
		// 005 So sánh chuỗi equals equalsIgnoreCase
		// study005();
		
		// 006 Sự dư thừa vùng nhớ
		study006();
	}
	
	// 006 Sự dư thừa vùng nhớ
	public static void study006() {
		String str1 = "JAVA is not difficult";	// JAVA is not difficult 		abc123
		str1 = "Android is not difficult";		// Android is not difficult		123ndg
		str1 = "Android is easy";				// Android is easy				8293ds
	}
	
	// 005 So sánh chuỗi equals equalsIgnoreCase
	public static void study005() {
		String str1 = "Java.vn";
        String str2 = "JaVa.vn";
 
        System.out.println("So sánh phân biệt chữ hoa chữ thường: " +str1.equals(str2));
        System.out.println("So sánh không phân biệt hoa thường: " + str1.equalsIgnoreCase(str2));
	}
	
	// 004 So sánh chuỗi ==
	public static void study004() {
		// java cnhd1234
		String str1 = "java";   // str1 = cnhd1234
		String str2 = "java";	// str1 = cnhd1234
		String str3 = "jaVa";	// str2 = asdhd1234
        String str4 = new String("java");	// str2 = sd1234
 
        if(str1 == str2){
        	System.out.println("Compare str1 vs str2: " + "Equal");
        }else{
        	System.out.println("Compare str1 vs str2: " + "Not Equal");
        }
        
        if(str1 == str3){
        	System.out.println("Compare str1 vs str3: " + "Equal");
        }else{
        	System.out.println("Compare str1 vs str3: " + "Not Equal");
        }
        
        if(str1 == str4){
        	System.out.println("Compare str1 vs str4: " + "Equal");
        }else{
        	System.out.println("Compare str1 vs str4: " + "Not Equal");
        }
	}
	
	// 003 Chuyển đổi chuỗi số thành giá trị số
	public static void study003() {
		String str = "16";
		System.out.println(str + 4);
		
		int number = Integer.parseInt(str);
		System.out.println(number + 4);
	}
	
	// 002 Nối chuỗi
	public static void study002() {
		String str1 = "JAVA";
		String str2 = "is not difficult";
		String str3 = str1 + " " + str2;
		String str4	= str1.concat(" ").concat(str2);	//str1 + " " + str2
		
		// Case 01
		System.out.println(str3);
		
		// Case 02
		System.out.println(str4);
	}
	
	// 001 Khởi tạo đối tượng chuỗi
	public static void study001() {
		// Case 01
		String str1 = "JAVA is not difficult";
		
		// Case 02
		String str2 = new String();
		str2 = "JAVA is not difficult";
 
        // Case 03
        String str3 = new String ("JAVA is not difficult");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}

package ph5_string;

public class StrMethod {
	
	public static void main(String[] args) {
		// length()		Trả về độ dài chuỗi
		// study001();
		
		// charAt			Lấy ra ký tự nằm ở vị trí index trong chuỗi
		// study002();
		
		// toLowerCase()	Chuyển chuỗi sang chữ thường
		// study003();
		
		// toUpperCase()	Chuyển chuỗi sang chữ in hoa
		// study004();
		
		// trim()			Loại bỏ khoảng trống 2 bên chuỗi
		// study005();
		
		// substring		Trích xuất chuỗi con
		study006();
	}
	
	// 006 substring(int beginIndex, int endIndex)
	// Trích xuất chuỗi con từ vị trí beginIndex đến vị trí endIndex-1
	public static void study006() {
		String str = "JAVA is not difficult";
 
		// JAVA is not difficult
		// 0123456789...
		
        // Trích xuất chuỗi con từ vị trí beginIndex đến cuối chuỗi
        System.out.println("str.substring(8) \t= " + str.substring(8));
        
        // Trích xuất chuỗi con từ vị trí beginIndex đến vị trí endIndex-1
        System.out.println("str.substring(3,9) \t= " + str.substring(3, 9));
	}
	
	// 005 trim
	// Loại bỏ khoảng trống 2 bên chuỗi
	public static void study005() {
		String str = "JAVA";	// 3 + JAVA + 2 
		String strTrim = "   " + str + "  ";
		System.out.println("strTrim - input - length: " + strTrim.length());
		strTrim	= strTrim.trim();
		System.out.println("strTrim - input - length: " + strTrim.length());
	}
	
	// 004 toUpperCase()
	// Chuyển chuỗi sang chữ in hoa
	public static void study004() {
		String str = "JAVA is not difficult";
		System.out.printf("Chuỗi --%s-- chuyển về chữ hoa --%s--", str, str.toUpperCase());
	}
	
	// 003 toLowerCase()
	// Chuyển chuỗi sang chữ thường
	public static void study003() {
		String str = "JAVA is not difficult";
		System.out.printf("Chuỗi --%s-- chuyển về chữ thường --%s--", str, str.toLowerCase());
	}
	
	// 002 charAt(int index)
	// Lấy ra ký tự nằm ở vị trí index trong chuỗi
	// JAVA is not difficult
	// 012345678901234567890
	public static void study002() {
		String str = "JAVA is not difficult";
		System.out.println(str.length());
		System.out.println("Phần tử ở vị trí đầu tiên\t=" + str.charAt(0));
		System.out.println("Phần tử ở vị trí thứ 5 \t\t=" + str.charAt(5));
        System.out.println("Phần tử ở vị trí cuối cùng\t=" + str.charAt(str.length()-1));
	}
	
	// 001 length 		
	// Trả về độ dài chuỗi
	public static void study001() {
		String str = "JAVA";
        System.out.printf("Chuỗi --%s-- cố độ dài là: %d", str, str.length());
	}
}

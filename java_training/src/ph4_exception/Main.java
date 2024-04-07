package ph4_exception;

public class Main {
	public static void main(String[] args) {
		study002();
	}
	
	// Ví dụ truy cập phần tử không tồn tại trong mảng
	public static void study002() {
		int[] arrInt	= {1, 2, 3};
		
		System.out.println("Nhận thẻ ATM");
		System.out.println(arrInt[0]);
		System.out.println(arrInt[1]);
		System.out.println(arrInt[2]);
		System.out.println(arrInt[3]);
		System.out.println("Trả thẻ ATM");
	}
	
	// Ví dụ phép chia cho 0 và việc dừng chương trình đột ngột
	public static void study001() {
		// Giao dịch rút tiền ở máy ATM
		// Có lỗi xảy ra chương trình bị ngưng đột ngột ảnh hưởng đến các xử lý khác của hệ thống
		
		System.out.println("Nhận thẻ ATM");
		System.out.println(5/0);
		System.out.println("Trả thẻ ATM");
	}
}

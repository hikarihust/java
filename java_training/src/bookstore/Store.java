package bookstore;

public class Store {
	private static int totalItems		= 0;		// Số quyển sách hiện tại trong kho sách
	private final int MAX_ITEMS			= 10;		// Số quyển sách lớn nhất mà kho sách chứa được
	private Book[] listItems			= null;
	
	public Store(){
		listItems	= new Book[MAX_ITEMS];
	}
	
	public int getItemPosition(String bookID){
		return -1;
	}
	
	// checkFull
	public boolean checkFull(){
		return false;
	}
	
	// Add book
	public void add(Book bookObj){
	}
	
	// Edit book
	public void edit(String bookID, String bookName, double bookPrice){
	}
	
	// Delete book
	public void delete(String bookID){
	}
	
	// Find book
	public void find(String bookID){
	}
	
	// list book
	public void list(){
	}
}

package bookstore;

public class Store {
	private static int totalItems		= 0;		// Số quyển sách hiện tại trong kho sách
	private final int MAX_ITEMS			= 1;		// Số quyển sách lớn nhất mà kho sách chứa được
	private Book[] listItems			= null;
	
	public Store(){
		listItems	= new Book[MAX_ITEMS];
	}
	
	public int getItemPosition(String bookID){
		return -1;
	}
	
	// checkFull
	public boolean checkFull(){
		if(totalItems == MAX_ITEMS) return true;
		return false;
	}
	
	// checkEmpty
	public boolean checkEmpty(){
		if(totalItems == 0) return true;
		return false;
	}
	
	// Add book
	public void add(Book bookObj){
		if(this.checkFull() == false){
			this.listItems[totalItems] = bookObj;
			totalItems++;
			System.out.println("Add successfull!");
		}else{
			System.out.println("Store is full!");
		}
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
		if(this.checkEmpty() == false){
			for(int i = 0; i < totalItems; i++){
				this.listItems[i].showInfo();
			}
		}else{
			System.out.println("Store is empty!");
		}
	}
}

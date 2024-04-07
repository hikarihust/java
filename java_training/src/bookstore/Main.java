package bookstore;

import java.util.Scanner;

public class Main {
	private static Store storeObj	= new Store();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int functionID	= 0;
		boolean flag	= true;
		
		do {
			showMenu();
			functionID		= sc.nextInt();
			sc.nextLine();
			
			switch (functionID) {
				case 1: addBook(); 		break;
				case 2: editBook(); 	break;
				case 3: deleteBook(); 	break;
				case 4: findBook(); 	break;
				case 5: listBook(); 	break;
				case 6: 
				default:
					flag = false;
					break;
			}
		} while (flag == true);
		
		sc.close();
	}
	
	public static void showMenu(){
		myPrint("----------- BOOK MANAGER ----------- ");
		myPrint("1. Add book");
		myPrint("2. Edit book");
		myPrint("3. Delete book");
		myPrint("4. Find book");
		myPrint("5. List book");
		myPrint("6. Exit");
		myPrint("Your choise [1-6]: ");
	}
	
	public static void addBook(){
		if(storeObj.checkFull() == false) {
			Scanner sc = new Scanner(System.in);
			
			String bookName	= "";
			String bookID	= "";
			double bookPrice= 0;
			
			myPrint("ID: ");
			bookID		= sc.nextLine();
			
			myPrint("Name: ");
			bookName	= sc.nextLine();
			
			myPrint("Price: ");
			bookPrice	= sc.nextDouble();
			
			
			Book bookObj	= new Book(bookID, bookName, bookPrice);
			storeObj.add(bookObj);
		} else {
			System.out.println("Store is full!");
		}
	}
	
	public static void myPrint(String content){
		System.out.println(content);
	}
	
	public static void deleteBook(){
		myPrint("deleteBook");
	}
	
	public static void findBook(){
		Scanner sc = new Scanner(System.in);
		
		String bookID	= "";
		
		myPrint("ID muon tim kiem: ");
		bookID		= sc.nextLine();
		
		storeObj.find(bookID);
	}
	
	public static void editBook(){
		myPrint("editBook");
	}
	
	public static void listBook(){
		storeObj.list();
	}
}

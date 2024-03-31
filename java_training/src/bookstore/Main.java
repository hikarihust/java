package bookstore;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc 		= new Scanner(System.in);
		int functionID	= 0;
		boolean flag	= true;
		
		do{
			showMenu();
			functionID		= sc.nextInt();
			sc.nextLine();
			
			switch (functionID) {
				case 1: addBook(); break;
				case 2: editBook(); break;
				case 3: infoBook(); break;
				case 4:
				default:
					flag = false;
					break;
			}
		} while(flag == true);
		
		sc.close();
	}
	
	public static void showMenu(){
		
		myPrint("===================== BOOK MANAGER =====================");
		myPrint("1. Add book");
		myPrint("2. Edit book");
		myPrint("3. Info book");
		myPrint("4. Exit");
		myPrint("Your choise [1-4]: ");
	}
	
	public static void myPrint(String content){
		System.out.println(content);
	}
	
	public static void addBook(){
		myPrint("addBook");
	}
	
	public static void editBook(){
		myPrint("editBook");
	}
	
	public static void infoBook(){
		myPrint("infoBook");
	}
}

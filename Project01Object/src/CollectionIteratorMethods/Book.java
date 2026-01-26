package CollectionIteratorMethods;

import java.io.Serializable;
import java.util.Scanner;

class Book implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static Scanner scan= new Scanner(System.in);

	int id;
	String bookName;
	String AuthorName;
	double price;

	Book(int id,String bookName,String AuthorName,double price)
	{
		this.id=id;
		this.bookName=bookName;
		this.AuthorName=AuthorName;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", AuthorName=" + AuthorName + ", price=" + price + "]";
	}
	
	public static void displayOptions() throws Exception
	{
		System.out.println("1.createNewBook");
		System.out.println("2.delete");
		System.out.println("3.Sorting by BookName");
		System.out.println("4.updating");
		System.out.println("5.Using author name to get bookname");
	
		System.out.println("Enter Option..");
		int ch=scan.nextInt();
		executeOption(ch);
		
	}
	
	public static void executeOption(int ch) throws Exception
	{
		switch(ch)
		{
		case 1:
			Book2Task.CreateBook();
			break;
			
		case 2:
			Book2Task.DeleteTheBook();
			break;
		case 3:
			Book2Task.sorted();
			break;
		case 4:
			Book2Task.UpdateId();
			break;
			
		case 5:
		    Book2Task.searchByAuthorName();
		    break;
			
			default:
				System.out.println("Enter the vaild input.........");
				displayOptions();
		}
		
	}

	

	

	
	
	
	
}

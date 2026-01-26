package CollectionIteratorMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Book2Task extends RuntimeException {
	static Scanner scan = new Scanner(System.in);
     static ArrayList<Book> book= new ArrayList<>();
     
     public static void CreateBook()
     {
    	 System.out.println("Create book...");
    	 int count = scan.nextInt();
    	 scan.nextLine();
    	 
    	 for(int i=0;i<count;i++)
    	 {
    	 System.out.println("Create a new book...");
    	 
    	 System.out.println("id: ");
		 int id=scan.nextInt();
		 
		 System.out.println("bookName: ");
		 String bookName=scan.next();
		 scan.nextLine();
		 
		 System.out.println("AuthorName: ");
		 String AuthorName=scan.next();
		 
		 System.out.println("price: ");
		 double price=scan.nextDouble();
		
		 book.add(new Book(id, bookName, AuthorName, price));
		 
		 System.out.println("Book add successfully....");
		 
    	 } 
	}
     
     public static void DeleteTheBook()
     {
    	System.out.println("Enter the deleted book id....");
    	int id=scan.nextInt();
    	
    	Book storedBook=null;
    	for(Book b:book)
    	{
    		if(b.id==id)
    		{
    			storedBook=b;
    			break;
    		}
    	}
    	 if(storedBook != null)
    	 {
    		 book.remove(storedBook);
    		 System.out.println("The give id object is removed... ");
    	 }
    	 
    	 System.out.println("Remainder book value:"+book);
     }

	public static void  sorted()
	{
		Comparator<Book> custom = new Comparator<Book>()
				{

					@Override
					public int compare(Book o1, Book o2) {
						
						return o1.bookName.compareToIgnoreCase(o2.bookName) ;
					}
			
			
				};
				Collections.sort(book,custom);
		System.out.println(book);
		
	}
  public static void UpdateId() throws Exception 
  {
	System.out.println("Enter the id update...");
	int id=scan.nextInt();
	
	for(Book b:book)
	{
		
		if(b.id==id)
		{
			System.out.println("Enter new id:");
			b.id=scan.nextInt();
			System.out.println("Enter new book name:");
			b.bookName=scan.next();
			System.out.println("Enter the new price:");
			b.price=scan.nextDouble();
			
			System.out.println("Book updated...");
			System.out.println(book);
			return;
		}
		else
		{
			throw new Exception("Enter valid UserID");
			
		}
	}
	System.out.println(book);
	  
	  
  }
    
     public static void searchByAuthorName()
     {
    	 System.out.println("Enter the Author name:");
    	 String AuthorName=scan.next();
    	 
    	 boolean founded=false;
    	 for(Book b:book)
    	 {
    		 if(b.AuthorName.equalsIgnoreCase(AuthorName))
    		 {
    			 System.out.println(b);
    			 founded = true;
    	     }
         }
    	 if(!founded)
		 {
			 System.out.println("no books found for this author...");
			 
		 }
     }
     
}





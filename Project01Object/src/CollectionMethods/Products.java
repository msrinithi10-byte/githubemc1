package CollectionMethods;

import java.io.Serializable;

public class Products  implements Serializable 
{
	
	
		private static final long serialVersionUID = 107L;
		int id;
		String name;
		String category;
		double price;
		
		 public Products(int id,String name,String category,double price)
		 {
		  this.id=id;
		  this.name=name;
		  this.category=category;
		  this.price=price;
	     }
		
		 public void display()
		 {
			 System.out.println("Id: "+id);
			 System.out.println("Name: "+name);
			 System.out.println("category: "+category);
			 System.out.println("Price: "+price);
		 }
		 
	}



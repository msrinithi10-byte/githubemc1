package CollectionMethods;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

	public class task01collection {

		public static void main(String args[]) throws IOException
		{
			File file = new File("C:\\Users\\Admin1\\OneDrive\\Desktop\\Arrayflie\\Myfile.txt");
			 
			Scanner scan = new  Scanner(System.in);
			ArrayList< Products> products=new ArrayList<>();
			
			System.out.println("Enter the product.....");
			int n=scan.nextInt();
			
			for(int i=0;i<n;i++)
			{
			 System.out.println("id: ");
			 int id=scan.nextInt();
			 
			 System.out.println("name: ");
			 String name=scan.nextLine();
			 scan.nextLine();
			 
			 System.out.println("Category: ");
			 String category=scan.nextLine();
			 
			 System.out.println("price: ");
			 double price=scan.nextDouble();
			 
			 products.add(new Products(id,name,category,price));
			}
			
			
			FileOutputStream ops = new FileOutputStream(file);
			ObjectOutputStream obj = new ObjectOutputStream(ops);
			
			obj.writeObject(products);
			ops.close();
			obj.close();
		    System.out.println("product saved succefully....");
			 
		    
		}
	}




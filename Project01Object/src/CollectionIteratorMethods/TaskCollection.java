package CollectionIteratorMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.util.Scanner;



public class TaskCollection  {
	

	public static  void main(String args[]) throws Exception
	{
		
		File file=new File("C:\\Users\\Admin1\\OneDrive\\Desktop\\MyBookFile\\File.txt");
		
		//System.out.println(file.createNewFile());
		Scanner scan = new Scanner(System.in);
		
		Book2Task book2= new Book2Task();
		
		boolean isContinue=false;
		do {
			Book.displayOptions();
			
		
		System.out.println("do you want to continue?(1)");
		int x=scan.nextInt();
		
		isContinue = (x==1)?true:false;
		}while(isContinue);
		
		//file Writer.......
		/*FileWriter fw= new FileWriter(file);
		for(Book b: Book2Task.book)
		{
			fw.write(b.toString());
			
		}
		fw.close();
		System.out.println("file will be write succefully....");*/
		
		FileOutputStream ops = new FileOutputStream(file,true);
		ObjectOutputStream obj = new ObjectOutputStream(ops);
		
		obj.writeObject(Book2Task.book);
		ops.close();
		obj.close();
		System.out.println("file will be write succefully....");
		
		ObjectInputStream Os= new ObjectInputStream(new FileInputStream(file));
		for(Book b: Book2Task.book)
		{
		System.out.println(b);	
	    }
		System.out.println("file read the file succesfully...");
	}

}

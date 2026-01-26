package CollectionMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileOutputStream;

public class Task2collection {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException 
	{
		File file = new File("C:\\Users\\Admin1\\OneDrive\\Desktop\\Arrayflie\\Myfile.txt");
		
		ArrayList< Products> products=new ArrayList<>();
		
		FileInputStream ops = new FileInputStream(file);
		ObjectInputStream obj = new ObjectInputStream(ops);
		
		//obj.readObject(products);
		//ops.close();
		//obj.close();
		
	}

}

package Tasks;

import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) {
		String s ="The java is a programming The java";
		
		
		String[] arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
					
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
				}
				
			}
			if(count >1)
			  {
			  System.out.println(arr[i] +" "+count);
            
		      }
		
	    }
		
		
		
		
		
		
		
		
		
}
}
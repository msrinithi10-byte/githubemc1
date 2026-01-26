package Tasks;

import java.util.Arrays;

public class Program02 {

	public static void main(String[] args) {
		
		String s= "javaprogamjp";
		
		String[] arr=s.split("");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			//char ch = s.charAt(i);
			int count=0;
					
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
				}
				
			}
			
			if(count >=1)
			  {
			  System.out.println(arr[i] +" "+count);
            
		      }
		
		
	}

}
}
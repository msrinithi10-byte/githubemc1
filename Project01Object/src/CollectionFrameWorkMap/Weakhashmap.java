package CollectionFrameWorkMap;

import java.util.WeakHashMap;

public class Weakhashmap {

	public static void main(String[] args) {
		WeakHashMap<String,String> whp = new WeakHashMap<>();
        String s=new String("hello");
        whp.put(s, "sjihd");
        System.out.println(whp);
        s=null;
        System.gc();
        System.out.println(whp);
        
        
	}

}

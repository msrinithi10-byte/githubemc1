package CollectionFrameWorkMap;

import java.util.IdentityHashMap;

public class Identityhashmap {

	public static void main(String[] args) {
		
		IdentityHashMap<String,String> ihm = new IdentityHashMap<>();
		
		String s=new String("hello");
		String s1="hello";
		
		ihm.put(s, null);
		ihm.put(s1,null);
		System.out.println(ihm);
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
	}

}

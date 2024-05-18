package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("Ram");
		hs.add(23);
		hs.add("nikhil");
		hs.add("Tripathi");
		
		System.out.println(hs);
		
		System.out.println(hs.contains("nikhil"));
		System.out.println(hs.size());
		
		Iterator itr = hs.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}	
	}
}

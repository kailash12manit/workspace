import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class map_demo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"k1");
		hm.put(2,"k2");
		hm.put(3,"k3");
		hm.put(4,"k4");
		hm.put(5,"k5");
		
		System.out.println(hm);
		System.out.println(hm.keySet());
		HashSet hs= (HashSet)hm.keySet();
				
		Iterator itr  = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" :"+hm.get(itr.next()));
		}
		
		
		
		
	}

}

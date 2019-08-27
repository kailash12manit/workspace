import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class array_list {
	public static void main(String[] args) {
		
		System.out.println("arraylist ");
		ArrayList<Integer> al = new ArrayList<Integer>();
		int aa=10;
		al.add(aa);
		al.add(20);		
		al.add(30);
		
				
		for(int r : al) {
			System.out.println(r);
		}
		
	/*
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object ob = it.next();
			System.out.print(ob.toString()+" ");
			System.out.println(ob.getClass().getName());
			
		}
		*/
		Object ob = al.get(0);
		
		System.out.println( ob instanceof Integer);
		System.out.println( ob instanceof String);

		ListIterator aall = al.listIterator();
		while(aall.hasNext()) {
			
			System.out.print("previous "+aall.hasPrevious()+" ");
			System.out.print("value: "+aall.next()+" ");
			System.out.println("hasNext "+aall.hasNext()+" ");
		}		
	}
}

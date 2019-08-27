import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Operations_on_Sets {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			HashSet<Integer> set1 = new HashSet<Integer>();
			while(n-->0) {
				set1.add(sc.nextInt());				
			}
			HashSet<Integer> set2 = new HashSet<Integer>();
			while(m-->0) {
				set2.add(sc.nextInt());				
			}
			int x=sc.nextInt();
			HashSet<Integer> res= new HashSet<>();
			switch(x) {
				case 1:	res=resForAndOperation(set1,set2,x);
					break;
				case 2:	res=resForOrOperation(set1,set2,x);
					break;
				case 3:	res=resforXOROperation(set1,set2,x);
					break;
				case 4:	res=resforAMinusBOperation(set1,set2,x);
					break;
				case 5:	res=resforBMinusAOperation(set1,set2,x);
			}
			
			Collection<Integer> collection = res.stream()
					.collect(Collectors.toCollection(TreeSet::new));
			
		    int res_size=0;
			System.out.print("{");
			for(Integer i:collection) {
				System.out.print(i);
				res_size++;
				if(res_size!=collection.size()) {
					System.out.print(", ");
				}
			}
			System.out.println("}");
		}		
	}

	private static HashSet<Integer> resforXOROperation(HashSet<Integer> set1, HashSet<Integer> set2, int x) {
		// TODO Auto-generated method stub
		HashSet<Integer> res= new HashSet<>();
		res.addAll(set1); 
		res.addAll(set2);
		set1.retainAll(set2);
		res.removeAll(set1);
		return res;
	}

	private static HashSet<Integer> resforBMinusAOperation(HashSet<Integer> set1, HashSet<Integer> set2, int x) {
		// TODO Auto-generated method stub
		set2.removeAll(set1);
		return set2;
	}

	private static HashSet<Integer> resforAMinusBOperation(HashSet<Integer> set1, HashSet<Integer> set2, int x) {
		// TODO Auto-generated method stub
		set1.removeAll(set2);
		return set1;
	}
	
	private static HashSet<Integer> resForOrOperation(HashSet<Integer> set1, HashSet<Integer> set2, int x) {
		// TODO Auto-generated method stub
		set1.addAll(set2);
		return set1;
	}

	private static HashSet<Integer> resForAndOperation(HashSet<Integer> set1, HashSet<Integer> set2, int x) {
		// TODO Auto-generated method stub
		set1.retainAll(set2);
		return set1;
	}
}

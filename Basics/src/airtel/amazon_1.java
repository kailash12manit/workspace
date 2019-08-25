package airtel;
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.*;
// CLASS BEGINS, THIS CLASS IS REQUIRED
class coordinats{
	int x;
	int y;
	int dis;
	public coordinats(int x, int y, int dis) {
		this.x = x;
		this.y = y;
		this.dis = dis;
	}
}
public class amazon_1{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<List<Integer>>  arr = new ArrayList<List<Integer>>();
		while(n-->0){
			List <Integer> a = new ArrayList<Integer>();
			int x=sc.nextInt();
			int y= sc.nextInt();
			a.add(x);
			a.add(y);
			arr.add(a);
		}
		System.out.println(arr);
		int nn = sc.nextInt();
		List<List<Integer>>  res = new ArrayList<List<Integer>>();
		res=ClosestXdestinations(n,arr,nn);
		System.out.println(res);
	}
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED 
	
    public static List<List<Integer>> ClosestXdestinations(int numDestinations,List<List<Integer>> allLocations,int numDeliveries){
	        // WRITE YOUR CODE HERE
    	    int p = numDestinations;
    	    int q = numDeliveries;
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        List<List<Integer>> sortDistance = new ArrayList<List<Integer>>();
	        ArrayList<coordinats> ar = new ArrayList<coordinats>();
	        
	        for(List<Integer> arr : allLocations){
	            int x = arr.get(0);
	            int y = arr.get(1);
	            int distance =(x*x+y*y);
	            System.out.println(distance);
	            ar.add(new coordinats(x,y,distance));
	        }
	        Collections.sort(ar, new Sortbydistance());
	        for(coordinats cc : ar){
	        	System.out.println(cc.x+" "+cc.y);
	        }	        
	        for(int i=0;i<q;i++){
	        	coordinats cc =ar.get(i);
	        	int aaa= cc.x;
	        	int bbb= cc.y;
	        	List<Integer> as = new ArrayList<Integer>();
	        	as.add(aaa);
	        	as.add(bbb);
	        	result.add(as);
	        }	        
	        return result;
	}
}
class Sortbydistance implements Comparator<coordinats> 
{ 
    public int compare(coordinats a, coordinats b) 
    { 
    	return (int) (a.dis - b.dis); 
    } 
} 

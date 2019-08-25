/**
 * 
 */
package strings_demo;
import java.util.HashMap;
import java.util.Scanner;
/**
 * @author kailash
 *
 */
public class counter {
	/**
	 * @param args
	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str =sc.next();
		HashMap<Character,Integer > map= new HashMap<Character,Integer>();
		for(char ch : str.toCharArray()){
			if(map.containsKey(ch)){
				int val=map.get(ch);
				map.put(ch,val+1);
			}
			else
				map.put(ch,1);
		}
		System.out.println(map);
	}
}

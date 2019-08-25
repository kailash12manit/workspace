package interview_questions;
import java.util.ArrayList;
import java.util.Random;

public class UniqueRandomNumbers {
	public static void main(String[] args) {
		
		int size=10;
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int i=0;i<size;i++){
			list.add(i+1);
		}
		//System.out.println(list);
		int count=0;
		Random randon = new Random();
		
		for(int i=0;list.size()!=0;i++){
			int t= randon.nextInt(list.size());
			int temp= list.get(t);
			System.out.println(temp);
			list.remove(t);
			count++;
		}		
		System.out.println(count);
	}

}

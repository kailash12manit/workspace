package interview_questions;
import java.util.*;

public class Sort_stack_greatest_top {
	public static void main(String[] args) {
		Stack<Integer>st= new Stack<Integer>();
		st.add(1);
		st.add(5);
		st.add(9);
		st.add(3);
		st.add(2);
		st.add(8);
		
		Stack<Integer>result= new Stack<Integer>();
		result=sort(st);
		while(!result.isEmpty()){
			System.out.println(result.pop());
		}
		
	}

	private static Stack<Integer> sort(Stack<Integer> s) {
		
		Stack<Integer> st1=new Stack<>();
	
		while(!s.empty()) 
		{
			int temp=s.pop();
			
			while(!st1.empty() && st1.peek()>temp)
			{
				s.push(st1.pop());
			}
			st1.push(temp);
		}
		return st1;
	}
}
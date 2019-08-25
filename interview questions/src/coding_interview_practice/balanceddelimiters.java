package coding_interview_practice;
import java.util.Scanner;
import java.util.Stack;

public class balanceddelimiters {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		String input= sc.next();
		//System.out.println(input);
		System.out.println(check_balane(input));
	}

	private static boolean check_balane(String input) {
		// TODO Auto-generated method stub
		Stack<Character> stack  = new Stack<Character>();
		for(int i=0;i<input.length();i++){
			char c= input.charAt(i);
			if(c=='(' || c=='{' || c=='['){
				stack.push(c);
			}
			else if(c==')'){
				if(stack.isEmpty() || stack.pop()!='('){
					return false;
				}
			}
			else if(c=='}'){
				if(stack.isEmpty() || stack.pop()!='{'){
					return false;
				}
			}
			else if(c==']'){
				if(stack.isEmpty() || stack.pop()!='['){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}

package coding_interview_practice;
import java.util.*;

public class uncoupled {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		String line = sc.nextLine().trim();
		System.out.println(line);
		String[] tokens = line.split(",");
		int result=0;
		for (int i=0; i<tokens.length;i++){
		    result = result ^ Integer.parseInt(tokens[i]);
	    }
	   System.out.println(result);
		
	}
}

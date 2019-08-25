package codechef;
import java.util.Scanner;

public class MEX {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			
			int n=sc.nextInt();
			int k=sc.nextInt();
			sc.nextLine();
			String str=sc.nextLine();
			//System.out.println(str);
			
			int temp=k;
			for(int i=0;i<=(n+temp);i++){
				
				if(!str.contains(String.valueOf(i))){
				    if(k==0){
				        System.out.println(i);
				        break;
				    }else{
				        k--;
				    }
			    }
			}
			
		}//t
	}
}
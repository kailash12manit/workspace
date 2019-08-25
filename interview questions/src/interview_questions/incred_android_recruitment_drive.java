package interview_questions;
import java.util.Arrays;
import java.util.Scanner;

public class incred_android_recruitment_drive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			char []arr=new char[n];
			Arrays.fill(arr,'#');
			int j=0;
			for(int i=1;i<=n;i++){
				if(i%2==1){
					if(i<=n/2){
						for(j=1;j<=i;j++){
							System.out.print('*');
						}
						while(j<=n){
							System.out.print('#');
							j++;
						}
						System.out.println();
					}
					else{
						for(j=1;j<=n-i+1;j++){
							System.out.print('*');
						}
						while(j<=n){
							System.out.print('#');
							j++;
						}
						System.out.println();
						
					}
				}
				else{ // n: even
					
					if(i<=n/2){
						for(j=1;j<= arr.length-i;j++){
							System.out.print('#');
						}					
						while(j<=n){
							System.out.print('*');
							j++;
						}
					    System.out.println();
					}
					else{
						for(j=1;j<i;j++){
							System.out.print('#');
						}					
						while(j<=n){
							System.out.print('*');
							j++;
						}
					    System.out.println();
					}
				}
			}
			System.out.println();
		}
	}
}
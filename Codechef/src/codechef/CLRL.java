package codechef;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class CLRL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int target=sc.nextInt();
			int left=Integer.MIN_VALUE,right=Integer.MAX_VALUE;
			
			// 5 890
			// 5123 3300 783 1111 890
			
			int flag=0;
			for(int i=0;i<n;i++){
				int temp=sc.nextInt();
				//System.out.print(" temp:"+temp);
				if(temp>target){
					if(temp<right){
						right=temp;
						//System.out.print(" right:"+right);
					}
					else{
						flag=1;
						break;
					}
				}
				else if(temp<target){
						if(temp>left){
							left=temp;
					//		System.out.print(" left:"+left);
						}
						else{
							flag=1;
							break;
						}
				}
				//System.out.println();
			}
			if(flag==0){
				System.out.println("YES");
			}
			else{
				sc.nextLine();
				System.out.println("NO");
			}
		}
	}
}
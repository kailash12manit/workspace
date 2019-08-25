package vocera_hiring_challenge;
import java.util.Scanner;

/*
 * You are given a linked list that contains  integers. You have performed the following reverse
 *  operation on the list:
Select all the sub parts of the list that contain only even integers. For example, if the list is
Reverse the selected subpart such as  and .
Now, you are required to retrieve the original list.

9
2 18 24 3 5 7 9 6 12

24 18 2 3 5 7 9 12 6

 */
public class Reversed_Linked_List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int flag=1;
		for(int i=0;i<n-1;i++){
		     	if(arr[i]%2==0 && arr[i+1]%2==0){
						int temp = arr[i+1];
						arr[i+1]=arr[i];
						arr[i]= temp;
				}			
		}
     	for(int ii:arr){
     		System.out.print(ii+" ");
     	}
	}
}
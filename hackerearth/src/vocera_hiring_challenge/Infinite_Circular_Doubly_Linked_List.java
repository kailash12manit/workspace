package vocera_hiring_challenge;

import java.util.Scanner;

/*
  You are given a circular doubly linked list that contains integers as the data in each node. 
  These data on each node is distinct.You have developed a special algorithm that prints the three
  continuous elements of the list, starting from the first element or head of the list and runs for infinite time. For example, 
  if the list is , then the output of the algorithm will be The output contains the infinite number of elements because
  it is a circular list. 

You are given only a part of the output that has been returned by 
the algorithm. Your task is to determine the number of elements 
available in the original list and print the respective elements.

10
7 12 8 12 8 13 8 13 7 13
4
7 12 8 13
*/
public class Infinite_Circular_Doubly_Linked_List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int result[]= new int[n];
		int j=0;
		for(int i=0;i<3;i++){
			result[j]=arr[i];
			j++;
		}
		j--;
		for(int i=3;i<n;i++){
			int flag=2;
			int temp = arr[i];
			for(int k=0;k<=j;k++){
				if(result[k]==temp){
					flag=1;
					break;
				}
			}
			if(flag==2){
				j++;
				result[j]=temp;
			}
		}
		System.out.println(j+1);
		for(int i=0;i<=j;i++){
			System.out.print(result[i]+" ");
		}	
	}
}
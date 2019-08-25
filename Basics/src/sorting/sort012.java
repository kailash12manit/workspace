package sorting;

import java.util.Scanner;

public class sort012 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int arr[] = new int [10];
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();			
		}
		sort012Demo(arr);
		sc.close();			
	}

	private static void sort012Demo(int[] arr) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = arr.length-1;
		int mid = 0 , temp = 0;
		while(mid<=high){
			
			switch(arr[mid]){
			case 0:
			{
				temp = arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				break;
			}
			case 1:
			{	mid++;
				break;
			}
			case 2:
			{
				temp = arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
				break;
			}
			}// switch
		}
		
		for(int ii:arr){
			System.out.print(ii+" ");
		}
	}
}
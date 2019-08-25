package sorting;

import java.util.Scanner;

public class sort01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [10];
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();			
		}
		sort01Demo(arr);
		sc.close();
	}

	private static void sort01Demo(int arr[]) {
		// TODO Auto-generated method stub
		int left=0,right = arr.length-1;
		while(left<right){
			while(arr[left]==0 && (left<right)){
				left++;
			}
			while(arr[right]==1 && (left<right)){
				right--;
			}
			if(left<right){
				arr[left] = 0; 
                arr[right] = 1;
				left++;
				right--;
			}
		}
		
		for(int ii:arr){
			System.out.print(ii+" ");
		}
	}
}
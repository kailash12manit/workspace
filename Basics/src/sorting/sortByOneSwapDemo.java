package sorting;

public class sortByOneSwapDemo {
	public static void main(String[] args) {
		
		int arr[] = {10, 30, 20, 40, 50, 60, 70};
		sortByOneSwap(arr);
	}

	private static void sortByOneSwap(int[] arr) {
		// TODO Auto-generated method stub
		for(int t:arr){
			System.out.print(t+" ");
		}
		System.out.println();
		
		int n= arr.length;
		for(int i=n-1;i>0;i--){
			if(arr[i] < arr[i-1]){
				int j=i-1;
				while(j>0){
					if(arr[i] < arr[j]){
						//swap(arr[i], arr[j]);
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						break;
					}
					j--;
				}
			}		
		}
		for(int t:arr){
			System.out.print(t+" ");
		}
		System.out.println();
	}
}

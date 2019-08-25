package sorting;

public class kth_smallest_element {
	public static void main(String[] args) {
	
		int arr[]={1,2,-9,8,-3,6,-4};
		int k=3;
		System.out.println("Kth Smallest is :"+printKthSmallest(arr,k));
		
	}

	private static int printKthSmallest(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int min=-Integer.MIN_VALUE;
		int min_temp;
		for(int i=0;i<k;i++){
			min_temp = Integer.MAX_VALUE;
			for(int j=0;j<n;j++){
				if(min_temp>arr[j] && arr[j]>min){
					min_temp = arr[j];					
				}				
			}		
			min = min_temp;
			//System.out.println("current value "+pmin);
		}		
		return min;
	}
}

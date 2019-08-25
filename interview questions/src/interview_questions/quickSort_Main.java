package interview_questions;

public class quickSort_Main {
	public static void main(String[] args) {
		
		int A[] = {1, 4, 45, 6, 10, -8};
		for(int h:A){
			System.out.print(h+" ");
		}
		System.out.println();
		quickSort(A, 0, A.length-1);
		for(int h:A){
			System.out.print(h+" ");
		}
	}

	private static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pi;
		if(low<high){
			pi=partitioning(arr,low,high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);			
		}		
	}

	private static int partitioning(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = arr[high];
		
		// index of smaller element
        int i = (low-1); 
        
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
   
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
   
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
   
        return i+1;
    }
}

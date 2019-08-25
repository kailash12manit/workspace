package hackerrank;
import java.io.*;
import java.util.*;


public class Stock_Maximize {
	
	// Complete the stockmax function below.
    static int stockmax(int[] arr) {
    	int profite=0;
    	int n=arr.length;
    	int max=arr[n-1];
    	for(int i=n-2;i>=0;i--){
    		if(arr[i]<max){
    			profite+=(max-arr[i]);    
    		}
    		else{
    			max=arr[i];
    		}
    	}
    	return profite;
    }
    
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] prices = new int[n];

            String[] pricesItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int pricesItem = Integer.parseInt(pricesItems[i]);
                prices[i] = pricesItem;
            }

            int result = stockmax(prices);

            System.out.println(String.valueOf(result));
           
        }

      scanner.close();
    }
}

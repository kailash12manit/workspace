package DBS;
//https://www.geeksforgeeks.org/find-nth-number-number-system-3-4/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class GenerateNumberUsing45 {
	public static void main(String[] args) throws FileNotFoundException {
		find(100);
	}
	public static void find(int n) throws FileNotFoundException 
    { 
        String[] arr = new String[n+1]; 
        arr[0] = "";  
        int size = 1, m = 1; 
        while (size <= n) 
        {   for (int i=0; i<m && (size+i)<=n; i++) 
                arr[size + i] = "4" + arr[size - m + i]; 
            for (int i=0; i<m && (size + m + i)<=n; i++) 
                arr[size + m + i] = "5" + arr[size - m + i]; 
            m = m << 1; // Or m = m*2; 
            size = size + m; 
        }
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        /*
        for(int i=1;i<=n;i++){
    		if(checkPalindrome(arr[i]) && arr[i].length()%2==0){
        		System.out.println(arr[i]);
        	} 
        }
        */
       
        String result[]= new String[n];
        for(int i=1;i<n;i++){
        	 StringBuilder sb = new StringBuilder(arr[i]);
        	 sb=sb.reverse();
        	result[i]=arr[i]+sb;
        }
        for(int i=1;i<n;i++){
        	System.out.println(result[i]);
        }        
        System.out.println("END");       
    }	
}

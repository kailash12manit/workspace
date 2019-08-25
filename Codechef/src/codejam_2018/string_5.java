package codejam_2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class string_5 {
	
	public static void main(String[] args) throws IOException {
		String str= "abcdefghijklmnopqrstuvwxyz.*-";
		String special =".*-";
		printAllKLength(str.toCharArray(), 3);
		/*
		int count=0;
	    BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kailash\\workspace\\codejam_2018\\Output2.txt"));
        String line = reader.readLine();
	    while (line != null) {
	         if(!(line.charAt(0)=='.')|| !(line.charAt(0)=='-') || !(line.charAt(0)=='*') ||
        		 (!(line.charAt(2)=='.')|| !(line.charAt(2)=='-') || !(line.charAt(2)=='*')) )
	         {	         
	        	 System.out.println(line);	
	         } 
	         line = reader.readLine();
	    }   
	    */

	}	
	
	static void printAllKLength(char[] set, int k) throws IOException 
	{ 
	    int n = set.length;  
	    printAllKLengthRec(set, "", n, k);   
	    
	} 
	  
	static void printAllKLengthRec(char[] set, String prefix,int n, int k) throws IOException 
	{ 
	    // Base case: k is 0, 
	    // print prefix 
	    if (k == 0)  
	    { 
	        System.out.println(prefix); 
	    	//Getting the output stream of the file for writing
	        /*
	        for(int i=2;i<prefix.length();i++){
				if( !is_vowel(prefix.charAt(i-2)) || !is_vowel(prefix.charAt(i-1)) || !is_vowel(prefix.charAt(i))){
					System.out.print(prefix.charAt(i));
				}			
			}       
	        //System.out.println();
	        */
	        return; 
	    } 
	  
	    // One by one add all characters  
	    // from set and recursively  
	    // call for k equals to k-1 
	    for (int i = 0; i < n; ++i) 
	    { 
	        // Next character of input added 
	        String newPrefix = prefix + set[i];  
	        // k is decreased, because  
	        // we have added a new character 
	        printAllKLengthRec(set, newPrefix,n, k - 1);  
	    } 
	}

	private static boolean is_vowel(char ch) {
		// TODO Auto-generated method stub
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			return true;
		}	
		return false;
	}
}
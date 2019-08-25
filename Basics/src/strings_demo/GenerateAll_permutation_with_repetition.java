package strings_demo;

import java.util.ArrayList;

public class GenerateAll_permutation_with_repetition {
	public static void main(String[] args) {
		String str = "BACT";
		System.out.println("First Test: "+str);
		
		char[] set1 = str.toCharArray(); 
		for(int i=2;i<str.length();i++){
		    printAllKLength(set1, i);			
		}     
	}	
	static void printAllKLength(char[] set, int k) 
	{ 
		int n = set.length; 
		printAllKLengthRec(set, "", n, k); 
	} 
	static void printAllKLengthRec(char[] set,String prefix,int n, int k) { 
		// Base case: k is 0, print prefix 
		if (k == 0) { 
			System.out.println(prefix); 
			return; 
		} 
		// One by one add all characters from set and recursively call for k equals to k-1 
		for (int i = 0; i < n; ++i) { 
			// Next character of input added 
			String newPrefix = prefix + set[i]; 
			// k is decreased, because we have added a new character 
			printAllKLengthRec(set, newPrefix, n, k - 1); 
		} 
	} 
}
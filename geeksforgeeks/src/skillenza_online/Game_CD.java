package skillenza_online;

import java.util.Scanner;
public class Game_CD {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t_case = sc.nextInt();
		while(t_case-->0){
			count=0; // no game
			int n=sc.nextInt();
			char set[] = {'a', 'b','x'};
			printAllKLength(set,n);
			System.out.println(count%(100000007) );
			
		}
		
	}
	static void printAllKLength(char set[], int k) {
        int n = set.length;        
        printAllKLengthRec(set, "", n, k);
    }
    static void printAllKLengthRec(char set[], String prefix, int n, int k) {
        // Base case: k is 0, print prefix
        if (k == 0) {
            //System.out.println(prefix);
            char arr[] = prefix.toCharArray();
            int i;
            for(i=0;i<arr.length;i++){ // 0 1 2
            	if((i+1)%2!=0){ //odd
            		if(i==0){
            			if((arr[i]=='a')||(arr[i]=='x')){
            				continue;
            			}
            			else{
            				break;
            			}
            		} 
            		else {	if((arr[i]=='x')||(arr[i]=='a' && arr[i-1]!='b')){
                    				continue;
                    		}
            				else  {
            					break;
            				}
                   		}
              	}
            	else  // even 
            	{ if((i+1)%2==0)	 {
            					if((arr[i]=='x')||(arr[i]=='b' && arr[i-1]!='a')){
            						continue;
            					}
            					else{
            						break;
            					}
                 		}
            	} 
            }
            if(i==arr.length){
            	//System.out.println(prefix);
            	count++;
            }
        	return;
        }
 
        // One by one add all characters from set and recursively 
        // call for k equals to k-1
        for (int i = 0; i < n; ++i) {
             
            // Next character of input added
            String newPrefix = prefix + set[i]; 
             
            // k is decreased, because we have added a new character
            printAllKLengthRec(set, newPrefix, n, k - 1); 
        }
    }
}

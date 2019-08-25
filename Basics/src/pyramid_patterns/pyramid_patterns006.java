package pyramid_patterns;
/*

        1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 

*/

public class pyramid_patterns006 {
	public static void main(String[] args) {
		int n=9;
		printNums(n);
	}

	private static void printNums(int n) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<n;i++){
			int j=0;
			for(j=0;j<n-i-1;j++){
			    System.out.print(" ");
			}
			while(j<n){
				System.out.print(k+" ");
				j++;
			}
			System.out.println();
			k++;
		}
	}
}
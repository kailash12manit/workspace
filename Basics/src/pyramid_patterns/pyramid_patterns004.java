package pyramid_patterns;
/*
 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5  
 
*/

public class pyramid_patterns004 {
	public static void main(String[] args) {
		int n=5;
		//System.out.println("printTriagle \n\n");
		printNums(n);
	}	
	public static void printNums(int n){
		for(int i=0;i<n;i++){
			int k=1;
			for(int j=0;j<=i;j++){
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
	}
}

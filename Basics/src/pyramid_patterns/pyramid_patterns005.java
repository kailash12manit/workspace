package pyramid_patterns;
/*

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/

public class pyramid_patterns005 {
	public static void main(String[] args) {
		int n=5;
		System.out.println("pyramid_patterns005 \n\n");
		printNums(n);
	}

	private static void printNums(int n) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}


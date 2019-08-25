package pyramid_patterns;

/**
                1 
              1 2 1 
            1 2 3 2 1 
          1 2 3 4 3 2 1 
        1 2 3 4 5 4 3 2 1 
      1 2 3 4 5 6 5 4 3 2 1 
    1 2 3 4 5 6 7 6 5 4 3 2 1 
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 

*/

public class pyramid_patterns008 {
	public static void main(String[] args) {
		int n=9;
		Incre_Decre_Numbers(n);
	}

	private static void Incre_Decre_Numbers(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			int j=0;
			for(j=0;j<n-i-1;j++){
				System.out.print("  ");
			}
			int k=1;
			while(j<n){
				System.out.print(k+" ");
				k++;
				j++;
			}		
			k-=2;
			
			while(j-i<n){
				System.out.print(k+" ");
				k--;
				j++;
			}
			System.out.println();
		}
		
	}

}

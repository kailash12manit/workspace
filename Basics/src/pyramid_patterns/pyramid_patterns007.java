package pyramid_patterns;
/**
        1         
       1 2        
      1 2 3       
     1 2 3 4      
    1 2 3 4 5     
   1 2 3 4 5 6    
  1 2 3 4 5 6 7   
 1 2 3 4 5 6 7 8  
1 2 3 4 5 6 7 8 9 

*/

public class pyramid_patterns007 {

	public static void main(String[] args) {
		int n=9;
		Increasing_Numbers(n);
	}

	private static void Increasing_Numbers(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			int j=0;
			for(j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			int k=1;
			while(j<n){
				System.out.print(k+" ");
				j++;
				k++;
			}
			System.out.println();
			
		}
		
		
	}
}

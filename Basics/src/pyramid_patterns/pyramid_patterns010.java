package pyramid_patterns;
/**
 
* * * * * * * * * 
 * * * * * * * * 
  * * * * * * * 
   * * * * * * 
    * * * * * 
     * * * * 
      * * * 
       * * 
        * 
 
*/

public class pyramid_patterns010 {
	public static void main(String[] args) {
		int n=9;
		start_Reverse(n);
	}

	private static void start_Reverse(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			int k=0;
			for(k=0;k<i;k++){
				System.out.print(" ");
			}			
			int j=0;
			for(j=0;j<n-k;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
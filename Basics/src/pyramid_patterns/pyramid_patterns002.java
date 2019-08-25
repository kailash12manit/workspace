package pyramid_patterns;
/*
 
        *
      * * 
    * * * 
  * * * * 
* * * * * 
 
 
 */

public class pyramid_patterns002 {
	public static void main(String[] args) {
		int n=10;
		System.out.println("printStars\n");
		printStars(n);
	}
	
	public static void printStars(int n){ 
		for(int i=n-1;i>=0;i--){
			int j=0;
			for(j=0;j<i;j++){
				System.out.print("  ");
			}
			while(j<n){
				System.out.print("* ");
				j++;
			}				
			System.out.println();
		}
	}
}

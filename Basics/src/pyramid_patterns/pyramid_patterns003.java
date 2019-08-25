package pyramid_patterns;
/*
 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 
 */
public class pyramid_patterns003 {

	public static void main(String[] args) {
		int n=5;
		//System.out.println("printTriagle \n\n");
		printTriagle(n);
	}
	
	public static void printTriagle(int n){ 
		
		for(int i=0;i<n;i++){
			int j=0;
			for(j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			while(j<n){
				System.out.print("* ");
				j++;
			}
			System.out.println();
		}
	}
}

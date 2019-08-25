/**
 * 
 */
package StringBuffer;

/**
 * @author kailash
 *
 */
public class StringBuffer_and_StringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		StringBuffer sb= new StringBuffer("java");
		for(int i=0;i<1000000;i++){
			sb.append("hello");
		}
		//System.out.println(sb);
		
		System.out.println("Time taken by StringBuffer: "+(System.currentTimeMillis()-startTime) +"ms" );
		
		startTime = System.currentTimeMillis();
		StringBuilder sbuilder = new StringBuilder("java");
		for(int i=0;i<1000000;i++){
			sbuilder.append("hello");
		}
		System.out.println("Time taken by StringBuilder: "+ (System.currentTimeMillis()-startTime)+"ms" );
		
		
		
		
		
		

	}

}

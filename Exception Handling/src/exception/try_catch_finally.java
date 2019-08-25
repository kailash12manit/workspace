package exception;

//https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/
public class try_catch_finally {
	public static void main(String[] args) {
		
		try{
			System.out.println("k");
			System.exit(1);
		}catch(Exception e){
			System.out.println(e);

		}
		
		finally{
			System.out.println("k4");
		}
		
	}
}

package exception_handling;

public class FinalizeExample {
	
	@Override
	public void finalize(){
		// TODO Auto-generated method stub
		System.out.println("finalize is called");
	}
	
	public static void main(String[] args) {
		
		FinalizeExample f1 = new FinalizeExample();
		FinalizeExample f2 = new FinalizeExample();
		
		f1=null;
		f2=null;
		System.gc();
		
	}

}

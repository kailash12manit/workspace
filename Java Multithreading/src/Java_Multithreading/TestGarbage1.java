package Java_Multithreading;

public class TestGarbage1 {

	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("object is garbage collected");
	}
	
	public static void main(String[] args) {
		
		TestGarbage1 a1 = new TestGarbage1();
		TestGarbage1 a2 = new TestGarbage1();
	
		a1=null;
		a2=null;
		
		System.gc();
	}
}

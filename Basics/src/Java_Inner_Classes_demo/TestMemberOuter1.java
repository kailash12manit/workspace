package Java_Inner_Classes_demo;

//Java Member inner class example

public class TestMemberOuter1 {
	private int data=30;
	class inner{
		void show(){
			System.out.println("data= "+data);
		}
	}
	public static void main(String[] args) {
		TestMemberOuter1 obj = new TestMemberOuter1();
		TestMemberOuter1.inner in = obj.new inner();
		in.show();
	}
}

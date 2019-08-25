package Abstraction ;

abstract class shape{
	abstract void draw();
	static void kk(){
		System.out.println("static method");
	}
	
	final void kk3(){
		System.out.println("final method");
	}
}

class bike extends shape{
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Bike draw");	
	}
	public bike() {
		// TODO Auto-generated constructor stub
			System.out.println("Bike constructor");
	}
	/* cannot override the final method
	public void kk3() {
		// TODO Auto-generated method stub

	}
	*/
	
}

class rectange extends shape{
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("rectange draw");	
	}
	public rectange() {
		// TODO Auto-generated constructor stub
		System.out.println("rectange constructor");
	}
}

public class TestAbstraction1 {
	public static void main(String[] args) {
		shape sp = new rectange();
		sp.draw();	
		shape.kk();
	}
}

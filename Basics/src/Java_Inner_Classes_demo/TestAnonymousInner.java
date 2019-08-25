package Java_Inner_Classes_demo;

abstract class Person {
	abstract void eat();
}

interface Eatable{
	void eat();
}

public class TestAnonymousInner {
	
	public static void main(String[] args) {
		
		Person P = new Person() {
			
			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("nice fruits");
			}
		};
		P.eat();
		
		Eatable E = new Eatable() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("interfacre Eat ()");
			}
		};
		E.eat();
		
	}

}

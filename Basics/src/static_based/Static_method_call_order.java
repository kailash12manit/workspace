package static_based;
class A{
	{
		System.out.println("H");
	}
	static {
		System.out.println("A: show1()");
	}
	{
		System.out.println("1");
	}
	A(){
		System.out.println("A constructor");
	}
}
class B extends A{
	B(){
		
		System.out.println("B construtor");
	}
	{
		System.out.println("2");
	}
	static{
		System.out.println("B: show2()");
	}
	{
		System.out.println("3");
	}
	
	
}
public class Static_method_call_order {
	public static void main(String args[]){
		//A a= new A();
	    A b=new B();	
		
	}
}

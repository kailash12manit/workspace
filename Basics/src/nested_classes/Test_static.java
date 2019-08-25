package nested_classes;

public class Test_static {
	static int x=10;
	public static int fun(){
		System.out.println(x);
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(fun());
	
	}
}

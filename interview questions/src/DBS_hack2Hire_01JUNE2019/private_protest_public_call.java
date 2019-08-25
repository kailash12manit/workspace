package DBS_hack2Hire_01JUNE2019;

class Demo_for {
	public Demo_for(){
		this(1);
		System.out.println("public");
	}

	private Demo_for(int i) {
		// TODO Auto-generated constructor stub
		this("test");
		System.out.println("private");
	}

	protected Demo_for(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("protected");
	}
}

public class private_protest_public_call {
	public static void main(String[] args) {
		Demo_for dd = new Demo_for();
		
	}
}

/*
protected
private
public

*/
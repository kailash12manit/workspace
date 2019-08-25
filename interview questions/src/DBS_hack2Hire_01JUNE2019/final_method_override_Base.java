package DBS_hack2Hire_01JUNE2019;

class Base{
	protected  void getDetails(){
		System.out.println("Base class");
	}	
}
public class final_method_override_Base extends Base {
	protected final void getDetails(){
		System.out.println("final_method_override_Base class");
	}
	public static void main(String[] args) {
		Base obj = new Base();
		obj.getDetails();
	}
}

/*
final methos cannot be overriden
*/


/**
 * 
 */
package strings_demo;

/**
 * @author kailash
 *
 */
public final class create_immutable_class {

	/**
	 * @param args
	 */
	final String number;
	
	public create_immutable_class(String demo) {
		// TODO Auto-generated constructor stub
		this.number= demo;
		
	}
	public String getnumber(){
		return number;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		create_immutable_class c= new create_immutable_class("Hi");
		System.out.println(c.getnumber());
    }
	
}
/*
 * The above class is immutable because:
The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
The class is final so we cannot create the subclass.
There is no setter methods i.e. we have no option to change the value of the instance variable.
These points makes this class as immutable.
 */

/**
 * 
 */
package strings_demo;

/**
 * @author kailash
 *
 */
public class toString_demo {

	/**
	 * 
	 */
	int roll_no;
    String name;
    String citi;
    
	public toString_demo(int roll_no, String name, String citi) {
		// TODO Auto-generated constructor stub
		this.roll_no=roll_no;
		this.name=name;
		this.citi=citi;
	}

	/**
	 * @param args
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return roll_no+ " "+ name + " "+ citi;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toString_demo obj1 = new toString_demo(10,"john", "bhopal");
		toString_demo obj2 = new toString_demo(11,"mike", "delhi");
		System.out.println(obj1);
		System.out.println(obj2);
	}

}

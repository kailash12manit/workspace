package Java_Inner_Classes_demo;

public class localInner1 {
	
	private int data=30;//instance variable  
	
	void display(){  
	
		int k=20;// Rule: Local variable can't be private, public or protected.
		
		class Local{  
		    private int i=20;
			void msg(){
			System.out.println(data);
			System.out.println("i="+i);
			}  
	    }  
		Local l=new Local();  
		l.msg();  
	 }  

	public static void main(String args[]){  
	 
		 localInner1 obj=new localInner1();  
		 obj.display();  
	 }  
}

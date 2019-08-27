import java.util.Comparator;

class student{
	int roll;
	String name;
	String address;
	int marks;
	
	public student(int roll,String name, String address ,int marks ){
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.marks=marks;
	}
}

class sortByroll implements Comparator   {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		student a = (student)o1;
		student b= (student)o2;
		
		return a.roll-b.roll;
	}
}

class sortByname implements Comparator   {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		student a = (student)o1;
		student b= (student)o2;
		
		return a.roll-b.roll;
	}
}



public class Example_class_student {
	public static void main(String[] args) {
		
	}

}

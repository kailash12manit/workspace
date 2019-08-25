package DBS_hack2Hire_01JUNE2019;

class test_demo{
	
	void printData(int a){
		System.out.println("int");
	}
		
	void printData(long a){
		System.out.println("long");
	}
	
	void printData(String a){
		System.out.println("String");
	}
	
	void printData(Object o){
		System.out.println("Object");
	}
}

public class test_PrintData_override {
	public static void main(String[] args) {
		test_demo obj = new test_demo();
		char c = 10;
		obj.printData(c);
		obj.printData("Object");
	}	
}

/*

int
String

*/
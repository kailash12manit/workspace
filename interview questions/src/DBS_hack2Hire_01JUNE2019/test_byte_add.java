package DBS_hack2Hire_01JUNE2019;

public class test_byte_add {
	public static void main(String[] args) {
		byte b = 6;
		b += 8;
		System.out.println(b);
		//b =b + 7;
		System.out.println(b);
		
	}
}

/*
with : b =b + 7;
 
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
Type mismatch: cannot convert from int to byte

at DBS_hack2Hire_01JUNE2019.test_byte.main(test_byte.java:8)



 int or smaller expressions always resulting in an int. So compiler 
 complain about Type mismatch: cannot convert from int to byte for b = b+7;
 But b += 7; // No problem because +=, -=, *=, and /= will all put in an 
 implicit cast. b += 7 is same as b = (byte)b+7 so compiler not complain.

b =(byte) ((byte)b + 7);

*/
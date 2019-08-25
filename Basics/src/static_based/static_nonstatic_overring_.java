package static_based;

class Aa {
	public int m1(){
		System.out.println("in A:m1");
		return 0;
	}
}
class Bb extends Aa{
	
	public int m1(){
		System.out.println("in B: m1");
		return 0;
	}
}

public class static_nonstatic_overring_ {
	public static void main(String[] args) {
	
		Aa a = new Bb();
		a.m1();
	} 
}

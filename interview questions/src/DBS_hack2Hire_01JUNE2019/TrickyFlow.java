package DBS_hack2Hire_01JUNE2019;

public class TrickyFlow {
	String name;
	boolean amITricky;
	static byte smally;
	static double biggy;
	static {
		smally=5;
		biggy=12;
	}
	
	static void changeSmallyAnBiggy(){
		smally=3;
		biggy=10;
	}
	
	public static void main(String[] args) {
		TrickyFlow trickyFlow = new TrickyFlow();
		double anotherBiggy;
		if(true){
			anotherBiggy=100.0;
		}
		
		System.out.println("|"+trickyFlow.name+"|"+trickyFlow.amITricky+"|"+
				trickyFlow.smally+"|"+trickyFlow.biggy
				
				+"|"+anotherBiggy);
	}
}

//|null|false|5|12.0|100.0
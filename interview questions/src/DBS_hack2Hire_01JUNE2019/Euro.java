package DBS_hack2Hire_01JUNE2019;

class Money{
	public String country = "canada";
	public String getC(){
		return country;
	}
}

class Yen extends Money {
	public String getC(){
		return super.country;    // error , country was private at 4 line
	}	
}

public class Euro extends Money {
	public String getC(int x){
		return super.getC();
	}
	public static void main(String[] args) {
		System.out.print(new Yen().getC()+" "+new Euro().getC());
		
	}
}

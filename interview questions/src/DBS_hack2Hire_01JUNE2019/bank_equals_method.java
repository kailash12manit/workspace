package DBS_hack2Hire_01JUNE2019;

public class bank_equals_method {
	private String name;
	
	public bank_equals_method(String name){
		this.name=name;
	}
	public boolean equals(bank_equals_method b){
		return b.name.equals(this.name);
	}	
	
	public static void main(String[] args) {
		bank_equals_method bank1 = new bank_equals_method("DBS1");	
		bank_equals_method bank2 = new bank_equals_method("DBS1");
		System.out.println(bank1.name);
		System.out.println(bank2.name);
		if(bank1.equals(bank2)){
			System.out.println("same");
		}
		else{
			System.out.println("No same");
		}
	}
}
// hashcode need to be implements
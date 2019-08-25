package DBS_hack2Hire_01JUNE2019;

public class dbs_asia {
	String title;
	int value;
	
	public dbs_asia(){
		title+=" ASIA";
	}
	
	public dbs_asia(int value){
		this.value=value;
		title="DBS";
		//dbs_asia();		
	}
	
	public static void main(String[] args) {
		dbs_asia obj = new dbs_asia(5);
		System.out.println(obj.title);
		
	}
}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
The method dbs_asia() is undefined for the type dbs_asia

at DBS_hack2Hire_01JUNE2019.dbs_asia.<init>(dbs_asia.java:14)
at DBS_hack2Hire_01JUNE2019.dbs_asia.main(dbs_asia.java:18)

*/
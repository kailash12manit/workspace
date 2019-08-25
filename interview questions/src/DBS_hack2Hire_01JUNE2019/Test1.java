package DBS_hack2Hire_01JUNE2019;

public class Test1 {
	public static void main(String[] args) {
		int i=10;
		String s = null;
		
		try{
			i=s.length();
			i++;			
		}
		catch(NullPointerException e){
			++i;
			return;
		}
		catch(RuntimeException e ){
			i--;
			return;
		}
		finally{
			System.out.println(i);
		}		
	}
}


// OUTPUT =>  11
package exception_handling;

public class TestCustomException1 {
	
	public static void main(String[] args) {
		
		try {
			
			validate(19);
		    validate(15);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured "+e);
		}
		System.out.println("normal code");
	}

	private static void validate(int i) throws InvalidAgeException{
		// TODO Auto-generated method stub
		if(i<18){
			throw new InvalidAgeException("not invalid");
			
		}
		else
		{
			System.out.println("valid vote");
		}
				
	}

}

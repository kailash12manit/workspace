package strings_demo;

public class Replace_all_occurrences_of_string_with_space {
	public static void main(String[] args) {
		
		String Str = "LIELIEILIEAMLIECOOL"; 
        String Sub = "LIE"; 
        System.out.println(extractSecretMessage(Str, Sub)); 
        
	}

	private static String extractSecretMessage(String str, String sub) {
		// TODO Auto-generated method stub
		str = str.replaceAll(sub," ");
		str=str.trim();		
		return str;
	}

}

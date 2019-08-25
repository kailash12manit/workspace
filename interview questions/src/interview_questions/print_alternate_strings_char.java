package interview_questions;

public class print_alternate_strings_char {
	public static void main(String[] args) {
		
		String str1="kailash";
		String str2="IMHERO";
		System.out.println(str1);
		System.out.println(str2);
		
		String result= Generate_string(str1,str2);
		System.out.println(result);
	}

	private static String Generate_string(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1==null){
			return s2;
		}
		if(s2==null){
			return s1;
		}
		int i=0,j=0;
		String ans="";
		
		
		while(i<s1.length() && j< s2.length()){
			if(i>j){
				ans+=s2.charAt(j);
				j++;
			}
			else{
				ans+=s1.charAt(i);
				i++;
			}
		}
		if(i==s1.length()){
			ans+=s2.substring(j);
			return ans;
		}
		if(j==s2.length()){
			ans+= s1.substring(i);
			return ans;
		}
		
		return ans;
	}
}
package string;

public class String_02 {
	public static void main(String[] args) {
	
		//System.out.println(starOut("ab*cd"));
		//System.out.println(plusOut("12xy34", "1"));
		System.out.println(wordEnds("XY123XY", "XY"));
		
	}
	
	
	public static String wordEnds(String str, String word) {
		String res="";
		int i = str.indexOf(word);
		while(i!=-1){
			if(i!=0){
				res+=str.charAt(i-1);
			}
			if(i+word.length()==str.length()){
				break;
			}
			res+=str.charAt(i+word.length());
			i=str.indexOf(word,i+1);		
		}
		return res;	
	}
	
	public static String plusOut(String str, String word) {
		String res="";
		int index = str.indexOf(word);
		while(index!=-1){
			for(int i=0;i<index;i++){
				res+="+";
			}
			res+=word;
			str= str.substring(index+word.length());
			
			index = str.indexOf(word);
		}
		for(int i=0;i<str.length();i++){
			res+="+";
		}	
		return res;		
	}
	
	
	public static String starOut(String str) {
	 	StringBuilder  sb = new StringBuilder();
		
	 	for(int i=0;i<str.length();i++){
	 		if(str.charAt(i)=='*'){
	 			continue;
	 		}
	 		if(i>0 && str.charAt(i-1)=='*'){
	 			continue;
	 		}
	 		if(i<str.length()-1 && str.charAt(i+1)=='*'){
	 			continue;
	 		}
	 		sb.append(str.charAt(i));	 		
	 	}
	 	return sb.toString();
	}
}

/**
 * 
 */
package StringTokenizer;

/**
 * @author kailash
 *
 */
public class StringFormatter {

	public static String capitalizeWord(String str) {
		// TODO Auto-generated method stub
		String words[]= str.split("\\s");
		String capitalwords="";
		for( String w: words){
			String first=w.substring(0,1);
			String after_first= w.substring(1,w.length());
			capitalwords+= first.toUpperCase()+after_first+" ";
		}
		return capitalwords.trim();
	}

	public static String reverseWord(String str) {
		// TODO Auto-generated method stub
		String words[]= str.split("\\s");
		String reverse_words="";
		for( String w: words){
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			reverse_words+=sb.toString()+" ";
		}
    return reverse_words.trim();
	}

	public static String reverseToggle(String str) {
		//this is javatpoint
		//sIHT sI tNIOPTAVAJ
		str= reverseWord(str);
		String words[]= str.split("\\s");
		String reverse_toggle_words="";
		for( String w: words){
			String first=w.substring(0,1);
			String after_first= w.substring(1,w.length());
			reverse_toggle_words += first+after_first.toUpperCase()+" ";		
		}
	return reverse_toggle_words;
    }
}

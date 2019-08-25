package Java_Runtime_class;

import java.io.IOException;

public class Runtime1 {
	
	public static void main(String[] args) throws IOException {
	
		Runtime.getRuntime().exec("Notepad");
        //Runtime.getRuntime().exec("shutdown -r -t 0");  
	}

}

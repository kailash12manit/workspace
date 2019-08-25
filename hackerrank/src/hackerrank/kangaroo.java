package hackerrank;

import java.util.Scanner;

public class kangaroo {
    // Complete the kangaroo function below.
    static String kangaroo_check(int x1, int v1, int x2, int v2) {
        if((v1<v2) || (v1==v2)){
            return "NO";
        }
        int flag=1;
        
        int d1=x1+v1;
        int d2=x2+v2;
        
        while(true){
        	if(d1>d2){
        		flag=0;
        		break;
        	}
        	if(d1==d2){
        		flag=1;
        		break;        				
        	}
        	d1 +=v1;
   			d2 +=v2;
        } 
        if(flag==1){
        	return "YES";
        }
        else{
        	return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo_check(x1, v1, x2, v2);

        System.out.println(result);
        scanner.close();
    }
}

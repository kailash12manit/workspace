package online_test;

import java.util.Scanner;

public class Accolite_subtring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = 0;
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
        int len_str= s.nextInt();
        //String str=s.nextLine();
        String str= "kailash";
        //System.out.println(str);
            for (int from = 0; from < str.length(); from++) {
                for (int to = from + 1; to <= str.length(); to++) {
                    System.out.println(str.substring(from, to));
                    count++;
                }
            }
   
        System.out.println(count);
        }     
	}
}

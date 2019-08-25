package OCT18B;

import java.util.Scanner;

public class BITOBYT {
	public static void main(String[] args) {
		int t,n,d;
		Scanner sc = new Scanner(System.in);
		t= sc.nextInt();
		while(t-->0){
			int bit_value=1;
			int nibble_value=0;
			int byte_value=0;
			n=sc.nextInt(); // before the time Nms if only 1 Bit appeared at time 0ms
			while(n>0){
				
				if(n<2){
					//bit_value=bit_value;
					nibble_value=0;
					byte_value=0;
					break;
				}
				if(n>=2){
					bit_value=0;
					nibble_value++;
					byte_value=0;
					n=n-2;
				}
				
				if(n>=8){
					bit_value=0;
					nibble_value=0;
					byte_value++;
					n=n-8;
				}
				
				if(n>=16){
					
					bit_value=2*byte_value;
					nibble_value=0;
					byte_value=0;
					n=n-16;
				}									
			}
			System.out.println(bit_value+" "+nibble_value+" "+byte_value);
		}
	}
}
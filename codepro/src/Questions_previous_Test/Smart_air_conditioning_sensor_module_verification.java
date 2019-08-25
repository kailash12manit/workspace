package Questions_previous_Test;

import java.util.Scanner;

public class Smart_air_conditioning_sensor_module_verification {

	int N;				//	Number of commands
	int exit_flag = 0; 	// Variable 1 indicating the Power OFF standby state is in the Power OFF standby state
	
	Scanner s = new Scanner(System.in);
	// Functions that return incoming commands
	int Get_Command()
	{
		return s.nextInt();
	}
	
	void inputData() {
			N = s.nextInt();
	}
	
	void solve() {
		int data =0;
		int poweroff=0;

		for(int i=0; i<N; i++)
		{
			data = Get_Command();
			if(data !=6 )exit_flag = 0;
			switch(data) 
			{
				default:
					System.out.println("Unknown Error");
				
                case 9:
					System.out.println("Error Code " + data);
					break;
				case 4:	
					System.out.println("Sensing Mode Init");
					System.out.println("Temp. Sensing Mode ON");
					System.out.println("Humidity Sensing Mode ON");
					System.out.println("Air Sensing Mode ON");
                    break;
				case 3:	
					System.out.println("Sensing Mode Init");
					System.out.println("Humidity Sensing Mode ON");
					System.out.println("Air Sensing Mode ON");
                    break;
				case 2:	
					System.out.println("Sensing Mode Init");
					System.out.println("Air Sensing Mode ON");
					break;
				case 5:
					System.out.println("Wait Power OFF");
					exit_flag = 1;
					break;
				case 6:
					if(exit_flag ==1)
					{
						System.out.println("Power OFF");
                        poweroff=1;
						break;	
					}
					else
					{
						System.out.println("No Operation");
					}
					break;
				case 1:
					System.out.println("Power ON");
					break;					
				
			}
            if(poweroff==1){
                break;
            }            
		}
		System.out.println("Finish");
		s.close();
	}
	
	public static void main(String[] args) {
		Smart_air_conditioning_sensor_module_verification m = new Smart_air_conditioning_sensor_module_verification();
	
		m.inputData();				//	Input function
		m.solve();					//	Output answer
	}
}

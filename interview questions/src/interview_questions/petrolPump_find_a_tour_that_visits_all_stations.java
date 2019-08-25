package interview_questions;

class petrolPump{
	int petrol;
	int distance;
	
	public petrolPump(int petrol, int distance) {
		this.petrol = petrol;
		this.distance = distance;
	}
}

public class petrolPump_find_a_tour_that_visits_all_stations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		petrolPump [] arr = {new petrolPump(6,4), new petrolPump(3,6)  , 
				new petrolPump(7,3)};
		for(petrolPump P : arr){
			System.out.println(P.petrol +" liter and "+ P.distance + "Km");
		}
		
		int start = printTour(arr, arr.length); 
		System.out.println(start == -1 ? "No Solution" : "Start = " + start);
	}

	private static int printTour(petrolPump[] arr, int n) {
		// TODO Auto-generated method stub
		int start = 0; 
        int end = 1; 
        int curr_petrol = arr[start].petrol - arr[start].distance; 
        
        // If current amount of petrol in truck becomes less than 0, then 
        // remove the starting petrol pump from tour 
        
        while(end!=start || curr_petrol < 0){
        	// If current amount of petrol in truck becomes less than 0, then 
            // remove the starting petrol pump from tour
        	while(curr_petrol< 0 && start!=end){
        		  // Remove starting petrol pump. Change start 
                  curr_petrol -= arr[start].petrol - arr[start].distance;
                  start = (start + 1) % n; 
                  
                  // If 0 is being considered as start again, then there is no 
                  // possible solution
                  
                  if(start == 0) 
                      return -1; 
        	}
        	curr_petrol += arr[end].petrol - arr[end].distance;
        	end = (end+1)%n;
        }
        // Return starting point 
        return start; 
	}
}
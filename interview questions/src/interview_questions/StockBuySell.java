package interview_questions;
import java.util.ArrayList;

/*
 * we are allowed to buy and sell multiple times.
 */
class Interval 
{
    int buy, sell;
}
public class StockBuySell {
	
	public static void main(String[] args) {
	
		StockBuySell stock = new StockBuySell();
        
        // stock prices on consecutive days
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        int n = price.length;
 
        // fucntion call
        stock.stockBuySell(price, n);
	}
	
	
	// This function finds the buy sell schedule for maximum profit
	void stockBuySell(int price[], int n){
    	// Prices must be given for at least two days
        if (n == 1)
            return;
        int count = 0;
        // solution array
        ArrayList<Interval> sol = new ArrayList<Interval>();
        // Traverse through given price array
        int i = 0;
        while(i<n-1){
        	//local minima
        	while((i<n-1) && (price[i+1]<=price[i])){
        		i++;
        	}
        	
        	if(i==n-1){
        		break;
        	}
        	Interval e = new Interval();
        	e.buy=i++;
        	
        	//local maxima
        	while((i<n) && (price[i-1]>=price[i])){
        		i++;
        	}
        	
        	e.sell=i-1;
        	sol.add(e);
        	count++;
        }

        // print solution
        if (count == 0){
            System.out.println("There is no day when buying the stock will make profit");
        }
        else{
            for (int j = 0; j < count; j++){
                 System.out.println("Buy on day: " + sol.get(j).buy+"  " + "Sell on day : " + sol.get(j).sell);
            }
        }
        return;
    }
}
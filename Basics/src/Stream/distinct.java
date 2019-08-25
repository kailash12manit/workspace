package Stream;

import java.util.Comparator;
import java.util.stream.IntStream;

public class distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,5,4,6,9,87,7,4,5,5,6,87,7,8,8,8,4,5,6,9,8,7,4,1,12,3,3,5,4,5,4,4,4,2,69,9,8,5,2,3,3};
		IntStream stream =IntStream.of(arr);
		int total = (int)stream.distinct().count();
		System.out.println(total);
			
	}
}

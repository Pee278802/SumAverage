
public class SumAverageRunningInt {

	public static void main(String[] args) {
		
		System.out.println("For Loop");
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		 
			for (int number = lowerbound; number <= upperbound; ++number) {
				sum = sum + number;
	}

		average = sum/100;
			System.out.println("The sum of 1 to 100 is " + sum);
			System.out.println("The average is " + average);
			System.out.println();
			
		//while loop

		int sum2 = 0;
		double average2;
		int lowerbound2 = 1;
		int upperbound2 = 100;
		
		while(lowerbound2 <= upperbound2) {
				sum2 = sum2 + lowerbound2;
				lowerbound2++;
	}
		average2 = (sum2 / 100) ;
			System.out.println("While Loop");
			System.out.println("The sum of 1 to 100 is " + sum2);
			System.out.println("The average is " + average2);
			System.out.println();
		
		//do-while loop
		int sum3 = 0;
		double average3;
		int lowerbound3 = 1;
		int upperbound3 = 100;
		
		do {
				sum3 = sum3 + lowerbound3;
				lowerbound3++;
		} while (lowerbound3 <= upperbound2);
			
		average3 = (sum3 / 100);
			System.out.println("Do-while loop");
			System.out.println("The sum from 1 to 100 is " + sum3);
			System.out.println("The average is " + average3);
			System.out.println();
		}



}

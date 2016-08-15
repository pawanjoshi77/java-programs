package com.pawanjoshi.tutorialspoint;

public class ComputePI {

	public static void main(String[] args) {
		/*double sum = 0.0;
		int maxDenominator = 1000;
		
		for (int denominator = 1; denominator <= maxDenominator; denominator +=2){
			if (denominator % 4 ==1){
				sum = 4 *(double)(sum + ( 1/denominator));
			} else if (denominator % 4 ==3){
				sum = 4 *(double)(sum - (1/denominator));
			}
			else {
				System.out.println("The computer has gone crazy!");
			}
			System.out.println("The value of the PI is: " + sum);
			
		} */
		
		int maxTerm = 25000;
		double sum = 0.0;
		for (int term = 0; term < maxTerm; term++){
			//sum += 1.0/(term*2-1)
			if (term % 2 ==1){
				sum += -1.0/(term*2-1);
			} else {
				sum += 1.0/(term*2-1);
			}
			System.out.println("The value of PI is: " + sum); // Sum value is incorrect for PI value
		}
		

	}

}

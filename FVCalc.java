/*
when you will start writing larger programs it will be very 
hard to read it if you will be writing code with no tabs and spacings. 
i do agree that it works, but it's important to make clean 
coding a habbit, even though the programms written so far are small
*/

// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		rate = rate / 100;
		double futureValue = currentValue * Math.pow((1 + rate), years);
		System.out.println("After " + years + " years, $" + currentValue +
                " saved at " + (rate * 100) + "% will yield $" + futureValue);
	}
}

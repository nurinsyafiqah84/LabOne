package Exercise7;

import java.util.Scanner;

public class weightDemo {

	public static void main(String[] args) {
		
		System.out.print("Weight in Earth (kg) = ");
		Scanner input1 = new Scanner(System.in);
		double weight = input1.nextDouble();
		human Human = new human();
		Human.setWeightEarth(weight);
		Human.calculateWeight();
		System.out.print("\nWeight in Mars (lbs) = " + Human.getWeightMars());
		
	}
}

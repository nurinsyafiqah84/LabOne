package Exercise7;

import java.util.Scanner;

public class listDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input1 = new Scanner(System.in);
		System.out.print("Number of people = ");
		int number = input1.nextInt();
		list List1 = new list();
		human[] Human = new human[number];
		for (int i=0; i<number; i++) {
			Human[i] = new human();
			System.out.print("\nWeight in Earth (kg) = ");
			double weight = input1.nextDouble();
			Human[i].setWeightEarth(weight);
			Human[i].calculateWeight();
			System.out.print("Weight in Mars (lbs) = " + Human[i].getWeightMars());
			
			List1.lists.add(Human[i]);
		}
		System.out.println("\n");
		
		for (int j=0; j<number; j++) {
			
			System.out.println("Person " + (j+1) + " = " + List1.lists.get(j).getWeightEarth() + " kg in Earth and " + List1.lists.get(j).getWeightMars() + " lbs in Mars");
		}
		
		
		
		
		
	}

}

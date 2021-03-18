package Exercise7;
import java.util.*;
import Exercise7.HumanWeight;

public class weightDemo {

	public static void main(String[] args) {
		
		System.out.print("Weight in Earth (kg) = ");
		Scanner input1 = new Scanner(System.in);
		double weight = input1.nextDouble();
		HumanWeight human = new HumanWeight();
		human.setWeightEarth(weight);
		human.calculateWeight();
		System.out.print("\nWeight in Mars (lbs) = " + human.getWeightMars());
		
	}
}

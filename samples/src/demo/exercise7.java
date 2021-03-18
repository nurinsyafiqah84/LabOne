package demo;

import java.util.Scanner;


public class exercise7 {
	
	public void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("\nWeight in Earth in kg = ");
		double weightEarth = input.nextDouble();
		Exercise8.listWeightEarth.add(weightEarth);
		
		//compute weights on mars
		double weightMars = weightEarth / 9.81 * 3.711;
		
		//display result
		System.out.format("Weigth in Mars in lbs = %.2f", weightMars);
		Exercise8.listWeightMars.add(weightMars);
	}

}

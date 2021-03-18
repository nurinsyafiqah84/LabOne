package demo;

import java.util.*;
import java.text.DecimalFormat;

public class Exercise8 {

	
	static ArrayList<Double> listWeightEarth = new ArrayList<Double>();
	static ArrayList<Double> listWeightMars = new ArrayList<Double>();
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of people that you want to calculate = ");
		int num = input.nextInt();
		exercise7 exe7 = new exercise7();
		for(int j=0; j<num; j++) {
			exe7.main(args);
		}
		System.out.print("\n\n _______________________________");
		System.out.print("\n|\tEarth\t|\tMars\t|");
		System.out.print("\n -------------------------------");
		for(int i=0; i<num; i++) {
			DecimalFormat df1 = new DecimalFormat("#.##");
			System.out.print("\n|\t" + df1.format(listWeightEarth.get(i)) + "\t|\t");
			DecimalFormat df2 = new DecimalFormat("#.##");
			System.out.print(df2.format(listWeightMars.get(i)) + "\t|");
		}
		System.out.print("\n -------------------------------");
	}
	
	
	
}

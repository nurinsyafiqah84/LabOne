package Exercise7;

public class HumanWeight {

	private double weightEarth;
	private double weightMars;
	
	public HumanWeight(double weightEarth, double weightMars) {
		this.weightEarth = weightEarth;
		this.weightMars = weightMars;
	}
	
	public double getWeightEarth() {
		return weightEarth;
	}
	public void setWeightEarth(double weightEarth) {
		this.weightEarth = weightEarth;
	}
	public double getWeightMars() {
		return weightMars;
	}
	
	public void calculateWeight() {
		weightMars = getWeightEarth() / 9.81 * 3.711;
		
	}
}

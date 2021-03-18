package Exercise7;

public class human {

	private double weightEarth;
	private double weightMars;
	
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

package packageName;

public class Automobile {
	private String make;
	private String model;
	private double mileage;
	private double fuelTank;
	private double fuel;
	public Automobile(String mk, String mdl, double m, double fT) {
		make = mk;
		model = mdl;
		mileage = m;
		fuelTank = fT;
	}
	
	public void fillUp(double gallons){
		double maxfuel = fuelTank;
		fuelTank += gallons;
		if (fuelTank > maxfuel) {
			fuelTank = maxfuel;
		}
	}
	public void takeTrip(double miles) {
		fuelTank = fuelTank - miles/mileage;
	}
	public double reportFuel() {
		return fuelTank;
	}
	
}

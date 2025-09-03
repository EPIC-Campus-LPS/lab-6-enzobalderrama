package packageName;

public class Campsite {
	private double radius;
	public Campsite(double r) {
		radius = r;
	}
	
	public double area() {
		return radius * radius * Math.PI;
	}
	public double perimeter() {
		return 2 * radius * Math.PI;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double rad) {
		radius = rad;
	}
}

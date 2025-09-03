package packageName;

public class Trail {
	private double length;
	private double width;
	public Trail(double l, double w) {
		length = l;
		width = w;
	}
	
	public double area() {
		return length * width;
	}
	public double perimeter() {
		return length *2 + width * 2;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public void setLength(double len) {
		length = len;
	}
	public void setWidth(double wid) {
		width = wid;
	}
	
}

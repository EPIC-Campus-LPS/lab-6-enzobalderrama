package packageName;

public class ParkTest {

	public static void main(String[] args) {
		Campsite thisCampsite = new Campsite(10.0);
		Trail thisTrail = new Trail(25.0, 6.0);
		//Obviously there are a lot of options of how to do this but I went off GitHub's example
		System.out.println("Park Area: " + (thisCampsite.area() + thisTrail.area()));

	}

}

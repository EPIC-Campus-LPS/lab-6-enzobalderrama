package packageName;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ParkTest {

	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
        Scanner sc = new Scanner(file);
        String nex = "";
        double radius = 0.0;
        double length = 0.0;
        double width = 0.0;
        double parkArea = 0;
        while(sc.hasNextLine()){
            nex = sc.next();
            if (nex.equals("campsite")) {
            	radius = sc.nextDouble();
            	parkArea += Math.PI* Math.pow(radius, 2);
            }
            else if(nex.equals("trail")) {
            	length = sc.nextDouble();
            	width = sc.nextDouble();
            	parkArea += length * width;
            }
        }
        sc.close();
        System.out.println(parkArea);
	}

}

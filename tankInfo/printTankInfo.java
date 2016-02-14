package tankInfo;

public class printTankInfo {

	public static void main(String[] args) {
		printTankInfo("red", 2, 120);

	}
	public static void printTankInfo(String color, int crew, int maxSpeed) {
		System.out.print("Tank properties: ");
		System.out.print("color " + color + ", crew " + crew + ", maxSpeed " + maxSpeed);
		
	}

}

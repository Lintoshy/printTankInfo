package tankInfo;

public class printTankInfo {

	public static void main(String[] args) {
		Tank destroyer = new Tank();
		destroyer.color = "red";
		destroyer.crew = 2;
		destroyer.maxSpeed = 90;
			
		printTankInfo(destroyer);
	}
	
	public static void printTankInfo(Tank tank) {
		System.out.print("Tank properties: ");
		System.out.println("color " + tank.color + ", crew " + tank.crew + ", maxSpeed " + tank.maxSpeed);
	}

}

package tankInfo;

public class printTankInfo {

	public static void main(String[] args) {
		Tank destroyer = new Tank();
		destroyer.color = "red";
		destroyer.crew = 2;
		destroyer.maxSpeed = 90;
		destroyer.name = "destroyer";
		
		Tank T90 = new Tank();
		T90.color = "khaki";
		T90.crew = 3;
		T90.maxSpeed = 65;
		T90.name = "T90";
		
		printTankInfo(destroyer);
		printTankInfo(T90);
	}
	
	public static void printTankInfo(Tank tank) {
		System.out.print("Tank " + tank.name + " properties: ");
		System.out.println("color " + tank.color + ", crew " + tank.crew + ", maxSpeed " + tank.maxSpeed);
	}

}

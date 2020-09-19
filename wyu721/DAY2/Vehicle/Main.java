package Vehicle;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(12, 1000);
		System.out.println(vehicle);
		vehicle.speedUp();		
		System.out.println("加速后"+vehicle);
		vehicle.speedDown();
		System.out.println("减速后"+vehicle);
	}
}

package Vehicle;

public class Vehicle {
	private int speed;
	private int size;
	
	public Vehicle(int speed, int size) {
		super();
		this.speed = speed;
		this.size = size;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		speed--;
	}
	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", size=" + size + "]";
	}
	
}

package cars;

public class Car extends Vehicle{

	String tireType;
	
	public Car() { super(); }
	
	public Car(String modelName) {
		super(modelName);
	}

	public void ShiftGear(int gear) {}
	
	public void DriveTo(String destination) {
		this.ShiftGear(2);
		super.Move(destination);
	}
	
	public void Park() {
		super.Park();
	}
	
}

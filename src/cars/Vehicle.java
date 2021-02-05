package cars;

public  abstract class Vehicle {

	private String modelName, engine, steeringMechanism, currentLocation;
	private float topSpeed;
	private boolean isParked;
	
	public Vehicle() {}
	
	public Vehicle(String modelName) {
		this.modelName = modelName;
		this.isParked = true;
	}
	
	public void Park() {
		if(isParked){
			System.out.println("This is already parked!");
		} else {
			System.out.println("Parking...");
			this.isParked = true;
		}
	}
	
	public void Move(String destination) {
		this.isParked = false;
		this.currentLocation = destination;
	}
	
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getSteeringMechanism() {
		return steeringMechanism;
	}
	public void setSteeringMechanism(String steeringMechanism) {
		this.steeringMechanism = steeringMechanism;
	}
	public float getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(float topSpeed) {
		this.topSpeed = topSpeed;
	}
}

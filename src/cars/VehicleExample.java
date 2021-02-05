package cars;

public class VehicleExample {

	VehicleCarrier carrier = new VehicleCarrier();
	public void getVehicle() {
		carrier.carryVehicle(new Car("Tesla"));
		carrier.carryVehicle(new Car("Toyota"));
	}
	
	public void park() {
		carrier.parkAll();
	}
}

package cars;

import java.util.ArrayList;

public class VehicleCarrier extends Vehicle {
	ArrayList<Vehicle> carrier = new ArrayList<Vehicle>();

	public ArrayList<Vehicle> getCarrier() {
		return carrier;
	}

	public void setCarrier(ArrayList<Vehicle> carrier) {
		this.carrier = carrier;
	}
	
	public void carryVehicle(Vehicle vehicle) {
		carrier.add(vehicle);
	}
	
	public void parkAll() {
		for (Vehicle v: carrier) {
			v.Park();
		}
	}
}

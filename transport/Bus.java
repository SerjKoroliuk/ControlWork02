package controlWork2.transport;

public class Bus extends Vehicle {

	 int passengerÑapacity;
	 int longBus;

	@Override
	void drive() {
		System.out.println(" BUS is driving");
	}

	@Override
	void stop() {
		System.out.println(" BUS is stoping");
	}

	

	@Override
	public String toString() {
		return "Bus [passengerÑapacity=" + passengerÑapacity + ", longBus=" + longBus + ", powerEngine=" + powerEngine
				+ ", color=" + color + ", getPassengerÑapacity()=" + ", getLongBus()=" +  "]";
	}

	public int getPassengerÑapacity() {
		return passengerÑapacity;
	}

	public void setPassengerÑapacity(int passengerÑapacity) {
		this.passengerÑapacity = passengerÑapacity;
	}

	public int getLongBus() {
		return longBus;
	}

	public void setLongBus(int longBus) {
		this.longBus = longBus;
	}
	
	

}

package controlWork2.transport;

public class Bus extends Vehicle {

	 int passengerĐapacity;
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
		return "Bus [passengerĐapacity=" + passengerĐapacity + ", longBus=" + longBus + ", powerEngine=" + powerEngine
				+ ", color=" + color + ", getPassengerĐapacity()=" + ", getLongBus()=" +  "]";
	}

	public int getPassengerĐapacity() {
		return passengerĐapacity;
	}

	public void setPassengerĐapacity(int passengerĐapacity) {
		this.passengerĐapacity = passengerĐapacity;
	}

	public int getLongBus() {
		return longBus;
	}

	public void setLongBus(int longBus) {
		this.longBus = longBus;
	}
	
	

}

package controlWork2.transport;

public class Bus extends Vehicle {

	 int passenger�apacity;
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
		return "Bus [passenger�apacity=" + passenger�apacity + ", longBus=" + longBus + ", powerEngine=" + powerEngine
				+ ", color=" + color + ", getPassenger�apacity()=" + ", getLongBus()=" +  "]";
	}

	public int getPassenger�apacity() {
		return passenger�apacity;
	}

	public void setPassenger�apacity(int passenger�apacity) {
		this.passenger�apacity = passenger�apacity;
	}

	public int getLongBus() {
		return longBus;
	}

	public void setLongBus(int longBus) {
		this.longBus = longBus;
	}
	
	

}

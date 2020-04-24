package controlWork2.transport;

public class Avto extends Vehicle{
	
	String typeCarcass;
	int maxSpeed;

	@Override
	void drive() {
		System.out.println(" AVTO is driving");
	}

	@Override
	void stop() {
		System.out.println(" AVTO is stoping");
	}

	@Override
	public String toString() {
		return "Avto [typeCarcass=" + typeCarcass + ", maxSpeed=" + maxSpeed + ", powerEngine=" + powerEngine
				+ ", color=" + color + "]";
	}

	public String getTypeCarcass() {
		return typeCarcass;
	}

	public void setTypeCarcass(String typeCarcass) {
		this.typeCarcass = typeCarcass;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	

}

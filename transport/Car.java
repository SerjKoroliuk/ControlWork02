package controlWork2.transport;

public class Car extends Avto{
	
	private String salon;
	
	
	@Override
	void drive() {
		System.out.println(" CAR is driving");
	}

	@Override
	void stop() {
		System.out.println(" CAR is stoping");
	}

	@Override
	public String toString() {
		return "Car [salon=" + salon + ", typeCarcass=" + typeCarcass + ", maxSpeed=" + maxSpeed + ", powerEngine="
				+ powerEngine + ", color=" + color + "]";
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}
	
	

}

package controlWork2.transport;

public class Avtobus extends Bus{
	
	private String floor;
	
	@Override
	void drive() {
		System.out.println(" AVTOBUS is driving");
	}

	@Override
	void stop() {
		System.out.println(" AVTOBUS is stoping");
	}

	@Override
	public String toString() {
		return "Avtobus [floor=" + floor + ", passenger—apacity=" + passenger—apacity + ", longBus=" + longBus
				+ ", powerEngine=" + powerEngine + ", color=" + color + "]";
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	
	
	
}

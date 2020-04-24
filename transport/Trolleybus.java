package controlWork2.transport;

public class Trolleybus extends Bus{
	
	private String typeTrolly;

	@Override
	void drive() {
		System.out.println(" TROLLEYBUS is driving");
	}

	@Override
	void stop() {
		System.out.println(" TROLLEYBUS is stoping");
	}

	@Override
	public String toString() {
		return "Trolleybus [typeTrolly=" + typeTrolly + ", passenger—apacity=" + passenger—apacity + ", longBus="
				+ longBus + ", powerEngine=" + powerEngine + ", color=" + color + "]";
	}

	public String getTypeTrolly() {
		return typeTrolly;
	}

	public void setTypeTrolly(String typeTrolly) {
		this.typeTrolly = typeTrolly;
	}
	
	

}

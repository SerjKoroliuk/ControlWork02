package controlWork2.transport;

public class Track extends Avto{
	
	private int carrying;
	private int cargoVolume;
	
	
	
	@Override
	void drive() {
		System.out.println(" TRACK is driving");
	}

	@Override
	void stop() {
		System.out.println(" TRACK is stoping");
	}

	@Override
	public String toString() {
		return "Track [carrying=" + carrying + ", cargoVolume=" + cargoVolume + ", typeCarcass=" + typeCarcass
				+ ", maxSpeed=" + maxSpeed + ", powerEngine=" + powerEngine + ", color=" + color + "]";
	}

	public int getCarrying() {
		return carrying;
	}

	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}

	public int getCargoVolume() {
		return cargoVolume;
	}

	public void setCargoVolume(int cargoVolume) {
		this.cargoVolume = cargoVolume;
	}
	
	

}

package controlWork2.transport;

public class MainApp {

	public static void main(String[] args) {

		Vehicle[] vehicles = new Vehicle[30];

		for (int i = 0; i < vehicles.length; i++) {
			if (i <= 7) {
				vehicles[i] = new Avtobus();
			}
			if (i > 7 && i <= 14) {
				vehicles[i] = new Trolleybus();
			}
			if (i > 14 && i <= 22) {
				vehicles[i] = new Car();
			}
			if (i > 22 && i <= 29) {
				vehicles[i] = new Track();
			}
		}
		
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].drive();
		}

	}

}

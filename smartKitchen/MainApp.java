package controlWork2.smartKitchen;

public class MainApp {
	
	public static void main(String[] args) {
		
		SmartKitchen kitchen = new SmartKitchen(new Dishwasher(150, "metal"), new CoffeeMaker(25, 7), new Microwave(147,"Sensor switches"), new Juicer(69, 1.5));
		SmartKitchen kitchen2 = new SmartKitchen(new Dishwasher(150, "metal"), new CoffeeMaker(25, 7), new Microwave(147,"Sensor switches"), new Juicer(69, 1.5));
		SmartKitchen kitchen3 = new SmartKitchen(new Dishwasher(100, "plastic"), new CoffeeMaker(58, 9), new Microwave(99,"Mechanical switches"), new Juicer(51, 0.9));
		
		System.out.println(kitchen);
		System.out.println(kitchen2);
		System.out.println(kitchen3);
		
		System.out.println(kitchen.equals(kitchen2));
		System.out.println(kitchen2.equals(kitchen3));
		System.out.println(kitchen3.equals(kitchen));
		
		kitchen3.replace(new Dishwasher(150, "metal"), new CoffeeMaker(25, 7), new Microwave(147,"Sensor switches"), new Juicer(69, 1.5));
		System.out.println(kitchen3);
		
		System.out.println(kitchen.equals(kitchen2));
		System.out.println(kitchen2.equals(kitchen3));
		System.out.println(kitchen3.equals(kitchen));
		
	}

}

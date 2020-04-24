package controlWork2.smartKitchen;

public class CoffeeMaker {
	
	private int price;
	private int numberOfDrinks;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumberOfDrinks() {
		return numberOfDrinks;
	}
	public void setNumberOfDrinks(int numberOfDrinks) {
		this.numberOfDrinks = numberOfDrinks;
	}
	
	public CoffeeMaker(int price, int numberOfDrinks) {
		this.price = price;
		this.numberOfDrinks = numberOfDrinks;
	}
	@Override
	public String toString() {
		return "CoffeeMaker [price=" + price + ", numberOfDrinks=" + numberOfDrinks + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfDrinks;
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoffeeMaker other = (CoffeeMaker) obj;
		if (numberOfDrinks != other.numberOfDrinks)
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	

}

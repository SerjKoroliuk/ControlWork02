package controlWork2.smartKitchen;

public class Microwave {
	
	private int price;
	private String typeOfSwitches;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTypeOfSwitches() {
		return typeOfSwitches;
	}
	public void setTypeOfSwitches(String typeOfSwitches) {
		this.typeOfSwitches = typeOfSwitches;
	}
	
	public Microwave(int price, String typeOfSwitches) {
		this.price = price;
		this.typeOfSwitches = typeOfSwitches;
	}
	@Override
	public String toString() {
		return "Microwave [price=" + price + ", typeOfSwitches=" + typeOfSwitches + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((typeOfSwitches == null) ? 0 : typeOfSwitches.hashCode());
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
		Microwave other = (Microwave) obj;
		if (price != other.price)
			return false;
		if (typeOfSwitches == null) {
			if (other.typeOfSwitches != null)
				return false;
		} else if (!typeOfSwitches.equals(other.typeOfSwitches))
			return false;
		return true;
	}
	
	

}

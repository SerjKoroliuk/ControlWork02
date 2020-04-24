package controlWork2.smartKitchen;

public class Dishwasher {

	private int price;
	private String material;
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Dishwasher(int price, String material) {
		this.price = price;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Dishwasher [price=" + price + ", material=" + material + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
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
		Dishwasher other = (Dishwasher) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	

}

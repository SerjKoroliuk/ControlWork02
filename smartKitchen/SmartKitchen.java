package controlWork2.smartKitchen;

public class SmartKitchen {
	
	private Dishwasher dishwasher;
	private CoffeeMaker coffeeMaker;
	private Microwave microwave;
	private Juicer juicer;
	
	public Dishwasher getDishwasher() {
		return dishwasher;
	}
	public void setDishwasher(Dishwasher dishwasher) {
		this.dishwasher = dishwasher;
	}
	public CoffeeMaker getCoffeeMaker() {
		return coffeeMaker;
	}
	public void setCoffeeMaker(CoffeeMaker coffeeMaker) {
		this.coffeeMaker = coffeeMaker;
	}
	public Microwave getMicrowave() {
		return microwave;
	}
	public void setMicrowave(Microwave microwave) {
		this.microwave = microwave;
	}
	public Juicer getJuicer() {
		return juicer;
	}
	public void setJuicer(Juicer juicer) {
		this.juicer = juicer;
	}
	
	public SmartKitchen(Dishwasher dishwasher, CoffeeMaker coffeeMaker, Microwave microwave, Juicer juicer) {
		this.dishwasher = dishwasher;
		this.coffeeMaker = coffeeMaker;
		this.microwave = microwave;
		this.juicer = juicer;
	}
	@Override
	public String toString() {
		return "SmartKitchen [dishwasher=" + dishwasher + ", coffeeMaker=" + coffeeMaker + ", microwave=" + microwave
				+ ", juicer=" + juicer + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coffeeMaker == null) ? 0 : coffeeMaker.hashCode());
		result = prime * result + ((dishwasher == null) ? 0 : dishwasher.hashCode());
		result = prime * result + ((juicer == null) ? 0 : juicer.hashCode());
		result = prime * result + ((microwave == null) ? 0 : microwave.hashCode());
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
		SmartKitchen other = (SmartKitchen) obj;
		if (coffeeMaker == null) {
			if (other.coffeeMaker != null)
				return false;
		} else if (!coffeeMaker.equals(other.coffeeMaker))
			return false;
		if (dishwasher == null) {
			if (other.dishwasher != null)
				return false;
		} else if (!dishwasher.equals(other.dishwasher))
			return false;
		if (juicer == null) {
			if (other.juicer != null)
				return false;
		} else if (!juicer.equals(other.juicer))
			return false;
		if (microwave == null) {
			if (other.microwave != null)
				return false;
		} else if (!microwave.equals(other.microwave))
			return false;
		return true;
	}
	
	public void replace(Dishwasher dishwasher, CoffeeMaker coffeeMaker) {
		this.dishwasher = dishwasher;
		this.coffeeMaker = coffeeMaker;
	}
	public void replace(Dishwasher dishwasher, CoffeeMaker coffeeMaker, Microwave microwave) {
		this.dishwasher = dishwasher;
		this.coffeeMaker = coffeeMaker;
		this.microwave = microwave;
	}
	public void replace(Dishwasher dishwasher, CoffeeMaker coffeeMaker, Microwave microwave, Juicer juicer) {
		this.dishwasher = dishwasher;
		this.coffeeMaker = coffeeMaker;
		this.microwave = microwave;
		this.juicer = juicer;
	}
	
	
	
	
	
	
	

}

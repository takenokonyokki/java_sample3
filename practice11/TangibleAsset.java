public abstract class TangibleAsset extends Asset implements Thing {
	String name;
	int place;
	String color;
	double weight;
	
	public TangibleAsset(String name, int place, String color) {
		super(name, place);
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
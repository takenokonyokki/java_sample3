public abstract class Asset {
	String name;
	int place;
	
	public Asset(String name, int place) {
		this.name = name;
		this.place = place;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPlace() {
		return this.place;
	}
}
package 인소과_20221665_이찬송;

public class beverage {
	
	String type;
	String model;

	public beverage(String type, String model) {
		this.type = type;
		this.model = model;
	}
	public void drink() {
		System.out.println("마십니다.");
	}
	public String getType() {
		return type;
	}
	public String getModel() {
		return model;
	}
	

}
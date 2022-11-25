package 인소과_20221665_이찬송;

public class Coke extends beverage{
	
	String carbonated; 
	int kcal = 37;
	
	Coke(String model, String carbonated) {
		super("탄산 음료", model);
		this.model = model;
		this.carbonated = carbonated;
		
	}
	
	Coke(String model, String carbonated, int kcal) {
		super("탄산 음료", model);
		this.model = model;
		this.carbonated = carbonated;
		this.kcal = kcal;
		
	}
	
	public void Carbonateddrink() {
		System.out.println(carbonated + "인 " + model + "를 마십니다");
		
	}
	public String getCarbonated() {
		return carbonated;
	}
	public int getKcal() {
		return kcal;
	}
	
	


}
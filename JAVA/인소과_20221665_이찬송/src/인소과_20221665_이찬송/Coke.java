package �μҰ�_20221665_������;

public class Coke extends beverage{
	
	String carbonated; 
	int kcal = 37;
	
	Coke(String model, String carbonated) {
		super("ź�� ����", model);
		this.model = model;
		this.carbonated = carbonated;
		
	}
	
	Coke(String model, String carbonated, int kcal) {
		super("ź�� ����", model);
		this.model = model;
		this.carbonated = carbonated;
		this.kcal = kcal;
		
	}
	
	public void Carbonateddrink() {
		System.out.println(carbonated + "�� " + model + "�� ���ʴϴ�");
		
	}
	public String getCarbonated() {
		return carbonated;
	}
	public int getKcal() {
		return kcal;
	}
	
	


}
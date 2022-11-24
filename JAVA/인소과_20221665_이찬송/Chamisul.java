package 인소과_20221665_이찬송;

public class Chamisul extends Soju{
	
	String dilution; 
	int ABV = 16;
	
	Chamisul(String model, String dilution) {
		super("희석식 소주", model);
		this.model = model;
		this.dilution = dilution;
		
	}
	
	Chamisul(String model, String dilution, int ABV) {
		super("희석식 소주", model);
		this.model = model;
		this.dilution = dilution;
		this.ABV = ABV;
		
	}
	
	public void dilutiondrink() {
		System.out.println(model + " 소주 " + dilution + "를 마십니다");
		
	}
	public String getdilution() {
		return dilution;
	}
	public int getABV() {
		return ABV;
	}
	
	


}

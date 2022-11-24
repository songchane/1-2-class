package 인소과_20221665_이찬송;

public class ChamisulTest {
	public static void main(String[] args) {
		
		Chamisul fresh = new Chamisul("참이슬", "후레시", 16);
		
		System.out.println("타입:" + fresh.getType());
		System.out.println("도수:" + fresh.getABV());
		
		System.out.println("맛:" + fresh.getdilution());
		
		fresh.dilutiondrink();
	}


}

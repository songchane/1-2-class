package �μҰ�_20221665_������;

public class beverageTest {
	public static void main(String[] args) {
		
		Coke cola = new Coke("�ݶ�", "ź�� ����", 37);
		
		System.out.println("Ÿ��:" + cola.getType());
		System.out.println("Į�θ�:" + cola.getKcal());
		
		System.out.println("��:" + cola.getCarbonated());
		
		cola.Carbonateddrink();
	}


}
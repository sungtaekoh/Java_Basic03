package day09_method;

public class Ex05 {
	public static void main(String[] args) {
		Ex05Method ex = new Ex05Method();
		int s = ex.sumFunc(10, 20);
//		�޼ҵ尡 �ñ��ϸ� F5������ �� Ȯ���غ���
		
		System.out.println("�� �� : "+s);
		
		/*
		 ����� 
		 F5 : �ش� �޼ҵ� ���� ����
		 F6 : ���� �ٷ� �̵�
		 */
		
		System.out.println("=========================================================");
		ex.test(1);
		
		System.out.println("=========================================================");
		ex.test(2);
		String ss = ex.test02();
		System.out.println(ss);
		System.out.println(ex.test02());
	}
}

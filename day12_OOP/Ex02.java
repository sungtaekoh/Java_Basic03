package day12_OOP;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 sleep : ��� �������ִ� ���
		 */
		for(int i =0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500); 
				// ��ȣ���� ���ڸ�ŭ ����ض� ���� : 1000���� 1��, 1000 = 1��
				//�� ����� �������ؼ��� try,catch�� ������ �� ���־�� �Ѵ�.
			}catch (Exception e) {
			}
		}
		System.out.println("���� ����� ����!!!");
		
	}
}

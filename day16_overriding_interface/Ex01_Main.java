package day16_overriding_interface;

public class Ex01_Main {
	public static void main(String[] args) {
		/*
		  overriding
		 - ��ӹ��� �ڽ��� �޼ҵ��� ������ ����(������Ʈ)�ϴ� ��
		 
		 ����
		 - �θ� �޼ҵ��� ���İ� �����ϰ� �ڽ� �޼ҵ带 ����� ��
		 1) ��ȯŸ���� ���ƾ� �Ѵ�
		 2) �ŰԺ����� ������ Ÿ���� ���ƾ� �Ѵ�
		 3) ���� �����ڰ� �θ�� ���ų� Ŀ�� �Ѵ�.
		 
		 -private < package < protected < public
		 */
//		Ferrari fe = new Ferrari(2022, 350);
//		fe.speed();
		NewFerrari fe = new NewFerrari(2023,400);
		fe.speed();//�θ� �޼ҵ� ���
		fe.autoSystem();
	}
}

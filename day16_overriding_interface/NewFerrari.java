package day16_overriding_interface;

public class NewFerrari extends Ferrari {
	public NewFerrari(int ye, int speed) {
		super(ye, speed);
	}
	public void autoSystem() {
		System.out.println("�ڵ����� ��带 �����մϴ�");
	}
	public void speed() {//�θ��� �޼ҵ�� �Ȱ��� ���� �ڽİŰ� ������
		System.out.println(getYe()+"�� ��� �ӵ�"+getSpeed()+"km �Դϴ�");
		System.out.println("�ͺ� �������� �����մϴ�");
//		overriding : �θ� �ִ°Ϳ� ������ �޼ҵ带 ����� ������Ʈ �����ش�
	}
	
}

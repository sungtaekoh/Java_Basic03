package day16_overriding_interface;

public class Ferrari {
	private int ye, speed;
	
	public Ferrari(int ye, int speed) {
		this.ye = ye;
		this.speed = speed;
	}
	
	public void speed() {
		System.out.println(ye+"�� ��� �ӵ� "+speed+"km �Դϴ�");
	}
	public int getYe() {return ye;}
	public int getSpeed() {return speed;}
}

package day11_set_get;

public class Quiz02_1RadioMethod {
	private int channel = 0;
	private int volume = 0;
	
	public int getChannel() {
		if(channel>5 || channel < 0) {
			System.out.println("���� ä���Դϴ�. ������..");
		}else {
			return channel;
		}
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		if(volume>5) {
			System.out.println("�ʹ� ū �Ҹ��� ������ �Ͱ� ���Ŀ� �Ф�");
		}else {
			return volume;
		}
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void powerOff() {
		System.out.println("������ �����մϴ�.");
		return;
	}
	
	
}

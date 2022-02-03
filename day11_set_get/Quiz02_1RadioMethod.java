package day11_set_get;

public class Quiz02_1RadioMethod {
	private int channel = 0;
	private int volume = 0;
	
	public int getChannel() {
		if(channel>5 || channel < 0) {
			System.out.println("없는 채널입니다. 지지직..");
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
			System.out.println("너무 큰 소리로 들으면 귀가 아파요 ㅠㅠ");
		}else {
			return volume;
		}
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void powerOff() {
		System.out.println("전원을 종료합니다.");
		return;
	}
	
	
}

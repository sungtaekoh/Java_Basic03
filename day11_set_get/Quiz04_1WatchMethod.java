package day11_set_get;

public class Quiz04_1WatchMethod {
	private int hour =0, minute =0;
	private int month =0, day=0;
	private int alamHour =0, alamMinute =0;
	private int alamMonth =0, alamDay =0;
	
	
	
	
	public int getAlamHour() {
		return alamHour;
	}
	public void setAlamHour(int alamHour) {
		this.alamHour = alamHour;
	}
	public int getAlamMinute() {
		return alamMinute;
	}
	public void setAlamMinute(int alamMinute) {
		this.alamMinute = alamMinute;
	}
	public int getAlamMonth() {
		return alamMonth;
	}
	public void setAlamMonth(int alamMonth) {
		this.alamMonth = alamMonth;
	}
	public int getAlamDay() {
		return alamDay;
	}
	public void setAlamDay(int alamDay) {
		this.alamDay = alamDay;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void time() {
		System.out.println("���� �ð� : "+hour+"�� "+minute+"�� ");
	}
	
	public void day() {
		System.out.println("���� ��¥ : "+month+"�� "+day+"�� ");
	}
	
	public void alamTime() {
		System.out.println(alamHour+"�� "+alamMinute+"������ �˶��� �����Ǿ����ϴ�.");
	}
	
	public void alamDay() {
		System.out.println(alamMonth+"�� "+alamDay+"�� ���� ������ �����Ǿ����ϴ�.");
	}
	
	public void TimeCal() {//�˶� ���
		if(this.alamHour == this.hour && this.alamMinute == this.minute) {
			System.out.println("�˶��ð��Դϴ� �ߺ���!!!");
			System.out.println("��! ��! ��~! ������������~");
			return;
		}else {
			return;
		}
	}
	
	public void dayCal() {//�˶� ���
		if(this.alamMonth == this.month && this.alamDay == this.day) {
			System.out.println("�˶������ ��¥�Դϴ� �ߺ���!!!");
			System.out.println("��! ��! ��~! ������������~");
			return;
		}else {
			return;
		}
	}
	
	public void powerOff() {
		System.out.println("�����մϴ�");
		System.exit(0);
	}
}

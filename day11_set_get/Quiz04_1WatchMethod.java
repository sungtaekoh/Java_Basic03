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
		System.out.println("현재 시간 : "+hour+"시 "+minute+"분 ");
	}
	
	public void day() {
		System.out.println("현재 날짜 : "+month+"월 "+day+"일 ");
	}
	
	public void alamTime() {
		System.out.println(alamHour+"시 "+alamMinute+"분으로 알람이 설정되었습니다.");
	}
	
	public void alamDay() {
		System.out.println(alamMonth+"월 "+alamDay+"일 으로 일정이 설정되었습니다.");
	}
	
	public void TimeCal() {//알람 기능
		if(this.alamHour == this.hour && this.alamMinute == this.minute) {
			System.out.println("알람시간입니다 삐비비빅!!!");
			System.out.println("굿! 모! 닝~! 빠빠빠빠빠빠~");
			return;
		}else {
			return;
		}
	}
	
	public void dayCal() {//알람 기능
		if(this.alamMonth == this.month && this.alamDay == this.day) {
			System.out.println("알람맞춰둔 날짜입니다 삐비비빅!!!");
			System.out.println("굿! 모! 닝~! 빠빠빠빠빠빠~");
			return;
		}else {
			return;
		}
	}
	
	public void powerOff() {
		System.out.println("종료합니다");
		System.exit(0);
	}
}

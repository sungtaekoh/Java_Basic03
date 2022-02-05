package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * 타이머 클래스를 만드시오(DAte, SimpleDateformat 인스턴스로 생성해라)
 * (setter, getter을 이용해 만드시오.)
 * 현재의 시간을 1초씩 10번 출력 후 종료 클래스를 만드시오.
 */
public class TimerQuiz {
	private Date date;
	private SimpleDateFormat simpl;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public SimpleDateFormat getSimpl() {
		return simpl;
	}
	public void setSimpl(SimpleDateFormat simpl) {
		this.simpl = simpl;
	}

	
}

package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * Ÿ�̸� Ŭ������ ����ÿ�(DAte, SimpleDateformat �ν��Ͻ��� �����ض�)
 * (setter, getter�� �̿��� ����ÿ�.)
 * ������ �ð��� 1�ʾ� 10�� ��� �� ���� Ŭ������ ����ÿ�.
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

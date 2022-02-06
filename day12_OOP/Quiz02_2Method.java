package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz02_2Method {
	
	private Date date;
	private SimpleDateFormat simpl ;
	
	public void setDate() {
		date = new Date();
		simpl 
			= new SimpleDateFormat("yyyy�� mm�� dd�� aa hh�� mm�� ss��");
	}
	
	public String getDate() {
		
		return simpl.format(date);
	}

	public void display() {
		for(int i =0; i < 10 ; i++) {
			setDate();
			String s = getDate();
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
			}
			System.out.println(s);
		}
	}
}

package day15_Thread;

import java.awt.Container;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Quiz01_1MainClass {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Sungtaek's Timer");
		Container con = frame.getContentPane();
		JLabel lable = new JLabel("오올~라");
		frame.setVisible(true);//창 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SimpleDateFormat s = 
				new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		String str = null;
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				Date d = new Date();
				str = s.format(d);
				System.out.println(str);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}
}

package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
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
		
		//프레임 
		JFrame frame = new JFrame("Sungtaek's Timer");//jframe 만들기
		Container con = frame.getContentPane();//컨테이너 깔기
		frame.setPreferredSize(new Dimension(700, 200));//창크기
		frame.pack(); //크기 변경저장
		
		JLabel lable = new JLabel();//라벨 만들기
		con.add(lable);
		
		frame.setVisible(true);//창 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창 닫기 할때 콘솔종료
		
		Font font = new Font("Tempus San ITC", Font.ITALIC, 32);
		//(글꼴 , 글자 스타일, 폰트크기)
		
		lable.setFont(font);
		
		//시간기능
		SimpleDateFormat s = 
				new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		String str = null;
		
		for(int i=0; ;i++) {
			try {
				Thread.sleep(100);
				Date d = new Date();
				str = s.format(d);
				lable.setText(str);
//				System.out.println(str);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}
}

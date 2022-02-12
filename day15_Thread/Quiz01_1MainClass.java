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
		
		//������ 
		JFrame frame = new JFrame("Sungtaek's Timer");//jframe �����
		Container con = frame.getContentPane();//�����̳� ���
		frame.setPreferredSize(new Dimension(700, 200));//âũ��
		frame.pack(); //ũ�� ��������
		
		JLabel lable = new JLabel();//�� �����
		con.add(lable);
		
		frame.setVisible(true);//â ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â �ݱ� �Ҷ� �ܼ�����
		
		Font font = new Font("Tempus San ITC", Font.ITALIC, 32);
		//(�۲� , ���� ��Ÿ��, ��Ʈũ��)
		
		lable.setFont(font);
		
		//�ð����
		SimpleDateFormat s = 
				new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		
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

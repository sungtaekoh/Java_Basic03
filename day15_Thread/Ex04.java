package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TEST");
		
		Container c = frame.getContentPane(); //���� ���ε������ ����
		JLabel label = new JLabel("Hello GUI");
		c.add(label);
		
		frame.setLocation(1000, 200);
		//���� ������ �� ��ġ(����, ����) 
		
		frame.setPreferredSize(new Dimension(500, 200));
//		ũ�� ���� (����, ����)
//		dimension�� ����ؼ� ���� �־��־߸� �Ѵ� 
		frame.pack();
//		ũ�� ����� ����������
		
		Font font = new Font("Tempus San ITC", Font.ITALIC, 32);
		//(�۲� , ���� ��Ÿ��, ��Ʈũ��)
		
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);//â ���
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�ܼ� ���� ���ִ� ���
		
		for(int i=0; ; i++) {
		label.setText(i+"�ȳ��ϼ���");
		//label ���뺯��, �۾�����
		}
	}
}

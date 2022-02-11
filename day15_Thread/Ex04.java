package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TEST");
		
		Container c = frame.getContentPane(); //집을 예로들었을때 장판
		JLabel label = new JLabel("Hello GUI");
		c.add(label);
		
		frame.setLocation(1000, 200);
		//실행 시켰을 떄 위치(가로, 세로) 
		
		frame.setPreferredSize(new Dimension(500, 200));
//		크기 조정 (가로, 세로)
//		dimension을 사용해서 값을 넣어주야만 한다 
		frame.pack();
//		크기 변경된 내용을저장
		
		Font font = new Font("Tempus San ITC", Font.ITALIC, 32);
		//(글꼴 , 글자 스타일, 폰트크기)
		
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);//창 띄움
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//콘솔 실행 꺼주는 기능
		
		for(int i=0; ; i++) {
		label.setText(i+"안녕하세요");
		//label 내용변경, 글씨스기
		}
	}
}

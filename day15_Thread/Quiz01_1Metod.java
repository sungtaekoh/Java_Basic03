package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Quiz01_1Metod {
	
}

class Timer{
	public void timerDisplay() {
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
//						System.out.println(str);
					}catch (Exception e) {
						// TODO: handle exception
					}
				}
				
				
	}
}

class Win7{
	
	public void win7Display() {
	
		Scanner input = new Scanner(System.in);	
		HashMap map = new HashMap();
		
		int choice2 = 0;
		String s = null; //��� �Է�
		
		map.put("�޸���", "notepad");
		map.put("����", "calc");
		
		while(true) {
			System.out.println(" ===== ȯ���մϴ� =====");
			System.out.println("1.���");
			System.out.println("2.off");
			System.out.println("�Է� : ");
			choice2 = input.nextInt();
			switch(choice2) {
			case 1:
				System.out.println("��밡�� ���");
				System.out.println("�޸���, ����");
				System.out.println("�Է� : ");
				s = input.next();
				if(map.containsKey(s) == true) {
					ProcessBuilder pro = new ProcessBuilder((String)map.get(s));
					try {
						System.out.println(s+"�� ����˴ϴ�");
						pro.start();
					}catch (Exception e) {
						// TODO: handle exception
					}
				}else {
					System.out.println("�� ���� �Է��Դϴ�.");
				}
				break;
			case 2:
				System.out.println("Win7�� �����մϴ�.");
				break;
			}
			
		}
			
		
		
	}
	
	
}



class LoginGame {
	Scanner input = new Scanner(System.in);
	Timer t = new Timer();
	Win7 win7 = new Win7();
	
	ArrayList saveId = new ArrayList();
	ArrayList savePw = new ArrayList();
	
	boolean bool1 = true;
	boolean bool2 = true;
	int choice1 = 0;
	String id = null;
	String pw = null;
	
	
	public void newLog() {
		
		System.out.println("���̵� �Է� : ");
		id = input.next();
		if(saveId.indexOf(id) == -1) {
			saveId.add(id);
		System.out.println("��й�ȣ �Է� : ");
			pw= input.next();
		savePw.add(pw);
		System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.");
		}else {
		System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
		}
	}
	
	public void login() {
		System.out.println("���̵� �Է� :");
		id = input.next();
		System.out.println("��й�ȣ �Է� : ");
		pw = input.next();
		if(saveId.indexOf(id) != -1 && savePw.indexOf(pw) != -1) {
			System.out.println("�α��ο� �����ϼ̽��ϴ�");
			
			//�ΰ� �� �Ѱ��� �޼ҵ常 �۵��Ѵ�.. ��..??
			win7.win7Display();
			t.timerDisplay();
			
		}else {
			System.out.println("�α��ο� �����ϼ̽��ϴ�.");
		}
	}
	
	public void loginDisplay() {

		while(true) {
			System.out.println("1.�α��� 2.���� 3.�α׾ƿ�");
			System.out.println(">>>");
			choice1 = input.nextInt();
			switch(choice1) {
			case 1://�α���
				login();
				break;
			case 2://����
				newLog();
				break;
			case 3://�α׾ƿ�
				System.out.println("�α����� �����մϴ�.");
				System.exit(0);
			}
		}
	}
	
	
}




package day16_overriding;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 1. �α����ϸ� ������ �����ϰ� �ð��� �귯����
 2. off�� �����ϸ� �������� ����� �ð��� ��µǰ� ���׷��̵� ����
 
 �ش���
 */
class TimerQuiz extends Thread{ //���� ����� �ȵǼ� TimerQuiz�� ��ӽ��״�
	private Date date;
	private SimpleDateFormat simpl;
	public void setDate() {
		date = new Date();
		simpl = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
	}
	public String getDate() {return simpl.format(date);}
	public void time() {
		for(int i=0;i<10;i++) {
			setDate();
			String s = getDate();
			System.out.println(s);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {//�̰� ����?
			}
		}
	}
}

class Win7Quiz extends TimerQuiz{
	private String[] name;
	private String[] info;
	public Win7Quiz(String c, String m, String cPath, String mPath) {
		name = new String[2];
		name[0] = c;
		name[1] =m;
		info = new String[2];
		info[0] = cPath;
		info[1] = mPath;
	}
	public void function(String funcName) {
		String[] name = getName1();
		String[] info = getInfo();
		HashMap map = new HashMap();
		for(int i=0;i<name.length;i++) {
			map.put(name[i], info[i]);
		}
		if(map.containsKey(funcName)) {
			System.out.println(map.get(funcName)+"��� �մϴ�");
		}else {
			System.out.println("���� ����Դϴ�");
		}
	}
	public void funcPrint() {
		System.out.println("[��� ����] : "  );
		String[] name = getName1();
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+" ");
		}
		System.out.println();
	}
	public String[] getName1() {return name;}
	public String[] getInfo() {return info;}
	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("===== ȯ���մϴ� ======");
		int sel =0;
		String funcName=null;
		while(true) {
			System.out.println("1.���");
			System.out.println("2.off");
			System.out.println("�Է� >>>");
			sel = input.nextInt();
			switch(sel) {
			case 1 :
				funcPrint();
				System.out.println("����� ��� �Է� : ");
				funcName = input.next();
				function(funcName);
				break;
			case 2:
				return;
			}
		}
	}
}
/*
 ���� ���Ͱ� �����带 ��ӹ����� �޼ҵ��� �̸��� �ߺ��Ǵ� �͵��� �־� ������ �߻��Ѵ�
 �������̵��� �Ǵµ� ���� Ÿ���� �ٸ��ٰ� �ؼ� ���� �߻�
 �׷��� �̸��� getId1 �ڿ� ���� 1�� �ٿ��� �����ߴ�
 */

class Login extends Win7Quiz{
	private String userId = null, userPw=null;
	public Login(String c, String m, String cPath, String mPath) {
		super(c, m, cPath, mPath);
	}
	public int compare(String id, String pw) {
		if(getUserId() != null && getUserPw() != null)
			if(getUserId().equals(id) && getUserPw().equals(pw))
				return 0;
			else return 1;
		return 1;
	}
	public void saveId_Pw(String id, String pw) {
		setUserId(id); setUserPw(pw);}
	public boolean out() {return false;}
	public String getUserId() {return userId;}
	public void setUserId(String id) { this.userId = id; }
	public String getUserPw() { return userPw; }
	public void setUserPw(String pw) { this.userPw = pw;}
	}

class MyJframe extends TimerQuiz{
	JFrame frame;
	Container c;
	JLabel label;
	Font font;
	public MyJframe() {
		frame = new JFrame("Time");
		c = frame.getContentPane();
		label = new JLabel();
		font = new Font(null, 0, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		c.add(label);
		frame.setLocation(1000, 200);//ȭ�� ��ġ
		frame.setPreferredSize(new Dimension(500, 200 ));//������ ũ��
		frame.pack(); //������ ���� �����ϱ�
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void run() {
		for(int i=0; ;i++) {
			try {
				Thread.sleep(1000);
				super.setDate();
				label.setText(super.getDate());
			}catch (InterruptedException e) {
			}
			
		}
	}
}
// ���� ���̵� �ڵ�
class NewMyJframe extends MyJframe{
	private int second;
	public static boolean FLAG = true;
	public NewMyJframe() {second=0;}
	public void run() {
		while(FLAG) {
			second++;
			try {
				Thread.sleep(1000);
				super.setDate();
				label.setText(super.getDate());
			}catch (InterruptedException e) {}
		}
		int reHour = second/ (60*60);
		int reSecond = second % (60*60);
		int reMinute = reSecond / 60;
		reSecond = reSecond % 60;
		label.setText(reHour+"��"+reMinute+"��"+reSecond+"�� ���");
		System.out.println("�� �ð� : "+second);
	}
}
//=============================
public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NewMyJframe mf = null; //�����ڵ�
		int num =0, result=0;
		String inputId = null, inputPw = null;
		Login lo = new Login("����","�޸���","calc.exe","notpad.exe");
		boolean flag =true;
		lo.time();
		
		while(flag) {
			System.out.println("1.�α��� 2.���� 3.�α׾ƿ� \n>>>");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("���̵� �Է� : ");
				inputId = input.next();
				System.out.println("��й�ȣ �Է� : ");
				inputPw = input.next();
				result = lo.compare(inputId, inputPw);
				if(result == 0 ) {
					System.out.println("���� ���");
					mf = new NewMyJframe(); // �����ڵ�
					mf.setDaemon(true);
					mf.start();
					lo.display();
					NewMyJframe.FLAG = false; //�����ڵ�
					System.out.println("���α׷� ����");
					return;
				}else 
					System.out.println("���� ����");
					case 2:
						System.out.println("���� id : ");
						inputId = input.next();
						System.out.println("���� pw : ");
						inputPw = input.next();
						lo.saveId_Pw(inputId, inputPw);
						System.out.println("���� �Ϸ�");
						break;
					case 3:
						flag = lo.out();
						System.out.println("���� �մϴ�");
			}
		}
	}
}

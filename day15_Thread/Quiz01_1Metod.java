package day15_Thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz01_1Metod {
	
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



class LoginGame extends Win7{
	Scanner input = new Scanner(System.in);
	
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
			win7Display();
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




package Quiz;

import java.util.HashMap;
import java.util.Scanner;
//win7 ��� �����
public class day15Quiz01_2Method {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	HashMap map = new HashMap();
	
	String s = null;
	
	map.put("����", "calc");
	map.put("�޸���", "notepad");
	
	int choice2 =0;//win7 �ʱ� ���� ��
	
	while(true) {
		System.out.println("===== ȯ���մϴ� ======");
		System.out.println("1.���");
		System.out.println("2.off");
		System.out.println(">>>");
		choice2 = input.nextInt();
		switch (choice2) {
		case 1://���
			System.out.println("[��� ����]");
			System.out.println("���� �޸���");
			System.out.println("��� ��� �Է� : ");
			s = input.next();
			if(map.containsKey(s)== true) {
				ProcessBuilder pro 
				= new ProcessBuilder((String)map.get(s));
				try {
					pro.start();
				}catch (Exception e) {
				}
			}else {
				System.out.println("�� ���� �Է��Դϴ�");
			}
			break;

		case 2://off
			break;
		}
		
	}
	
}
}

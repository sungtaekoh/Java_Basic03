package Quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class win7{
	public void win7Display(){
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		
		String s = null;
		int choice2 = 0;
		map.put("�޸���", "notepad");
		map.put("����", "calc");
		
		while(true) {
			System.out.println("===== ȯ���մϴ� =====");
			System.out.println("1.���");
			System.out.println("2.off");
			choice2 = input.nextInt();
			switch(choice2) {
			case 1://���
				System.out.println("[��밡��]");
				System.out.println("���� �޸���");
				s = input.next();
				if(map.containsKey(s)==true) {
					ProcessBuilder pro 
					= new ProcessBuilder((String)map.get(s));
					try {
						pro.start();
					}catch (Exception e) {
					}
				}else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
				break;
			case 2://off
				break;
			}
		}
	}
}
public class day15Quiz01_2MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList saveId = new ArrayList();
		ArrayList savePw = new ArrayList();
		String id = null;
		String pw = null;
		
		int choice1 = 0;
		
		while(true) {
			System.out.println("1.�α��� 2.���� 3.�α׾ƿ�");
			System.out.println(">>>");
			choice1= input.nextInt();
			switch(choice1) {
			case 1://1.�α���
				System.out.println("���̵� �Է� : ");
				id = input.next();
				System.out.println("��й�ȣ �Է� : ");
				pw = input.next();
				if(saveId.indexOf(id)!= -1 && savePw.indexOf(pw) != -1) {
					System.out.println("���� ���");
				}else {
					System.out.println("���� �Ұ�");
				}
				break;
			case 2://2.����
				System.out.println("���� id : ");
				id = input.next();
				if(saveId.indexOf(id)== -1) {
					saveId.add(id);
				System.out.println("���� pw : ");
				pw = input.next();
					savePw.add(pw);
				}else {
					System.out.println("�̹� �����ϴ� ���̵��Դϴ�");
				}
				break;
			case 3://3.�α׾ƿ�
				if(saveId.indexOf(id)!= -1 && savePw.indexOf(pw) != -1) {
					System.out.println("�α׾ƿ��մϴ�");
					System.out.println("�ý����� �����մϴ�");
					System.exit(0);
				}else {
					System.out.println("�ý����� �����մϴ�");
					System.exit(0);
				}
				break;
			}
		}
	}
}

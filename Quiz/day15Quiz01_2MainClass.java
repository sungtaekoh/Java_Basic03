package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

/*
 �α����� win7�� ��ӽ��Ѷ�
 ���� ����� ������ ����
 */
 public class day15Quiz01_2MainClass {
	 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 ArrayList saveId = new ArrayList();
	 ArrayList savePw = new ArrayList();
	 
	 String id = null;
	 String pw = null;
	 int choice = 0;
	 
	 while(true) {
	System.out.println("1.�α��� 2.���� 3.�α׾ƿ�");
	choice = input.nextInt();
	switch (choice) {
	case 1://1.�α���
		System.out.println("���̵� �Է� : ");
		id = input.next();
		System.out.println("��й�ȣ �Է� : ");
		pw = input.next();
		if(saveId.indexOf(id)!=-1 && savePw.indexOf(pw) != -1) {
			System.out.println("���� ���");
		}else {
			System.out.println("������ �����ϼ̽��ϴ�");
		}
		break;
	case 2://2.����
		System.out.println("���� id : ");
		id = input.next();
		if(saveId.indexOf(id) == -1) {
			saveId.add(id);
		System.out.println("���� pw : ");
		pw = input.next();
		savePw.add(pw);
		}else {
			System.out.println("�̹� �����ϴ� ���̵��Դϴ�");
		}
		break;
	case 3://3.�α׾ƿ�
		System.out.println("�α׾ƿ��մϴ�");
		System.out.println("���α׷��� ����˴ϴ�.");
		System.exit(0);
		break;
	}
	 }
	 
	 
	 
	 
}

}

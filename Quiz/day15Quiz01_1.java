package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

/*
 �α����� win7�� ��ӽ��Ѷ�
 ��������� ������ ����
*/
public class day15Quiz01_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList saveId = new ArrayList();
		ArrayList savePw = new ArrayList();
		String id = null;
		String pw = null;
		int choice = 0;
		
		while(true) {
		System.out.println("1.�α��� 2.���� 3.�α׾ƿ�");
		System.out.println(">>>");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("���̵� �Է� : ");
			id = input.next();
			System.out.println("��й�ȣ �Է� : ");
			pw = input.next();
			if(saveId.indexOf(id) != -1 && savePw.indexOf(pw) != -1) {
				System.out.println("�α��ο� �����ϼ̽��ϴ�");
			}else {
				System.out.println("�� ���� ���̵��Դϴ�");
			}
			break;
		case 2:
			System.out.println("���̵� �Է� :");
			id = input.next();
			if(saveId.indexOf(id)==-1) {
			System.out.println("��й�ȣ �Է� :");
			pw = input.next();
			saveId.add(id);
			savePw.add(pw);
			}else {
				System.out.println("�̹� �����ϴ� ���̵��Դϴ�");
			}
			break;
		case 3:
			System.out.println("���α׷��� �����մϴ�");
			System.exit(0);
			break;
		}
		}
	}
}

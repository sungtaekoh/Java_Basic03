package day11_set_get;

import java.util.Scanner;
/*
 this.get.set�� Ȱ���Ͽ� �α���â �����
 */
public class Quiz01_3MainClass {//���� �ٽ� Ǭ ������
	public static void main(String[] args) {
		Quiz01_3Method ex = new Quiz01_3Method();
		Scanner input = new Scanner(System.in);
		
		String id = null;
		String pw = null;
		boolean bool = true;
		
		while(bool) {
			System.out.print("1.�α���  ");
			System.out.print("2.����  ");
			System.out.println("3.�α׾ƿ�");
			System.out.println(">>>");
		int num = input.nextInt();	
		switch(num) {
		case 1:
			System.out.println("���̵� �Է� : ");
				id = input.next();
			System.out.println("��й�ȣ �Է� : ");
				pw = input.next();
			ex.cal(id, pw);
			break;
		case 2://ȸ������ 
			System.out.println("���̵� �Է� : ");
				id = input.next();
			System.out.println("��й�ȣ �Է� : ");
			 	pw = input.next();
			ex.setSaveId(id);
			ex.setSavePw(pw);
			System.out.println("ȸ�����Կ� �����ϼ̽��ϴ�.");
			break;
		case 3: //�α׾ƿ�
			System.out.println("�α׾ƿ��մϴ�");
			bool = false;
		}
		}
		
	}
}

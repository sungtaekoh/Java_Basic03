package day13_Constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01_1MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz01_1Method ex = new Quiz01_1Method ();
		
		ArrayList saveId = new ArrayList();
		ArrayList savePw = new ArrayList();
		
		boolean bool = true;
		String newId = null;
		String newPw = null;
		String logId = null;
		String logPw = null;
		
		while(bool) {
		System.out.println("1.�α��� 2.���� 3.�α׾ƿ�");
		System.out.println(">>>");
		int num1 = input.nextInt();
		if(num1 == 1) {//�α���
			System.out.println("���̵� �Է� : ");
			logId = input.next();
			System.out.println("��й�ȣ �Է� : ");
			logPw = input.next();
			if(saveId.indexOf(logId) != -1 && savePw.indexOf(logPw) != -1) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("�α��� ����");
			}
		}else if(num1 == 2) {//����
			System.out.println("������ id�� �Է��� �ּ��� : ");
			newId = input.next();
			if(saveId.indexOf(newId) == -1) {
				saveId.add(newId);
			System.out.println("������ pw�� �Է��� �ּ��� : ");
				newPw = input.next();
				savePw.add(newPw);
				System.out.println("���Կ� �����ϼ̽��ϴ�.");
			}else if(saveId.indexOf(newId) != -1) {
				System.out.println("�̹� �����ϴ� ���̵��Դϴ�");
			}else {
				
			}
		}else if(num1 == 3) {//�α׾ƿ�
			
		}else {//�� �� �Է�
			System.out.println("�� ���� �����Դϴ�. ");
		}
		
		}
	}
}

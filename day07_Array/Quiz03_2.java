package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;


public class Quiz03_2 {//����
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList telNum = new ArrayList(); //��ȭ��ȣ�� ��ȣ 
		ArrayList telName = new ArrayList(); //��ȭ��ȣ�� �̸�
		int choice = 0; //�ʱ� ����
		String name = null;//�ʱ� �̸� ����
		int num = 0; //�ʱ� ��ȣ����
		int i=0;//�� ��� �� �� ���
		
		while(true) {
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.println(">>>");
			choice = input.nextInt();
			if(choice == 1) { //����ó ���
				System.out.println("�̸� �Է� : ");
				name = input.next();
				telName.add(name);
				System.out.println("����ó �Է� : ");
				num = input.nextInt();
				telNum.add(num);
				System.out.println("���������� ����Ǿ����ϴ�.");
				System.out.println(telNum.get(0)+"�� �����Ͽ����ϴ�");
				System.out.println("���������� ���� �Ǿ����ϴ�!!");
			}else if(choice == 2) {//����ó ����
				System.out.println("ã�� �̸� �Է� : ");
				name = input.next();
			}else if (choice == 3) {//����ó ����
				System.out.println("������ ");
			}else if(choice == 4) {//��� ����ó ����
				System.out.println("��� ����ó ����");
			}else if(choice == 5) {//����
				System.out.println("����");
			}
		}
	}
}

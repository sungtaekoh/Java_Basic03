package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03_6MainClass {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	ArrayList phName = new ArrayList();//��ȭ��ȣ �̸�
	ArrayList phNum = new ArrayList();//��ȭ��ȣ
	
	boolean bool = true;
	int choice = 0;
	String name = null;
	int num = 0;
	
	while(bool) {
		System.out.println("1.����ó ���");
		System.out.println("2.����ó ����");
		System.out.println("3.����ó ����");
		System.out.println("4.��� ����ó ����");
		System.out.println("5.����");
		System.out.println(">>>");
		choice = input.nextInt();
		if(choice ==1 ) {//����ó ���
			System.out.println("������ �̸��� �Է��� �ּ���. :");
			name = input.next();
			if(phName.indexOf(name) == -1) {
				phName.add(name);
				System.out.println("��ȭ��ȣ�� �Է��� �ּ��� :");
				num = input.nextInt();
				phNum.add(num);
				System.out.println("���������� ����Ǿ����ϴ�.");
			}else {
				System.out.println("�̹� �ִ� �̸��Դϴ�.");
				System.out.println("�ٽ� �Է��� �ּ���. :");
			}
		}else if(choice ==2) {//����ó ����
			System.out.println("ã�� �̸� �Է� : ");
			name = input.next();
			if(phName.indexOf(name)!=-1) {
				int n = phName.indexOf(name);
				System.out.print(phName.get(n)+ " : ");
				System.out.println(phNum.get(n));
			}else {
				System.out.println("���� �̸��Դϴ�.");
			}
		}else if(choice ==3) {//����ó ����
			System.out.println("������ �̸� �Է� : ");
			name = input.next();
			if(phName.indexOf(name)!=-1) {
				int n = phName.indexOf(name);
				phName.remove(n);
				phNum.remove(n);
				System.out.println("���������� "+name+"���� ���� �Ǿ����ϴ�.");
			}else {
				System.out.println("���� �̸��Դϴ�.");
			}
		}else if(choice ==4) {//��� ����ó ����
			for(int i =0;i<phName.size();i++) {
				System.out.print(phName.get(i)+":");
				System.out.println(phNum.get(i));
			}
		}else if(choice ==5) {//����
			System.out.println("�����մϴ�.");
			return;
		}
	}
}
}

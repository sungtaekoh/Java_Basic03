package day06_interface_ex;

import java.util.Scanner;

//interface�� ����ϴ� ����� ����� implements�� ����Ѵ�
// interface�� ��� �ް� �Ǹ� interface A������ ������ ������ �������̵��� ���־�߸� �Ѵ�
class B���� implements A����{
	public void �Ѿ˱���() {
		System.out.println("�Ѿ��� ���� �մϴ�");
	}
	public void attack() {
		�Ѿ˱���();
		System.out.println("������ ���� �մϴ�");
	}
	public void ��������() {
		System.out.println("���и� �����մϴ�");
	}
	public void defense() {
		��������();
		System.out.println("������ ��� �մϴ�");
	}
}
class B���� implements A����{
	public void attack() {
		System.out.println("������ ���� �մϴ�");
	}
	public void defense() {
		System.out.println("������ ��� �մϴ�");
	}
}
public class Ex02 {
	public static void main(String[] args) {
//		B���� ���� = new B����();
//		B���� ���� = new B����();
		A���� ���� = null;
		System.out.println("���� ó��� �Խ��ϴ�");
		System.out.println("1.���� 2.����");
		int choice =0;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num == 1) {
			System.out.println("���� ����");
			���� = new B����();
			}
		else { 
			System.out.println("���� ����");
			���� = new B����();
		}
		System.out.println("1.���� 2.���");
		choice = input.nextInt();
		if(choice == 1) ����.attack();
		else ����.defense();
		/*
		if(choice ==1 && num ==1) ����.attack();
		else if(choice == 2 && num ==1) ����.defense();
		if(choice ==1 && num ==2) ����.attack();
		else if(choice ==2 && num ==2) ����.defense();
	*/
	}
}

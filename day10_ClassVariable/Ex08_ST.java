package day10_ClassVariable;

import java.util.Scanner;
/*
 * �ν��Ͻ� ������ ����
 * �Է�, ��� ������� ��������
 */
public class Ex08_ST {
	int age;
	String name;
	public void display() {//�Է� - �Էµ� ���� �ν��Ͻ��� ����
		Scanner input = new Scanner(System.in);
		System.out.println("�̸� �Է� : ");
		name = input.next();
		System.out.println("���� �Է� : ");
		age = input.nextInt();
		print();
	}
	public void print() {//��� �Է±���� ���� ����� �ν��Ͻ� ���� �ҷ��� �����
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}

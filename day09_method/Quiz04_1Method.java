package day09_method;

import java.util.Scanner;

/*
 * ���� �Է� �޾� �Ҽ��� �Ǻ��ϴ� �Լ� ����
 * 
 * �Ҽ�: 1�� �ڽſ��� ���� ������ ���� �ʴ� ��
 * 2,3�� ����� �ƴѰ��� ���� �Ҽ��̴�
 */
public class Quiz04_1Method {
	
	public void display() {//�Է�
	Scanner input = new Scanner(System.in);
	System.out.println("�� �Է� : ");
	int num1 = input.nextInt();
	int result = cal(num1);
	print(num1, result);
	}
	public int cal(int num1) {//����
	if(num1 ==2) {
//		System.out.println("�Ҽ� : "+2);
		return 1;
	}else if(num1 == 3) {
//		System.out.println("�Ҽ� : "+3);
		return 2;
	}else if(num1%2!=0 && num1%3!=0) {
//		System.out.println("�Ҽ� : "+num1);
		return 3;
	}else {
//		System.out.println("�Ҽ��� �ƴմϴ�.");	
		return 4;
}
	}
	public void print(int n1, int n) {//���
		if(n==1) {
			System.out.println("�Ҽ� : "+2);
		}else if(n==2) {
			System.out.println("�Ҽ� : "+3);
		}else if(n==3) {
			System.out.println("�Ҽ� : "+n1);
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�.");	
		}
	}
	
	
}


package day09_method;

import java.util.Scanner;

/*
 ���밪�� ���ϴ� �Լ��� �����Ͻÿ�
 */
public class Quiz05_1Method {
	public void display() {
	Scanner input = new Scanner(System.in);
	System.out.println("�� �Է� : ");
	int num1 = input.nextInt();
	int result = cal(num1);
	print(result, num1);
	}
	public int cal(int num1) {
	if(num1>0) {
//		System.out.println("���� : "+num1);
		return 1;
	}else if(num1<0) {
//		System.out.println("���� : "+(num1*-1));
		return 2;
	}
		else {
			return 3;
		}
	}
	
	
	public void print(int result, int num1) {
		if(result ==1) {
			System.out.println("���� : "+num1);
		}else if(result == 2) {
			System.out.println("���� : "+(num1*-1));
		}else {
			System.out.println("�� ���� �Է��Դϴ�.");
		}
	}
}

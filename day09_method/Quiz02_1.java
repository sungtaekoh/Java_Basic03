package day09_method;

import java.util.Scanner;

public class Quiz02_1 {
	/*
	public void print() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("�� �Է� : ");
		num = input.nextInt();  //�Է¹޴� ���
		if(num%2 ==0 ) {//�����ϴ� ���
			System.out.println("¦��");//����ϴ� ��� 
		}else {
			System.out.println("Ȧ��");
		}
	}
	*/
	public void print() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("�� �Է� : ");
		num = input.nextInt();  //�Է¹޴� ���
//		String s = op(num);
//		���(s);
		int reulst = op(num);
		���(reulst);
	}
	public void ���(int r) {
		if(r ==0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
	}
	public int op(int num) {
		if(num%2 ==0 ) {//�����ϴ� ���
//			System.out.println("¦��");//����ϴ� ��� 
//			return "¦��";
			return 0; //�Ϲ������δ� ���ں��� ���ڷ� �����ش�
		}else {
//			System.out.println("Ȧ��");
//			return "Ȧ��";
			return 1;
		}
	}
	public void ���(String result) { //�����δ� �ѱ۷� ����� �ȵȴ� �̰� ����
		System.out.println();
	}
	
	
}

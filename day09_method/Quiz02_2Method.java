package day09_method;

import java.util.Scanner;

/*
 * �Է� �޴� ���� ¦������ Ȧ������ �Ǻ��ϴ� �Լ� ����
 */
public class Quiz02_2Method {
	public void input() {//�Է�
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int num1 = input.nextInt();
		int result = cal(num1);
		print(result);
	}
	public int cal(int n1) {
		if(n1%2==1) {//Ȧ��
			return 1;
		}else if(n1%2==0) {//¦��
			return 2;
		}else {//�� ���� �Է�
			return 3;
		}
	}
	public void print(int n1) {//���
		if(n1 ==1 ) {
			System.out.println("Ȧ��");
		}else if(n1 ==2) {
			System.out.println("¦��");
		}else {
			System.out.println("�� ���� �Է�");
		}
	}
}

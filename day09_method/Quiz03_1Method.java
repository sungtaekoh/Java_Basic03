package day09_method;

import java.util.Scanner;

/*
 * 3�� ����� �Ǻ��ϴ� �Լ��� ����� �� �Լ��� �̿��Ͽ� main���� 3�� ����� ����Ͻÿ�
 */
public class Quiz03_1Method {
	public void input() {//�Է�
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int num1 = input.nextInt();
		int result = cal(num1);
		print(result);
	}
		
	public int cal(int n1) {//����
		if(n1 %3 == 0) {//3�� ����̴�
			return 0;
		}else {//3�� ����� �ƴϴ�
			return 1;
		}
	}
	
	public void print(int n1) {
		if(n1 == 0 ) {
			System.out.println("3�� ��� �Դϴ�.");
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
	}
}

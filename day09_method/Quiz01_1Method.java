package day09_method;

import java.util.Scanner;

/*
 * �� ���� �Է� �޾� ū ���� ����ϴ� �Լ��� ����ÿ�
 */
public class Quiz01_1Method {
	public void input() {//�Է�
	int num1 = 0 ;
	int num2 = 0 ;
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		num1 = input.nextInt();
		System.out.println("�� �Է� : ");
		num2 = input.nextInt();
		 int result= cal(num1, num2);
		 print(num1, num2, result);
	}
	public int cal(int n1, int n2) {//���
		if(n1>n2) {
			return 1;
		}else if(n1<n2) {
			return 2;
		}else{
			return 3;
		}
		
	}
		
	public void print(int n1, int n2, int n3){
		if(n3 == 1) {
			System.out.println("num1 : "+n1);
		}else if(n3 == 2) {
			System.out.println("num2 : "+n2);
		}else {
			System.out.println("���� : ");
		}
	}

}

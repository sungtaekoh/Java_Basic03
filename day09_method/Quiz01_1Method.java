package day09_method;

import java.util.Scanner;

/*
 * �� ���� �Է� �޾� ū ���� ����ϴ� �Լ��� ����ÿ�
 */
public class Quiz01_1Method {
	public void test01() {
	int num1 = 0 ;
	int num2 = 0 ;
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		num1 = input.nextInt();
		System.out.println("�� �Է� : ");
		num2 = input.nextInt();
		if(num1>num2) {
			System.out.println(num1);
		}else if(num1<num2) {
			System.out.println(num2);
		}else if(num1 == num2) {
			System.out.println(num1);
		}
	}

}

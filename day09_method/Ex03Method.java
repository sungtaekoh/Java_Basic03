package day09_method;

import java.util.Scanner;

public class Ex03Method {
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num=0, su, sum;
		System.out.println("ù �� �Է� : ");
		num = input.nextInt();
		System.out.println("�� �� �Է�  : ");
		su = input.nextInt();
		sum = num + su;
		System.out.println("�� �� : "+sum);
	}

}

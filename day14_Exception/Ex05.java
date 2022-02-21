package day14_Exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("���� �Է� :");
		try {
			age = input.nextInt();
			if(age < 0) {
				throw new Exception("�׷� ���̴� ����");
			}
			System.out.println("����� ���̴� " + age);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���� ����� ����");
	}
}

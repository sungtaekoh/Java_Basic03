package day13_Constructor;

import java.util.Scanner;

class Constructor02{
	private int age;
	public Constructor02(int age) {
		this.age = age -1;
	//�̷��� ������� ���� �ʱ�ȭ�� �� �ַ� ����Ѵ� ������
	}
	public int getAge() {
		return age;
	}
}


public class Ex02_Constructor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int age = input.nextInt();
		Constructor02 con = new Constructor02(age);
		System.out.println("���� : "+con.getAge());
	}
}

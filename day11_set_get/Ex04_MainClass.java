package day11_set_get;

import java.util.Scanner;
/*
��ü ���� �� setter�� ���� ������ ���� ����
���̸� ������ ����ϴ� �޼ҵ� ���� �� age ����
����� ���� getter�� ���� main���� ���
??���� ���̴� ??�� �Դϴ�.
*/
public class Ex04_MainClass {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Ex04_set_get ex = new  Ex04_set_get();
	
	String name;
	int age;
	System.out.println("�̸� �Է� : "); name = input.next();
	System.out.println("���� �Է� : "); age = input.nextInt();
	
	ex.setName(name);
	ex.setAge(age);
//	ex.calAge(age);
	System.out.println(ex.getName()+"���� ���̴� "+ex.getAge()+"�� �Դϴ�");
}
}
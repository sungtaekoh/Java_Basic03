package day09_method;

import java.util.Scanner;


public class Ex01 {
	public static void main(String[] args) {
		/*
		 class
		 - ����� ���� �ڷ���(����ڰ� ����� �������� ����� ����ϴ� �ڷ���)
		 - ������ �����ϴ�
		 ��ü
		 - ������ ��ü��� �θ���
		 - class �ڷ������� ������ ����°�.
		 
		 �޼ҵ�
		 - ����� ���Ѵ�. �Ұ�ȣ() �� ������ ����̶�� ����ȴ�.
		 - ���������� �޼ҵ� �Ǵ� �Լ���� ���Ѵ�.
		 - �޼ҵ�� Ŭ���� ���ο��� �����ϴ� ���� ���Ѵ�.
		 - �Լ��� Ŭ���� ���� ���������� ����ϴ� ��.
		 
		 ���� ������
		 - public : �ܺ�, ������ ������ ����Ѵ�.
		 - private : �ܺ��� ������ ���ڴ�. ���ο����� ����Ѵ�.
		 - protected : ��ӹ��� �ڽ�.
		 - default(���� �����ڰ� ���°� ) : ������ ��Ű�������� ���� ����
		 */
		
		//Ŭ����
		Ex01_Class ex = new Ex01_Class(); 
		//new��� ������ �� ����ؾ��Ѵ�.
		//Ex01_Class�� �ִ� name, addr ���� ��� ��� �� �� �ִ�.
		
		ex.name = "�ȳ��ϼ���";
		ex.age = 12345; 
		//private int age��� �ٲٸ� ������ �߻�
		
		System.out.println(ex.name);
//		ex.name : ex�ȿ� �ִ� name�� ���� ���ϴ�
	}
}
package day11_set_get;

import java.util.Scanner;

public class Quiz01_2MainClass {//������ ����
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =0, result =0;
		String inputId = null, inputPw = null;
		Quiz01_2Method lo = new Quiz01_2Method();
		boolean flag = true;
		while(flag) {
			System.out.println("1.�α���   2.����   3.�α׾ƿ� \n>>>");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("���̵� �Է� : ");
				inputId = input.next();
				System.out.println("��й�ȣ �Է� : ");
				inputPw = input.next();
				result = lo.compare(inputId, inputPw);
				if(result == 0) {
					System.out.println("���� ���");
				}else {
					System.out.println("���� ����");
					break;
				}
			case 2:
				System.out.println("���� id : ");
				inputId = input.next();
				System.out.println("���� pw : ");
				inputPw = input.next();
				lo.setUserId(inputId);
				lo.setUserPw(inputPw);
				System.out.println("���� �Ϸ�");
				break;
			case 3:
				flag = lo.out();
				System.out.println("���� �մϴ�.");
			}
		}
	}

}

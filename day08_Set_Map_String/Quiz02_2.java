package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz02_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap menu = new HashMap();
		
		boolean bool = true;
		String name = null;
		String money = null;
		String money2 = null;
		int num = 0;
		
		while(bool) {
			System.out.println("1.�޴� ��� ");
			System.out.println("2.�޴��� ���� ���� ");
			System.out.println("3.����");
			System.out.println(">>>");
			num = input.nextInt();
			switch(num) {
			case 1: //�޴� ���
				
				break; 
			case 2:// �޴��� ���� ����
				break;
			case 3: //����
				break;
			}
		}
	}
}

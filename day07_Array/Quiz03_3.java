package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03_3 {//������
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList phNum = new ArrayList();
		String n, p;
		int num = 0, result = 0;
		boolean bool = true;
		while (bool) {
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.println(">>>");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("�̸� �Է� : ");
				n = input.next();
				if (name.indexOf(n) == -1) {
					System.out.println("����ó �Է� : ");
					p = input.next();
					name.add(n);
					phNum.add(p);
				} else {
					System.out.println("�̸��� ���� �մϴ�");
				}break;
			case 2:
				System.out.println("ã�� �̸� �Է� : ");
				n = input.next();
				result = name.indexOf(n);
				if (result == -1) {
					System.out.println(n + "���� ��Ͽ� �����ϴ�");
				} else {
					System.out.println(name.get(result)+":");
					System.out.println(phNum.get(result));
				}break;
			case 3:
				System.out.println("���� �̸� �Է� : ");
				n = input.next();
				result = name.indexOf(n);
				if(result == -1) {
					System.out.println(n+"���� ��Ͽ� �����ϴ�");
				}else {
					System.out.println(name.remove(result)+":");
					System.out.println(phNum.remove(result)+"���� ��");
				}break;
			case 4:
				for (int i = 0; i < name.size(); i++) {
					System.out.println(name.get(i) + " : ");
					System.out.println(phNum.get(i));
				}break;
			case 5:
				bool = false;
			}
		}
		System.out.println("���� �մϴ�~!");
	}
}

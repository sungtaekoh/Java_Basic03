package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList telName = new ArrayList();
		ArrayList telNum = new ArrayList();
		boolean bool = true;
		int choice = 0;
		String name = null;
		int num = 0;
		int result = 0;
		
		while(bool) {
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.println(">>>");
			choice = input.nextInt();
			switch(choice) {
				case 1: //1.����ó ���
					System.out.println("�̸� �Է� :");
					name = input.next();
					if(telName.indexOf(name) == -1) {
						System.out.println("����ó �Է� : ");
						num = input.nextInt();
						telName.add(name);
						telNum.add(num);
						System.out.println("���������� ����Ǿ����ϴ�.");
					}else {
						System.out.println("�̹� �����ϴ� ����ó�Դϴ�.");
					}break;
				case 2://2.����ó ����
					System.out.println("ã�� �̸� �Է� : ");
					name = input.next();
					if(telName.indexOf(name) != -1) {
						result = telName.indexOf(name);
						System.out.print(telName.get(result)+" : ");
						System.out.println(telNum.get(result));
					}else {
						System.out.println("�������� �ʴ� ����ó �Դϴ�.");
					}break;
				case 3://3.����ó ����
					System.out.println("���� �� �̸� �Է� : ");
					name = input.next();
					if(telName.indexOf(name) != -1) {
						result = telName.indexOf(name);
						telName.remove(result);
						telNum.remove(result);
						System.out.println("���������� "+name+"���� ���� �Ǽ̽��ϴ�.");
					}else {
						System.out.println("�������� �ʴ� ����ó �Դϴ�.");
					}break;
				case 4://4.��� ����ó ����
					if(telName.size()!=0) {
					for(int i =0 ; i<telName.size();i++) {
						System.out.print(telName.get(i)+" : ");
						System.out.println(telNum.get(i));
					}
					}else {
						System.out.println("����� ����ó�� �����ϴ�.");
					}
					break;
				case 5:
					System.out.println("����.");
					bool = false;
			}
		}
		
	}
}

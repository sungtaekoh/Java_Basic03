package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03_4 {// ���� �Ϸ�! ����
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			ArrayList telName = new ArrayList();
			ArrayList telNum = new ArrayList();
			boolean bool = true;
			int choice = 0;
			String name = null;
			int num = 0;
			int result =0;
			
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
					System.out.println("�̸� �Է� : ");
					name = input.next();
					if(telName.indexOf(name)==-1) {
						System.out.println("����ó �Է� : ");
						num = input.nextInt();
						telName.add(name);
						telNum.add(num);
					}else {
						System.out.println("�̹� �����ϴ� �̸��Դϴ�");
					}
					break;
				case 2: //2.����ó ����
					System.out.println("ã�� �̸� �Է� : ");
					name = input.next();
					if(telName.indexOf(name) != -1) {
					result = telName.indexOf(name);
					System.out.println("�̸�  : "+telName.get(result));
					System.out.println("����ó : "+telNum.get(result));
					}else {
						System.out.println("�������� �ʴ� ����ó �Դϴ�");
					}break;
				case 3 : //3.����ó ����
					System.out.println("������ ����ó �̸� �Է� : ");
					name = input.next();
					if(telName.indexOf(name)!=-1) {
						result = telName.indexOf(name);
						telName.remove(result);
						telNum.remove(result);
						System.out.println("����ó�� ���������� �����Ǿ����ϴ�.");
					}else {
						System.out.println("�������� �ʴ� ����ó �Դϴ�.");
					}
					break;
				case 4 : //4.��� ����ó ����
					for(int i=0;i<telName.size();i++) {
						System.out.println("�̸�  : "+telName.get(i));
						System.out.println("����ó : "+telNum.get(i));
					}
					break;
				case 5 : //����
					System.out.println("����");
					bool = false;
			}
			}
		
		
		}
}

package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 2�� ���ý� ����, ������ �߰��Ͻÿ�
 * ����: ���¸޴��� ����. ������ ���� ���� ����
 * ����: ���� �޴��� ����. ������ ���� ����
 */
public class Quiz02_1 {//����
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap menu = new HashMap();
		
		
		boolean bool = true;
		int choice = 0;
		String name = null;
		String money = null;
		String money2 =null;
		
		while(bool) {
		System.out.println("1.�޴� ���");
		System.out.println("2.�޴��� ���� ����");
		System.out.println("3.����");
		System.out.println(">>>");
		choice = input.nextInt();
		if(choice ==1 ) {//1. �޴����
		System.out.println("�޴� �Է� : ");
		name = input.next();
		if(menu.containsKey(name)!=true) {
			System.out.println("���� �Է� : ");
			money = input.next();
			menu.put(name, money);
			System.out.println("���������� �ԷµǾ����ϴ�.");
		}else {
			System.out.println("�̹� �����ϴ� �޴��Դϴ�.");
		}
		}else if(choice ==2) {//2.�޴��� ���ݺ���
			Iterator it = menu.keySet().iterator();
			while(it.hasNext()==true) {
				System.out.println(it.next()+" : "+menu.get(name));
			}
			System.out.print("1.����  ");
			System.out.print("2.����  ");
			System.out.print("3.������");
			choice = input.nextInt();//
			switch(choice) {
			case 1://1.����
				System.out.println("���� �޴��̸� �Է� : ");
				name = input.next();
				if(menu.containsKey(name)==true) {
					money = (String)menu.get(name);
					menu.remove(name);
					System.out.println("������ �޴� �̸� �Է� : ");
					name = input.next();
					System.out.println("���� ���� �Է� : ");
					money2 = input.next();
					menu.put(name, money2);
					System.out.println(money+"->"+menu.containsKey(name));
				}else {
					System.out.println("�� ���� �Է��Դϴ�. \n �ٽ��Է��� �ּ���.");
				}
				break;
			case 2://2.����
				System.out.println("������ �޴� �Է� : ");
				name = input.next();
				if(menu.containsKey(name)==true) {
					menu.remove(name);
					System.out.println("���������� �����Ǿ����ϴ�.");
				}
				break;
			case 3://3.������
				System.out.println("������");
				break;
			}
		}else if(choice==3) {
			
		}else {
			System.out.println("�� ���� �Է��Դϴ�. \n �ٽ��Է����ּ���.");
		}
		}
		
		
		
	}
}

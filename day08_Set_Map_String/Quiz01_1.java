package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 HashMap�� �̿��Ͽ� ������ �޴��� �����
 1.�޴���� :  �����ϴ� �޴��� �����ϴ� �޴��Դϴ�
 1.�޴� ���
 2.�޴��� ���� ����
 3.����
 >>>
 */
public class Quiz01_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap menu = new HashMap();
		
		int choice = 0;
		boolean bool = true;
		String key = null;
		String value = null;
		
		while(bool) {
		System.out.println("1.�޴� ���");
		System.out.println("2.�޴��� ���� ����");
		System.out.println("3.����");
		System.out.println(">>>");
		choice = input.nextInt();
		switch(choice) {
		case 1://1.�޴����
			System.out.println("�޴� �Է� : ");
			key = input.next();
			if(menu.containsKey(key)!=true) {
			System.out.println("���� �Է� : ");
			value = input.next();
			menu.put(key, value);
			System.out.println("��� �Ǿ����ϴ�.");
			}else {
				System.out.println("�̹� �����ϴ� �޴��Դϴ�.");
			}
			break;
		case 2://2.�޴��� ���� ����
			Iterator it = menu.keySet().iterator();
			while(it.hasNext()==true) {
				System.out.println(it.next()+" : "+menu.get(key));
			}
			break;
		case 3://3.����
			System.out.println("�����մϴ�.");
			bool=false;
		}
		
		}
	}
}

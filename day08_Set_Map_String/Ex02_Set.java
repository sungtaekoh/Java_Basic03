package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("��");
		arr.add("��");
		arr.add("��");
		
		Iterator it = arr.iterator();
		//ArrayList�� ���� �ε����� ������ �� ������ hashset�� ��� ������ ���� ������ iterator�� ����Ѵ�
		
		
//		System.out.println(it.hasNext());//���� ���� �����ϴ��� ����� ��, �������� ǥ��
//		System.out.println(it.next());//��
	//  System.out.println(it.next());//��
	//	System.out.println(it.next());//��
		//���� ���� ������ �����´�
		
		System.out.println(it.hasNext());//���� ���� �����ϴ°�?
		System.out.println(it.next()); //���� ����Ѵ� + Ȯ�� ����� �������� �Ѱ��ش�
		System.out.println(it.hasNext());
		System.out.println(it.next());
//		System.out.println(it.hasNext()); 
//		System.out.println(it.next()); 
		//it.hasNext�� false���� �� ����ϸ� ������ ���´�
	
		
		//���� ���� �ݺ������� ��Ÿ����
		while(it.hasNext() == true) {
			System.out.println(it.next());
		}
		System.out.println("========");
//		while(it.hasNext() == true) {
//			System.out.println(it.next());
//		}
		
		//�ߺ��� �ȵȴ� �ߺ��� �Ϸ��� Iterator it = arr.iterator();�� �ٽ� ���;��Ѵ�
		
		
	}
}

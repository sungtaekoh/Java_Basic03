package day08_Set_Map_String;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("��");
		set.add("��");
		set.add("��");
		System.out.println("set : "+set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext() == true) {
//			����ȯ
//			Object o = it.next(); //������Ʈ�θ� �Է��� �� �ִ� �ڵ�
//			String s = (String)o; //String���� �����ϰ� ������� �̷��� ������� ����ȯ�� ���־�߸� �Ѵ�.
//			String s = (String)it.next(); //���� ���ڵ带 ����Ѱ�
//			System.out.println(s); //���� �ڵ带 ����ϸ� ����� Ȯ�� �� �� �ִ�
		
			System.out.println(it.next());
		}
	}
}

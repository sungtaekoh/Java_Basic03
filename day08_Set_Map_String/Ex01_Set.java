package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01_Set {
	public static void main(String[] args) {
		/*
		 Set
		 -HashSet
		 -TreeSet..��
		 HashSet
		 -���� ������ �ȵȴ�.(�ε��� ��� �� ��)
		 -�������� �ߺ��� ������� �ʴ´�.
		 */
		HashSet hs = new HashSet();
		hs.add("���");
		hs.add("���");
		hs.add("����");
		hs.add("���");
		System.out.println("hs : "+hs);
		hs.remove("���"); //�ش��ϴ� �׸� ����
		System.out.println("hs : "+hs);
		
		ArrayList arr = new ArrayList();
		arr.add("���");
		arr.add("���");
		arr.add("����");
		arr.add("���");
		System.out.println("arr : "+arr);
	}
}

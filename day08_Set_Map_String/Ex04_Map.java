package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;





public class Ex04_Map {
	public static void main(String[] args) {
		/*
		 Map
		 -HashMap
		 -TreeMap
		 -HashTable...��
		 
		 HashMap
		 - key�� ���� ���̴�
		 - ������ �������� �ʴ´�
		 - Ű�� ���� �ߺ��� ������� �ʴ´�. (value�� ���� �ߺ��� ����Ѵ�.)
		 */
		HashMap map = new HashMap(); //������ ���δ�
//		LinkedHashMap map = new LinkedHashMap(); //������ �����ȴ�
		map.put("��ǳ��", "1000����");
		map.put("�ڵ���", "10����");
		map.put("������", "30����");
		
		System.out.println(map);
		
		System.out.println(map.get("��ǳ��"));//Ű�� ���ؼ� value���� ���.
		System.out.println(map.get("�ڵ���"));
		System.out.println(map.get("������"));
		System.out.println(map.get("����Ű"));//����Ű�� null�� ǥ��ȴ�.
		
		System.out.println(map.containsKey("������"));//Ű�� �ش��ϴ� �������� �����ϴ��� ��, Ŀ������ ǥ��
		System.out.println(map.containsKey("������111"));
		
		System.out.println(map.containsValue("30����"));//true
		System.out.println(map.containsValue("31����"));//false
		//�ش��ϴ� ������ �����ϴ� Ű�� �ִ��� ��, �������� ǥ��
		
		System.out.println(map.remove("������")); //�ش��ϴ� Ű ����
		System.out.println(map.containsKey("������"));//������ �� �Ǿ����� Ȯ��
		System.out.println(map);//���� ����ؼ� Ȯ��
		
		System.out.println(map.keySet());//�ش��ϴ� (Ű�鸸)�� ���� ǥ��
		
//		Set s = map.keySet(); //mep.keySet();�� Set���� �޾��־�� �Ѵ�
//		Iterator it = s.iterator();
		Iterator it = map.keySet().iterator();
		while(it.hasNext() == true) {
			String key = (String)it.next();
			System.out.println(key+" : "+map.get(key));
		}
	}
}

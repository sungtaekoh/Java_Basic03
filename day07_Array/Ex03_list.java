package day07_Array;

import java.util.ArrayList;

public class Ex03_list {
	public static void main(String[] args) {
		/*
		  List
		 - ArrayList
		 - LinkedList
		 - Stack...���� �ִ�.
		 
		  ArrayList
		  -�����Ϳ� ���� ������ �ִ�. index�� ���� �����ϴ�
		  -�ߺ��� �����͸� ������ �� �ִ�.
		  -�迭���� �ٸ��� ���� �ٸ� �ڷ����� ���� �� �ִ�.
		  -������ ũ�⸦ ���´�./ ������ �ڵ����� �þ�ų� �پ���
		 */
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add(456);
		
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println( arr.size() );//ũ�⸦ ����ش�
		
		//contains : �ش��ϴ� ���� �����ϴ��� ��,�������� �˷���
		System.out.println(arr.contains("123"));
		System.out.println(arr.contains("1231"));
		
		//remove :  �ش��ϴ� ���� �����Ѵ�
//		System.out.println( arr.remove("123"));//123�� ������
		System.out.println(arr.remove(1)); //1��° ���� ������
		System.out.println(arr);
		System.out.println(arr.get(0));
		
		//clear : �ش��ϴ� ���� ��ü�� �����
		arr.clear();
		System.out.println("���� �� arr : "+arr);
	}
}

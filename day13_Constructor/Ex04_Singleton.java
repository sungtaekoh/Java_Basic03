package day13_Constructor;

import java.util.Calendar;

class Singleton04{
	private static Singleton04 si;
	
	private Singleton04() {//������
//		private���� ���� �ʿ��̻����� ��ü�� �����Ǵ°��� ���´�
//		��� Ŭ���� ������ �޼ҵ�� �����Ͽ� ���
		System.out.println("�⺻ ������ ����");
	}
	
	public static Singleton04 getInstance() {
		//�����ڰ� static���� ������� �־� ȣ�� ����
		
		si = new Singleton04();
		//�޼ҵ带 ���� ��ü�� �����. new�� �ƴϸ� ��ü�� �������� �ʴ´�.
		
		System.out.println("si : "+si);
		
		
		return si;
	}
	
}

public class Ex04_Singleton {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
		
		Singleton04 si01 = Singleton04.getInstance();
		//new�� �ƴ� ��ü�� ��� �ͼ� ����Ѵ�.
		
		System.out.println("si01 : "+si01);
		
	}
}

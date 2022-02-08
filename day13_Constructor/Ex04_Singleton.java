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
		
//		si = new Singleton04();
//�޼ҵ带 ���� ���ο� ��ü�� �����. new�� �ƴϸ� ��ü�� �������� �ʴ´�.
		
		System.out.println("si : "+si);
		if(si == null) 
			si = new Singleton04();
			
			return si;
	}
	
}

public class Ex04_Singleton {
	public static void main(String[] args) {
		/*
		 �������� : 
		 Singleton : ��ü�� �ϳ��� ���� ����Ѵ�.
		 */
		
//		Calendar cal = Calendar.getInstance();
		
		Singleton04 si01 = Singleton04.getInstance();
		//new�� �ƴ� ��ü�� ��� �ͼ� ����Ѵ�.
		
		System.out.println("si01 : "+si01);
		
		Singleton04 si02 = Singleton04.getInstance();
		System.out.println("si02 : "+si02);
		Singleton04 si03 = Singleton04.getInstance();
		System.out.println("si02 : "+si03);
		Singleton04 si04 = Singleton04.getInstance();
		System.out.println("si02 : "+si04);
//		si 02, 03, 04... ���� ���� ���� ������ �ȴ�.
		
	}
}

package day13_Constructor;

import java.util.Calendar;

class Singleton01{
	public int num;
}
public class Ex03_Singleton {
	public static void main(String[] args) {
		
//		Calendar cal = Calendar.getInstance();
		//��ü�� ���鶩 �ݵ�� new�� �ִ°� �ƴϴ�.
		
		Singleton01 si = new Singleton01();
		Singleton01 si02 = si;
		//singleton : �̷��� ������� �ϳ��� ������ ���� ����Ѵ�.
		
//		Singleton01 si02 = new Singleton01();
		//si, si02���� Ŭ������ �����ϴ���� ���� �ٸ���ü�� ���������.

		//		System.out.println("si.num : "+si.num);//12345
//		System.out.println("si02 : "+si02.num);//4444
		
		
		si.num = 12345;
		si02.num = 4444;
		
		System.out.println("si.num : "+si.num);
		System.out.println("si02 : "+si02.num);
		
		System.out.println("si : "+si);//�ּҰ� ���
		System.out.println("si02 : "+si02);//�ּҰ� ��� ������ ���� �ٸ�
	}
}

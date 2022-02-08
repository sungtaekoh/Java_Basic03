package day13_Constructor;

import java.util.Calendar;

class Singleton01{
	public int num;
}
public class Ex03_Singleton {
	public static void main(String[] args) {
		
//		Calendar cal = Calendar.getInstance();
		//객체를 만들땐 반드시 new만 있는건 아니다.
		
		Singleton01 si = new Singleton01();
		Singleton01 si02 = si;
		//singleton : 이러한 방법으로 하나의 공간을 같이 사용한다.
		
//		Singleton01 si02 = new Singleton01();
		//si, si02같은 클래스를 공유하더라고 서로 다른객체로 만들어진다.

		//		System.out.println("si.num : "+si.num);//12345
//		System.out.println("si02 : "+si02.num);//4444
		
		
		si.num = 12345;
		si02.num = 4444;
		
		System.out.println("si.num : "+si.num);
		System.out.println("si02 : "+si02.num);
		
		System.out.println("si : "+si);//주소가 출력
		System.out.println("si02 : "+si02);//주소가 출력 하지만 서로 다름
	}
}

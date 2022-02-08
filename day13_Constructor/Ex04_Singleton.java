package day13_Constructor;

import java.util.Calendar;

class Singleton04{
	private static Singleton04 si;
	
	private Singleton04() {//생성자
//		private으로 인해 필요이상으로 객체가 생성되는것을 막는다
//		대신 클레스 내부의 메소드로 접근하여 사용
		System.out.println("기본 생성자 실행");
	}
	
	public static Singleton04 getInstance() {
		//생성자가 static으로 만들어져 있어 호출 가능
		
		si = new Singleton04();
		//메소드를 통해 객체를 만든다. new가 아니면 객체가 생성되지 않는다.
		
		System.out.println("si : "+si);
		
		
		return si;
	}
	
}

public class Ex04_Singleton {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
		
		Singleton04 si01 = Singleton04.getInstance();
		//new가 아닌 객체를 얻어 와서 사용한다.
		
		System.out.println("si01 : "+si01);
		
	}
}

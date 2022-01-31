package day11_set_get;

public class Ex01_MainClass {
	public static void main(String[] args) {
		/*
		 this는  클래스 자기 자신의 위치 정보를 가지고 있다.
		 멤버 메소드를 만들면 자동적으로 생성된다.
		 */
		
		Ex01_This ex = new Ex01_This();
		Ex01_This ex01 = ex;
		
//		System.out.println("ex : "+ex);//위치 정보가 나온다
//		System.out.println("ex01 : "+ex01);
		
//		ex.a = 7777;
		ex.func01();
		ex.func02();
//		ex01.func01();
		
	}
}

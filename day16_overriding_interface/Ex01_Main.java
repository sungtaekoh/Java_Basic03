package day16_overriding_interface;

public class Ex01_Main {
	public static void main(String[] args) {
		/*
		  overriding
		 - 상속받은 자식의 메소드의 내용을 변경(업데이트)하는 것
		 
		 조건
		 - 부모 메소드의 형식과 동일하게 자식 메소드를 만드는 것
		 1) 반환타입이 같아야 한다
		 2) 매게변수의 개수와 타입이 같아야 한다
		 3) 접근 제한자가 부모와 같거나 커야 한다.
		 
		 -private < package < protected < public
		 */
//		Ferrari fe = new Ferrari(2022, 350);
//		fe.speed();
		NewFerrari fe = new NewFerrari(2023,400);
		fe.speed();//부모 메소드 사용
		fe.autoSystem();
	}
}

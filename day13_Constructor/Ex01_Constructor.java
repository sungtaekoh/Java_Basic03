package day13_Constructor;


	class Constructor01{
		public Constructor01(String s) {
			System.out.println("생성자 실행");
		}//생성자 : 만들지 않아도 자동으로 생성되며 실행 코드없이도 실행된다.
		
		public Constructor01() {
			System.out.println("default 생성자 실행");
		}
		
		public void test(String s) {
			System.out.println(s+ " : test 실행");
		}
		
		public void test() {
			System.out.println("기본 테스트");
		}
		
	}
	
	public class Ex01_Constructor {
	public static void main(String[] args) {
		/*
		 생성자 사용
		 - 보통 초기화하고자 할때 사용한다
		 - 객체가 생성될때 자동으로 호출된다
		 
		 생성자 만드는 방법
		 - 클래스 이름과 동일하게 만든다.
		 -반환타입은 없어야 한다
		 */
		Constructor01 con = new Constructor01("생성자");
		Constructor01 con01 = new Constructor01();
		//오버로딩 시켜주면 된다
		
		con.test("테스트");
		con.test();
		//오버 로딩 :같은 이름의 메소드를 다르게 사용한다
		
	}
}

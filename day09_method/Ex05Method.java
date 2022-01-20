package day09_method;

public class Ex05Method {
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum; //반환형태가 int 맞춰주어야한다
	}
	public void test(int n) {
		// void :리턴 값이 없다  
		if(n == 1) {
			System.out.println("if");
		}else {
			System.out.println("else");
			return;
			// return : 값을 돌려주는 기능 외에도 해당하는 메소드를 종료하는 기능도 있다.
		}
		System.out.println("test 메소드 종료");
	}
	
	public String test02() {
		int num =1;
		if(num ==1) {
			return "111.111";
		}else
			return null;
//		return null; //if의 값이 거짓일 경우를 대비해 결과값을 정해주어야 에러가 나오지 않는다.
	}
}

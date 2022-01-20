package day09_method;

public class Ex04 {
	public static void main(String[] args) {
		Ex04Method ex = new Ex04Method();
		int num = 100, su = 200;//이 값을 파라미터로 사용하는것도 가능하다.
		ex.sumFunc(num, su);// 인자값(파라미터) 파란색숫자
	
		ex.test("문자열", 100);
		//넘겨주는 타입과 받아주는 타입을 똑같이 맞춰주어야한다
	}
}

package day13_Constructor;

class Calc06{
	
	public int n = 12345;
	public String s = "부모 문자열";
	private String ss = "private 변수";
	protected String sss = "protected 변수";
	//protected : 상속받은 자식한테는 허용, 외부에선 접근 불가.
	
	public Calc06(String s ) {
		System.out.println(s+"부모 생성자");
	}
	public void test() {
		System.out.println("부모 test 실행");
	}
}
class Computer06 extends Calc06{
	public int n = 7777;
	
	public Computer06(String ss) {
		super(ss);
		System.out.println(ss+" : 자식 생성자");
		super.test();//부모꺼 실행해라
		this.test();//자식꺼 실행해라 (코드가 많아졌을때 구분을 쉽게 하기위해 사용)
		test(); // 나한테 있는 test를 사용
		System.out.println("super.n : "+super.n);
		System.out.println("this.n : "+this.n);
		System.out.println("super.s : "+ s);
//		System.out.println("super private ss"+ super.ss);
//		private의 경우엔 부모클래스에 있는 변수 사용 불가
		
		System.out.println("super protected ss : "+super.sss);
	}
	public void test() {
		System.out.println("자식 test 실행");
	}
}

public class Ex06_Inheritance {
	public static void main(String[] args) {
		Computer06 com = new Computer06("전달");
	}
}

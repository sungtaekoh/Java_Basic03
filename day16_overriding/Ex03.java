package day16_overriding;

interface Test{
//	public int a; 인터페이스에 존재하는 변수는 반드시 static final이여야만 한다
	public static final int a = 12345;
	public final int a1 = 12345;
	public static int a2 = 12345;
	public static String id  = "홍길동";
	public static String pwd  = "12345";
}
public class Ex03 implements Test{
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println(pwd);
	}
}

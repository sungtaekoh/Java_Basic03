package day16_overriding;

interface Test{
//	public int a; �������̽��� �����ϴ� ������ �ݵ�� static final�̿��߸� �Ѵ�
	public static final int a = 12345;
	public final int a1 = 12345;
	public static int a2 = 12345;
	public static String id  = "ȫ�浿";
	public static String pwd  = "12345";
}
public class Ex03 implements Test{
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println(pwd);
	}
}

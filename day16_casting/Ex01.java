package day16_casting;

class A01{
	public void getText() {
		System.out.println("AŬ����");
	}
}
class B01 extends A01{
	public void getText() {
		System.out.println("BŬ����");
	}
}
class C01  extends A01{
	public void getText() {
		System.out.println("CŬ����");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * ���־��̴� ǥ���� �ƴ�, �׳� �˾Ƹ� ����
		 up casting(����ȯ)
		 - �ڽ������� ���� �θ� ���·� ��ȯ�ϴ� ��
		 down casting(����ȯ)
		 - �θ����¿��� �ڽ����·� ��ȯ�ϴ� ��
		 */
		/*
		B01 b = new B01();
		b.getText();
		C01 c = new C01();
		c.getText();
		*/
		A01 a = new B01();
		a.getText();
		
		a = new C01();
		a.getText();
//		up casting  : ������ �ϳ��� ����� ���ڴ� 
}
}

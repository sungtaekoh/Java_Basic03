package day13_Constructor;

class Calc06{
	
	public int n = 12345;
	public String s = "�θ� ���ڿ�";
	private String ss = "private ����";
	protected String sss = "protected ����";
	//protected : ��ӹ��� �ڽ����״� ���, �ܺο��� ���� �Ұ�.
	
	public Calc06(String s ) {
		System.out.println(s+"�θ� ������");
	}
	public void test() {
		System.out.println("�θ� test ����");
	}
}
class Computer06 extends Calc06{
	public int n = 7777;
	
	public Computer06(String ss) {
		super(ss);
		System.out.println(ss+" : �ڽ� ������");
		super.test();//�θ� �����ض�
		this.test();//�ڽĲ� �����ض� (�ڵ尡 ���������� ������ ���� �ϱ����� ���)
		test(); // ������ �ִ� test�� ���
		System.out.println("super.n : "+super.n);
		System.out.println("this.n : "+this.n);
		System.out.println("super.s : "+ s);
//		System.out.println("super private ss"+ super.ss);
//		private�� ��쿣 �θ�Ŭ������ �ִ� ���� ��� �Ұ�
		
		System.out.println("super protected ss : "+super.sss);
	}
	public void test() {
		System.out.println("�ڽ� test ����");
	}
}

public class Ex06_Inheritance {
	public static void main(String[] args) {
		Computer06 com = new Computer06("����");
	}
}

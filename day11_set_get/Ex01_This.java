package day11_set_get;

public class Ex01_This {
	//����
	public int a = 10;
	public void func01() {
		int a = 12345; //func01�ȿ� a��� ���� �ֱ⶧���� ���� �ִ� ���� �켱�� �Ѵ�
		System.out.println("01 a : "+this.a);//this : �ٱ��� �ִ� ���� ã�´�
		System.out.println("this " + this);
//		this.func02();
//		func02();
	}
	public void func02() {//func02�ȿ� ���� ���� ������ �ۿ� �ִ� a���� ����Ѵ�.
		System.out.println("02 a : "+a);
	}
}

package day16_casting;
class Parents{
	public void familyName() {
		System.out.print("��");
	}
	public void name() {
		familyName();
		System.out.println("����");
	}
}

class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("����");
	}
}

class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("�Ɽ");
	}
}
public class Ex02 {
	public static void main(String[] args) {
//		�� �ɽ��� ����
		
		/*
		Parents p = new Parents();
		p.name();
		Daughter d = new Daughter();
		d.name();
		Son s = new Son();
		s.name();
		*/
		Parents p = new Parents();
		p.name();
		p = new Daughter();
		p.name();
		p = new Son();
		p.name();	
//		�θ����·δ� �ڽ��� �޾��� �� �ִ�.
	}
}

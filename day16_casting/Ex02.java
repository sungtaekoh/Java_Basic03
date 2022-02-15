package day16_casting;
class Parents{
	public void familyName() {
		System.out.print("이");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}

class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}

class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
	}
}
public class Ex02 {
	public static void main(String[] args) {
//		업 케스팅 예제
		
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
//		부모형태로는 자식을 받아줄 수 있다.
	}
}

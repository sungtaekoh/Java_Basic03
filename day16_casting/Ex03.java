package day16_casting;

import java.util.ArrayList;

class B{
	public void bbb() {}
}

class AAA {
	public String getText() {return "AAA클래스";}
}
public class Ex03 {
	public static void main(String[] args) {
		Object a = new AAA();
//		부모형태로 받아주면 오버라이딩을 꼭 해주어야 한다
//		부모의 기능밖에 사용하지 못하기 때문 
		
		AAA aa = (AAA)a;
		aa.getText();
//		downcasting : 부모의 형태를 다시 자기자신으로 변환
		
		ArrayList arr = new ArrayList();
		arr.add("test");
		String s = (String)arr.get(0);
	}
}

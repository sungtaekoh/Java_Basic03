package day16_overriding;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("나만의 기능입니다");
	}
	
	@Override
	public Object get(int i) {
		return "내가만든 get이다";
	}
	public boolean add(Object o) {
		System.out.println("추가하는 기능 입니다.");
		return true;
	}
}

final class BB {//extends String 사용 불가, final을 붙이면 상속불가
	String s = new String();//final이라고 써있는 기능은 상속 불가, 오버라이딩 불가
	String ss;
	
}
class CC {//extends BB{
	BB b = new BB();//상속불가일때 이러한 방법으로 사용한다
}

public class Ex02_Main {
	public static void main(String[] args) {
	AA a = new AA();
//	ArrayList arr = new ArrayList();
//	String s;
	
//	extends로 사용하면 편의성이 더 좋다
	a.add("안녕하세요");
	System.out.println("저장 값 : "+a.get(0));
	}
}

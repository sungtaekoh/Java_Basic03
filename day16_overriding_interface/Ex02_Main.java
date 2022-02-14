package day16_overriding_interface;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("나만의 기능입니다");
	}
	
	@Override
	public Object get(int i) {
		return "내가만든 get이다";
	}
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

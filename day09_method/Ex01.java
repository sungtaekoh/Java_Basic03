package day09_method;

import java.util.Scanner;


public class Ex01 {
	public static void main(String[] args) {
		/*
		 class
		 - 사용자 정의 자료형(사용자가 만들고 싶은데로 만들어 사용하는 자료형)
		 - 재사용이 가능하다
		 객체
		 - 변수를 객체라고 부른다
		 - class 자료형으로 변수를 만드는것.
		 
		 메소드
		 - 기능을 말한다. 소괄호() 가 있으면 기능이라고 보면된다.
		 - 보편적으로 메소드 또는 함수라고 말한다.
		 - 메소드는 클래스 내부에서 정의하는 것을 말한다.
		 - 함수는 클래스 없이 독립적으로 사용하는 것.
		 
		 접근 제한자
		 - public : 외부, 내부의 접근을 허용한다.
		 - private : 외부의 접근을 막겠다. 내부에서만 허용한다.
		 - protected : 상속받은 자식.
		 - default(접근 제한자가 없는것 ) : 동일한 패키지에서만 접근 가능
		 */
		
		//클래스
		Ex01_Class ex = new Ex01_Class(); 
		//new라는 연산을 꼭 사용해야한다.
		//Ex01_Class에 있는 name, addr 등을 모두 사용 할 수 있다.
		
		ex.name = "안녕하세요";
		ex.age = 12345; 
		//private int age라고 바꾸면 에러가 발생
		
		System.out.println(ex.name);
//		ex.name : ex안에 있는 name을 꺼내 씁니다
	}
}

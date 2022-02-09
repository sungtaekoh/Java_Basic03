package day13_Constructor;

class Calc01{// 부모클래스
	
	public Calc01(String s){
		System.out.println("calc 부모 생성자");
	}
	
	public void display() {
		System.out.println("나는 계산기야");
	}
}

class computer01 extends Calc01{ //자식클래스
	//상속받은 메소드가 실행된다 단, 우선순위는 자신 메소드
	/*
	public void display() {
		System.out.println("나는 계산기야");
	}
	*/
	
	public computer01(){
		super("값 전달"); //해당하는 부모생성자에 값전달
		System.out.println("com 자식 생성자");
	}
	
	public void print() {
		System.out.println("나는 컴퓨터야");
	}
}

public class Ex05_Inheritance {
	public static void main(String[] args) {
		/*
		 상속
		 - extends를 통해 만든다.
		 - 새로운 기능을 추가한다.
		 */
		
//		Calc01 ca  = new Calc01();
//		ca.display();
		
		computer01 com = new computer01();
//생성자의 경우 상속받은 부모클래스가 먼저 실행 -> 자식클래스 생성자 실행
		
		com.print(); 
		com.display();
	}
}

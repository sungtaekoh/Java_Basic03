package day15_Thread;
/*
class A {
	public void start() {
		System.out.println("부모 start 실행");
		run();
	}

	public void run() {
		System.out.println("부모 run 실행");
	}
}

class B extends A {
	public void run() {
		System.out.println("자식 run 실행");
	}
//	부모와 같은 메소드가 있을 경우 자식메소드를 먼저 사용하게 된다.
//	이걸 오버라이딩이라고 한다.
}
*/

//extends Thread 코드를 진행시키는 일꾼을 추가
//연산속도가 빨르기때문에 사람이 볼땐 동시에 진행되는것처럼 보인다
class A02 extends Thread{
	public void run() {
		for(int i=0; i<100;i++) {
			System.out.println("A02 : "+ i);
		}
	}
}
class B02 extends Thread{
	public void run() {
		for(int i=0; i<100;i++) {
			System.out.println("B02 : "+ i);
		}
	}
}
public class Ex02 {
	public static void main(String[] args) {
		A02 a = new A02();
		B02 b = new B02();
		
		a.setDaemon(true);
		b.setDaemon(true);
//		메인이 종료할 때, 종속되어있는 스레드도 같이 종료하라
//		단, 메모리안에 있는건 실행된다.
		
		a.start();
		b.start();
		
		System.out.println("프로그램 종료합니다");
		System.out.println("프로그램 종료합니다");
		System.out.println("프로그램 종료합니다");
	}
}

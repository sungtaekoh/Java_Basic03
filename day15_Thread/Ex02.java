package day15_Thread;
/*
class A {
	public void start() {
		System.out.println("�θ� start ����");
		run();
	}

	public void run() {
		System.out.println("�θ� run ����");
	}
}

class B extends A {
	public void run() {
		System.out.println("�ڽ� run ����");
	}
//	�θ�� ���� �޼ҵ尡 ���� ��� �ڽĸ޼ҵ带 ���� ����ϰ� �ȴ�.
//	�̰� �������̵��̶�� �Ѵ�.
}
*/

//extends Thread �ڵ带 �����Ű�� �ϲ��� �߰�
//����ӵ��� �����⶧���� ����� ���� ���ÿ� ����Ǵ°�ó�� ���δ�
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
//		������ ������ ��, ���ӵǾ��ִ� �����嵵 ���� �����϶�
//		��, �޸𸮾ȿ� �ִ°� ����ȴ�.
		
		a.start();
		b.start();
		
		System.out.println("���α׷� �����մϴ�");
		System.out.println("���α׷� �����մϴ�");
		System.out.println("���α׷� �����մϴ�");
	}
}

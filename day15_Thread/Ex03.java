package day15_Thread;

import java.util.Scanner;

class A03 extends Thread{
	 public void run() {
		 for( ; ; ) {
			 try {
				 System.out.println("답글이 날라옵니다");
				 Thread.sleep(1000);
		 }catch (Exception e) {
			// TODO: handle exception
		}
		}
	 }
 }

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String message = null;
		A03 a = new A03();
		a.setDaemon(true);
		a.start();
		//설정을 먼저하고 실행해라 
		//순서가 바뀌면 에러나옴
		
		for( ; ; ) {
			System.out.println("전송 메세지 : ");
			message = input.next();
			System.out.println(message);
			if(message.equals("exit"))
				break;
		}
		System.out.println("프로그램 종료합니다");
		System.out.println("프로그램 종료합니다");
		System.out.println("프로그램 종료합니다");
	}
}

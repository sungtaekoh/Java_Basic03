package day12_OOP;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 sleep : 잠시 대기시켜주는 기능
		 */
		for(int i =0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500); 
				// 괄호안의 숫자만큼 대기해라 숫자 : 1000분의 1초, 1000 = 1초
				//이 기능을 쓰기위해서는 try,catch를 형식을 꼭 써주어야 한다.
			}catch (Exception e) {
			}
		}
		System.out.println("다음 문장들 실행!!!");
		
	}
}

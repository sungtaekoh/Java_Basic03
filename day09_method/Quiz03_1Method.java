package day09_method;

import java.util.Scanner;

/*
 * 3의 배수를 판별하는 함수를 만들고 이 함수를 이용하여 main에서 3의 배수만 출력하시오
 */
public class Quiz03_1Method {
	public void input() {//입력
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int num1 = input.nextInt();
		int result = cal(num1);
		print(result);
	}
		
	public int cal(int n1) {//연산
		if(n1 %3 == 0) {//3의 배수이다
			return 0;
		}else {//3의 배수가 아니다
			return 1;
		}
	}
	
	public void print(int n1) {
		if(n1 == 0 ) {
			System.out.println("3의 배수 입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
	}
}

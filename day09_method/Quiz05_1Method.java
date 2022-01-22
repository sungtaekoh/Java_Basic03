package day09_method;

import java.util.Scanner;

/*
 절대값을 구하는 함수를 정의하시오
 */
public class Quiz05_1Method {
	public void display() {
	Scanner input = new Scanner(System.in);
	System.out.println("수 입력 : ");
	int num1 = input.nextInt();
	int result = cal(num1);
	print(result, num1);
	}
	public int cal(int num1) {
	if(num1>0) {
//		System.out.println("절댓값 : "+num1);
		return 1;
	}else if(num1<0) {
//		System.out.println("절댓값 : "+(num1*-1));
		return 2;
	}
		else {
			return 3;
		}
	}
	
	
	public void print(int result, int num1) {
		if(result ==1) {
			System.out.println("절댓값 : "+num1);
		}else if(result == 2) {
			System.out.println("절댓값 : "+(num1*-1));
		}else {
			System.out.println("잘 못된 입력입니다.");
		}
	}
}

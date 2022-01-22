package day09_method;

import java.util.Scanner;

/*
 * 수를 입력 받아 소수를 판별하는 함수 제작
 * 
 * 소수: 1과 자신외의 수로 나누어 지지 않는 수
 * 2,3의 배수가 아닌것은 전부 소수이다
 */
public class Quiz04_1Method {
	
	public void display() {//입력
	Scanner input = new Scanner(System.in);
	System.out.println("수 입력 : ");
	int num1 = input.nextInt();
	int result = cal(num1);
	print(num1, result);
	}
	public int cal(int num1) {//연산
	if(num1 ==2) {
//		System.out.println("소수 : "+2);
		return 1;
	}else if(num1 == 3) {
//		System.out.println("소수 : "+3);
		return 2;
	}else if(num1%2!=0 && num1%3!=0) {
//		System.out.println("소수 : "+num1);
		return 3;
	}else {
//		System.out.println("소수가 아닙니다.");	
		return 4;
}
	}
	public void print(int n1, int n) {//출력
		if(n==1) {
			System.out.println("소수 : "+2);
		}else if(n==2) {
			System.out.println("소수 : "+3);
		}else if(n==3) {
			System.out.println("소수 : "+n1);
		}else {
			System.out.println("소수가 아닙니다.");	
		}
	}
	
	
}


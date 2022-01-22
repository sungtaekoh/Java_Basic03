package day09_method;

import java.util.Scanner;

/*
 * 입력 받는 값이 짝수인지 홀수인지 판별하는 함수 제작
 */
public class Quiz02_2Method {
	public void input() {//입력
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int num1 = input.nextInt();
		int result = cal(num1);
		print(result);
	}
	public int cal(int n1) {
		if(n1%2==1) {//홀수
			return 1;
		}else if(n1%2==0) {//짝수
			return 2;
		}else {//잘 못된 입력
			return 3;
		}
	}
	public void print(int n1) {//출력
		if(n1 ==1 ) {
			System.out.println("홀수");
		}else if(n1 ==2) {
			System.out.println("짝수");
		}else {
			System.out.println("잘 못된 입력");
		}
	}
}

package day09_method;

import java.util.Scanner;

public class Quiz02_1 {
	/*
	public void print() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력 : ");
		num = input.nextInt();  //입력받는 기능
		if(num%2 ==0 ) {//연산하는 기능
			System.out.println("짝수");//출력하는 기능 
		}else {
			System.out.println("홀수");
		}
	}
	*/
	public void print() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력 : ");
		num = input.nextInt();  //입력받는 기능
//		String s = op(num);
//		출력(s);
		int reulst = op(num);
		출력(reulst);
	}
	public void 출력(int r) {
		if(r ==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	public int op(int num) {
		if(num%2 ==0 ) {//연산하는 기능
//			System.out.println("짝수");//출력하는 기능 
//			return "짝수";
			return 0; //일반적으로는 문자보단 숫자로 돌려준다
		}else {
//			System.out.println("홀수");
//			return "홀수";
			return 1;
		}
	}
	public void 출력(String result) { //실제로는 한글로 만들면 안된다 이건 예시
		System.out.println();
	}
	
	
}

package day09_method;

import java.util.Scanner;

/*
 * 두 수를 입력 받아 큰 수를 출력하는 함수를 만드시오
 */
public class Quiz01_1Method {
	public void input() {//입력
	int num1 = 0 ;
	int num2 = 0 ;
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		num1 = input.nextInt();
		System.out.println("수 입력 : ");
		num2 = input.nextInt();
		 int result= cal(num1, num2);
		 print(num1, num2, result);
	}
	public int cal(int n1, int n2) {//계산
		if(n1>n2) {
			return 1;
		}else if(n1<n2) {
			return 2;
		}else{
			return 3;
		}
		
	}
		
	public void print(int n1, int n2, int n3){
		if(n3 == 1) {
			System.out.println("num1 : "+n1);
		}else if(n3 == 2) {
			System.out.println("num2 : "+n2);
		}else {
			System.out.println("같다 : ");
		}
	}

}

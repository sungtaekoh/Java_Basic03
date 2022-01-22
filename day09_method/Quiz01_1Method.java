package day09_method;

import java.util.Scanner;

/*
 * 두 수를 입력 받아 큰 수를 출력하는 함수를 만드시오
 */
public class Quiz01_1Method {
	public void test01() {
	int num1 = 0 ;
	int num2 = 0 ;
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		num1 = input.nextInt();
		System.out.println("수 입력 : ");
		num2 = input.nextInt();
		if(num1>num2) {
			System.out.println(num1);
		}else if(num1<num2) {
			System.out.println(num2);
		}else if(num1 == num2) {
			System.out.println(num1);
		}
	}

}

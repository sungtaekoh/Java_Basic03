package day09_method;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Ex06Method ex = new Ex06Method();
		ex.display();
		
		System.out.println("-------main 실행-----");
		//위의 기능과 같은 방법 어떻게 사용해도 된다
		//디버깅 하면 흐름을 파악하기
		Scanner input = new Scanner(System.in);
		  int n1, n2;
		  System.out.println("두 수 입력 :");
		  n1 = input.nextInt();
		  n2 = input.nextInt();
		  int sum = ex.test(n1, n2);
		  ex.printSum(n1,n2,sum);
		  
	}
}

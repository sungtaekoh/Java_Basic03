package day14_Exception;

import java.util.Scanner;

public class ArtithmaticExceptionTest {

	public void start() {
//		import 단축키 ctrl + shift + o
		Scanner input = new Scanner(System.in);
		
		int numberOne =0;
		int numberTwo =0;
		double result = 0.0;
		
		System.out.println("첫번째 숫자를 입력하세요");
		numberOne = input.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		numberTwo = input.nextInt();
		
		try {
			result = numberOne / (double) numberTwo;
		}catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("결과는 "+result+"입니다.");
		
	}
	
	public static void main(String[] args) {
		ArtithmaticExceptionTest test = new ArtithmaticExceptionTest();
		test.start();
	}
}

package day14_Exception;

import java.util.Scanner;

public class ArtithmaticExceptionTest {

	public void start() {
//		import ����Ű ctrl + shift + o
		Scanner input = new Scanner(System.in);
		
		int numberOne =0;
		int numberTwo =0;
		double result = 0.0;
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		numberOne = input.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		numberTwo = input.nextInt();
		
		try {
			result = numberOne / (double) numberTwo;
		}catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("����� "+result+"�Դϴ�.");
		
	}
	
	public static void main(String[] args) {
		ArtithmaticExceptionTest test = new ArtithmaticExceptionTest();
		test.start();
	}
}

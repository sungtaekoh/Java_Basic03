package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 ���ܻ�Ȳ
		 -���α׷� �ǵ�(�������ǵ�)�� �ٸ��� �����ϴ� �͵�
		 ��������
		 -�������� : throw
		 -�������� : throws
		 -����ó�� : try,catch
		 */
		Scanner input = new Scanner(System.in);
		int x, y, result;
		System.out.println("�� �Է�");
		try {
			x = input.nextInt();
			y = input.nextInt();
			
			result = x/y;
			System.out.println("x / y ="+result);
		}catch (ArithmeticException e) {
			System.out.println("0���� ������ �������ϴ�");
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է� �� �� �����ϴ�");
		}
		System.out.println("���� ����� ����~");
		System.out.println("���� ����� ����~");
		System.out.println("���� ����� ����~");
		System.out.println("���� ����� ����~");
		System.out.println("���� ����� ����~");
		System.out.println("���� ����� ����~");
	}
}

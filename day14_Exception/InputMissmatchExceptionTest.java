package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;


public class InputMissmatchExceptionTest {//Scanner �� �� ���� �߻��ϴ� ����
	Scanner input = new Scanner(System.in);
	
	public void start() {
		int number  =0;
		int number1 =0;
		int number2 =0;
		int number3 =0;
		
		int currentStatus =1;
		System.out.println("������ �Է��ϼ���!");
		
//		����ڰ� ������ �Է��� ������ �ݺ��Ѵ�.
		while(true) {
//			���ܰ� �߻����� �ƴ��� ������, �켱 �����غ���.
			try {
//				���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �Է�
				switch(currentStatus) {
				case 1:
					System.out.println("1����");
					number1 = input.nextInt();
					currentStatus =2;
				case 2:
					System.out.println("2����");
					number2 = input.nextInt();
					currentStatus =3;
				case 3:
					System.out.println("3����");
					number3 = input.nextInt();
					currentStatus =1;
				}
				number = input.nextInt();
				break;
//				try ������ �ڵ尡 InputMismatchException�� �����ٸ�, ���ܸ� �޾ƿ´�
//				catch�� ����Ǵ� ������ program�� ������� �ʴ´�.
			}catch (InputMismatchException e) {
//				��ĳ���� ���׸� �ذ��ϱ� ���� �ڵ�
				input = new Scanner(System.in);
				System.out.println("�߸� �Է��߽��ϴ�. ������ �Է°���");
				/*
				 ���� �ȵǴ� �ڵ�
				 ������ ��ü���� ������ �˰������ ����
				 ��ü���� ������ �˰� �� �ڿ��� �ݵ�� ������ �Ѵ�
				 */
				e.printStackTrace();
				
				/*
				 �ֿ��ؾ��ϴ� �ڵ�
				 � ���ܰ� ��� �߻��޴��� ������ �˷��ش�
				 */
				System.out.println
				(e.getClass().getName()+"���ܰ�"+e.getMessage()+"������ �߻��߽��ϴ�.");
			}
		}		
		System.out.println("����� �Է��� ������ "+number+"�Դϴ�");		
	}
	public static void main(String[] args) {
		InputMissmatchExceptionTest test = new InputMissmatchExceptionTest();
		test.start();
	}
}

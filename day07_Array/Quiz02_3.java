package day07_Array;

import java.util.Scanner;

/*
 * Scanner input = new Scanner(System.in);
		int arr[] = new int[] { 10, 54, 13, 17, 25, 30 };
		String odd_even = null;
		System.out.println("¦��, Ȧ�� �Է� : ");
		odd_even = input.next();
 */

//�޼ҵ带 Ȱ���Ͽ� ������
public class Quiz02_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz02_3Method q2 = new Quiz02_3Method();
		int arr[] = new int[] { 10, 54, 13, 17, 25, 30 };
		String odd_even = null;
		System.out.println("¦��, Ȧ�� �Է� : ");
		odd_even = input.next();
		q2.cal(odd_even, arr);

	}
}
class Quiz02_3Method{
	public void cal(String n, int arr[]) {
		
		if (n.equals("Ȧ��")) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 1) {
					System.out.println("Ȧ�� : " + arr[i]);
				}
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					System.out.println("¦�� : " + arr[i]);
				}
			}

		}
	}
}


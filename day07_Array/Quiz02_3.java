package day07_Array;

import java.util.Scanner;

/*
 * Scanner input = new Scanner(System.in);
		int arr[] = new int[] { 10, 54, 13, 17, 25, 30 };
		String odd_even = null;
		System.out.println("Â¦¼ö, È¦¼ö ÀÔ·Â : ");
		odd_even = input.next();
 */

//¸Þ¼Òµå¸¦ È°¿ëÇÏ¿© ¸¸µé¾îº¸±â
public class Quiz02_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz02_3Method q2 = new Quiz02_3Method();
		int arr[] = new int[] { 10, 54, 13, 17, 25, 30 };
		String odd_even = null;
		System.out.println("Â¦¼ö, È¦¼ö ÀÔ·Â : ");
		odd_even = input.next();
		q2.cal(odd_even, arr);

	}
}
class Quiz02_3Method{
	public void cal(String n, int arr[]) {
		
		if (n.equals("È¦¼ö")) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 1) {
					System.out.println("È¦¼ö : " + arr[i]);
				}
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					System.out.println("Â¦¼ö : " + arr[i]);
				}
			}

		}
	}
}


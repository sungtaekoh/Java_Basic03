package day10_ClassVariable;

import java.util.Random;
import java.util.Scanner;

public class Quiz01_1MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rd = new Random(); 
		int answer = 0;
		
		while(true) {
		System.out.println("=== Up & Down Game===");
		System.out.println("1. ���ӽ���");
		System.out.println("2. ��������");
		System.out.println("3. ��������");
		int choice = input.nextInt();
		if(choice == 1) {// ���ӽ���
			int num = (int) (Math.random()*100)+1;
			System.out.println("��ǻ�� ���� : "+num);
			System.out.println("=== START ===");
			while(true) {
			System.out.println("Input Number --> ");
			answer = input.nextInt();
			if(num > answer) {
				System.out.println("=== Up ===");
			}else if(num < answer) {
				System.out.println("=== Down ===");
			}else {
				System.out.println("�����Դϴ�");
				break;
			}
			}
		}else if(choice ==2) {//���� ����
			
		}else if(choice == 3) {//���� ����
			break;
		}
		}
	}
}

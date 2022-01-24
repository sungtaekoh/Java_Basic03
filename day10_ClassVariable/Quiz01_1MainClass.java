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
		System.out.println("1. 게임시작");
		System.out.println("2. 게임전적");
		System.out.println("3. 게임종료");
		int choice = input.nextInt();
		if(choice == 1) {// 게임시작
			int num = (int) (Math.random()*100)+1;
			System.out.println("컴퓨터 숫자 : "+num);
			System.out.println("=== START ===");
			while(true) {
			System.out.println("Input Number --> ");
			answer = input.nextInt();
			if(num > answer) {
				System.out.println("=== Up ===");
			}else if(num < answer) {
				System.out.println("=== Down ===");
			}else {
				System.out.println("정답입니다");
				break;
			}
			}
		}else if(choice ==2) {//게임 전적
			
		}else if(choice == 3) {//게임 종료
			break;
		}
		}
	}
}

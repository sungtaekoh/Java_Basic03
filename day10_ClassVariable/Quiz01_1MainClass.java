package day10_ClassVariable;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
 * 실패 
 * 게임전적이 안나오는데 왜 안나오는지 모르겠음
 * 
 */
public class Quiz01_1MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rd = new Random(); 
		ArrayList a = new ArrayList();
		int cnt = 0;
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
			if(answer == num) {
				cnt++;
				a.add(cnt);
				System.out.println(cnt+"회 만에 맞췄습니다!!");
				cnt = 0;
				break;
			}else if(answer < num) {
				cnt++;
				System.out.println("=== Up ===");
			}else if(answer > num) {
				cnt++;
				System.out.println("=== Down ===");
			}
			}
		}else if(choice ==2) {//게임 전적
			int score = 0;
			score = (int)a.get(0);
			for(int i =1; i<a.size();i++) {
				if(score < (int)a.get(i)) {
					score = (int)a.get(i);
				}else {
					
				}
			}
			System.out.println("최고 점수는 "+score+"회 입니다!!!");
		}else if(choice == 3) {//게임 종료
			break;
		}
		}
	}
}

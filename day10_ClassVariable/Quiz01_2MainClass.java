package day10_ClassVariable;

import java.util.Scanner;


public class Quiz01_2MainClass {
	public static void main(String[] args) {
		Quiz01_2Method q1 = new Quiz01_2Method();
		Scanner input = new Scanner(System.in);
		int sel =0, com =0, dummy=0,score=0,result =0;
		int player = 0;
		while(true) {
			System.out.println("=== Up & Down Game ===");
			System.out.println("1.게임 시작");
			System.out.println("2.게임 전적");
			System.out.println("3.게임 종룍");
			System.out.println(" >>> " );
			sel = input.nextInt();
			
			switch(sel) {
			case 1:
				com = q1.ranNum();
				System.out.println("컴퓨터 숫자 : "+com);
				dummy =3;
				while(true) {
					if(dummy == 3) {
						System.out.println("=== START ===");
					}else if(dummy == 1) {
						System.out.println("=== U P ===");
						score ++;
					}else if(dummy == 2) {
						System.out.println("=== Down === ");
						score ++;
					}else
						score++;
					System.out.println(score+"회 만에 맞췄습니다!!!");
					result = q1.scoreCheck(score);
					score =0;
					if(result ==0) {
						System.out.println("최고기록을 갱신하셨습니다. \n");
					}
					break;
				}
				//입력부분
				System.out.println("Input Number -->");
				player = input.nextInt();
				//검사부분
				dummy = q1.comPlayerCheck(player);
			}
				break;
				case 2:
					if(q1.record() == 99 ) {
						System.out.println("게임을 시작하지 않앗습니다.");
						break;
					}
					System.out.println("최고 점수는 "+q1.record()+"회 입니다!!!");
					break;
				case 3:
					System.out.println("게임을 종료합니다!!!");
					return ;
		}
	}
}

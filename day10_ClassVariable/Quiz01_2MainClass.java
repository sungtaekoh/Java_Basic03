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
			System.out.println("1.���� ����");
			System.out.println("2.���� ����");
			System.out.println("3.���� ����");
			System.out.println(" >>> " );
			sel = input.nextInt();
			
			switch(sel) {
			case 1:
				com = q1.ranNum();
				System.out.println("��ǻ�� ���� : "+com);
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
					System.out.println(score+"ȸ ���� ������ϴ�!!!");
					result = q1.scoreCheck(score);
					score =0;
					if(result ==0) {
						System.out.println("�ְ����� �����ϼ̽��ϴ�. \n");
					}
					break;
				}
				//�Էºκ�
				System.out.println("Input Number -->");
				player = input.nextInt();
				//�˻�κ�
				dummy = q1.comPlayerCheck(player);
			}
				break;
				case 2:
					if(q1.record() == 99 ) {
						System.out.println("������ �������� �ʾѽ��ϴ�.");
						break;
					}
					System.out.println("�ְ� ������ "+q1.record()+"ȸ �Դϴ�!!!");
					break;
				case 3:
					System.out.println("������ �����մϴ�!!!");
					return ;
		}
	}
}

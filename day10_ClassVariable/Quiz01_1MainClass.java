package day10_ClassVariable;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
 * ���� 
 * ���������� �ȳ����µ� �� �ȳ������� �𸣰���
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
			if(answer == num) {
				cnt++;
				a.add(cnt);
				System.out.println(cnt+"ȸ ���� ������ϴ�!!");
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
		}else if(choice ==2) {//���� ����
			int score = 0;
			score = (int)a.get(0);
			for(int i =1; i<a.size();i++) {
				if(score < (int)a.get(i)) {
					score = (int)a.get(i);
				}else {
					
				}
			}
			System.out.println("�ְ� ������ "+score+"ȸ �Դϴ�!!!");
		}else if(choice == 3) {//���� ����
			break;
		}
		}
	}
}

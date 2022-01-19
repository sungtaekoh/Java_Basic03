package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz02_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap menu = new HashMap();
		
		boolean bool = true;
		String name = null;
		String money = null;
		String money2 = null;
		int num = 0;
		
		while(bool) {
			System.out.println("1.메뉴 등록 ");
			System.out.println("2.메뉴별 가겨 보기 ");
			System.out.println("3.종료");
			System.out.println(">>>");
			num = input.nextInt();
			switch(num) {
			case 1: //메뉴 등록
				
				break; 
			case 2:// 메뉴별 가격 보기
				break;
			case 3: //종료
				break;
			}
		}
	}
}

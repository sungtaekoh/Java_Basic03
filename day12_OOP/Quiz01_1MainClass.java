package day12_OOP;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz01_1MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz01_1Method ex = new Quiz01_1Method();
		HashMap hashMap = new HashMap();
		
		hashMap.put("메모장", "notepad");
		hashMap.put("계산기", "calc");
		
		int choice = 0;
		boolean bool = true;
		
		
		while(bool) {
			System.out.println("===== 환 영 합 니 다 =====");
			System.out.println("1.기능");
			System.out.println("2.off");
			System.out.println("입력 >>> ");
				choice = input.nextInt();
			if(choice == 1) {
				System.out.println("1 : 메모장");
				System.out.println("2 : 계산기");
					int num = input.nextInt(); //if문에서는 switch문과 달리 변수 안의 변수를 하나로 써도 작동한다
					if(num == 1) {//메모장
					ex.func01((String)hashMap.get("메모장"));
					}else if(num ==2) {//계산기
						ex.func01((String)hashMap.get("계산기"));
					}else {//잘 못 입력
						System.out.println("잘 못 된 입력입니다.");
					}
			}else {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
		}
		
	}
}

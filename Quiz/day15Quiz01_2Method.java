package Quiz;

import java.util.HashMap;
import java.util.Scanner;
//win7 기능 만들기
public class day15Quiz01_2Method {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	HashMap map = new HashMap();
	
	String s = null;
	
	map.put("계산기", "calc");
	map.put("메모장", "notepad");
	
	int choice2 =0;//win7 초기 선택 값
	
	while(true) {
		System.out.println("===== 환영합니다 ======");
		System.out.println("1.기능");
		System.out.println("2.off");
		System.out.println(">>>");
		choice2 = input.nextInt();
		switch (choice2) {
		case 1://기능
			System.out.println("[사용 가능]");
			System.out.println("계산기 메모장");
			System.out.println("사용 기능 입력 : ");
			s = input.next();
			if(map.containsKey(s)== true) {
				ProcessBuilder pro 
				= new ProcessBuilder((String)map.get(s));
				try {
					pro.start();
				}catch (Exception e) {
				}
			}else {
				System.out.println("잘 못된 입력입니다");
			}
			break;

		case 2://off
			break;
		}
		
	}
	
}
}

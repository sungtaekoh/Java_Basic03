package Quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class win7{
	public void win7Display(){
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		
		String s = null;
		int choice2 = 0;
		map.put("메모장", "notepad");
		map.put("계산기", "calc");
		
		while(true) {
			System.out.println("===== 환영합니다 =====");
			System.out.println("1.기능");
			System.out.println("2.off");
			choice2 = input.nextInt();
			switch(choice2) {
			case 1://기능
				System.out.println("[사용가능]");
				System.out.println("계산기 메모장");
				s = input.next();
				if(map.containsKey(s)==true) {
					ProcessBuilder pro 
					= new ProcessBuilder((String)map.get(s));
					try {
						pro.start();
					}catch (Exception e) {
					}
				}else {
					System.out.println("잘못된 입력입니다.");
				}
				break;
			case 2://off
				break;
			}
		}
	}
}
public class day15Quiz01_2MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList saveId = new ArrayList();
		ArrayList savePw = new ArrayList();
		String id = null;
		String pw = null;
		
		int choice1 = 0;
		
		while(true) {
			System.out.println("1.로그인 2.가입 3.로그아웃");
			System.out.println(">>>");
			choice1= input.nextInt();
			switch(choice1) {
			case 1://1.로그인
				System.out.println("아이디 입력 : ");
				id = input.next();
				System.out.println("비밀번호 입력 : ");
				pw = input.next();
				if(saveId.indexOf(id)!= -1 && savePw.indexOf(pw) != -1) {
					System.out.println("인증 통과");
				}else {
					System.out.println("인증 불가");
				}
				break;
			case 2://2.가입
				System.out.println("가입 id : ");
				id = input.next();
				if(saveId.indexOf(id)== -1) {
					saveId.add(id);
				System.out.println("가입 pw : ");
				pw = input.next();
					savePw.add(pw);
				}else {
					System.out.println("이미 존재하는 아이디입니다");
				}
				break;
			case 3://3.로그아웃
				if(saveId.indexOf(id)!= -1 && savePw.indexOf(pw) != -1) {
					System.out.println("로그아웃합니다");
					System.out.println("시스템을 종료합니다");
					System.exit(0);
				}else {
					System.out.println("시스템을 종료합니다");
					System.exit(0);
				}
				break;
			}
		}
	}
}

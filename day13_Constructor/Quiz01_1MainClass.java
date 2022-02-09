package day13_Constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01_1MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz01_1Method ex = new Quiz01_1Method ();
		
		ArrayList saveId = new ArrayList();
		ArrayList savePw = new ArrayList();
		
		boolean bool = true;
		String newId = null;
		String newPw = null;
		String logId = null;
		String logPw = null;
		
		while(bool) {
		System.out.println("1.로그인 2.가입 3.로그아웃");
		System.out.println(">>>");
		int num1 = input.nextInt();
		if(num1 == 1) {//로그인
			System.out.println("아이디 입력 : ");
			logId = input.next();
			System.out.println("비밀번호 입력 : ");
			logPw = input.next();
			if(saveId.indexOf(logId) != -1 && savePw.indexOf(logPw) != -1) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
		}else if(num1 == 2) {//가입
			System.out.println("가입할 id를 입력해 주세요 : ");
			newId = input.next();
			if(saveId.indexOf(newId) == -1) {
				saveId.add(newId);
			System.out.println("가입할 pw를 입력해 주세요 : ");
				newPw = input.next();
				savePw.add(newPw);
				System.out.println("가입에 성공하셨습니다.");
			}else if(saveId.indexOf(newId) != -1) {
				System.out.println("이미 존재하는 아이디입니다");
			}else {
				
			}
		}else if(num1 == 3) {//로그아웃
			
		}else {//잘 못 입력
			System.out.println("잘 못된 접근입니다. ");
		}
		
		}
	}
}

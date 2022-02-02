package day11_set_get;

import java.util.Scanner;
/*
 this.get.set을 활용하여 로그인창 만들기
 */
public class Quiz01_3MainClass {//내가 다시 푼 정답지
	public static void main(String[] args) {
		Quiz01_3Method ex = new Quiz01_3Method();
		Scanner input = new Scanner(System.in);
		
		String id = null;
		String pw = null;
		boolean bool = true;
		
		while(bool) {
			System.out.print("1.로그인  ");
			System.out.print("2.가입  ");
			System.out.println("3.로그아웃");
			System.out.println(">>>");
		int num = input.nextInt();	
		switch(num) {
		case 1:
			System.out.println("아이디 입력 : ");
				id = input.next();
			System.out.println("비밀번호 입력 : ");
				pw = input.next();
			ex.cal(id, pw);
			break;
		case 2://회원가입 
			System.out.println("아이디 입력 : ");
				id = input.next();
			System.out.println("비밀번호 입력 : ");
			 	pw = input.next();
			ex.setSaveId(id);
			ex.setSavePw(pw);
			System.out.println("회원가입에 성공하셨습니다.");
			break;
		case 3: //로그아웃
			System.out.println("로그아웃합니다");
			bool = false;
		}
		}
		
	}
}

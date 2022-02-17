package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

/*
 로그인을 win7를 상속시켜라
 인증통과시 윈도우 실행
*/
public class day15Quiz01_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList saveId = new ArrayList();
		ArrayList savePw = new ArrayList();
		String id = null;
		String pw = null;
		int choice = 0;
		
		while(true) {
		System.out.println("1.로그인 2.가입 3.로그아웃");
		System.out.println(">>>");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("아이디 입력 : ");
			id = input.next();
			System.out.println("비밀번호 입력 : ");
			pw = input.next();
			if(saveId.indexOf(id) != -1 && savePw.indexOf(pw) != -1) {
				System.out.println("로그인에 성공하셨습니다");
			}else {
				System.out.println("잘 못된 아이디입니다");
			}
			break;
		case 2:
			System.out.println("아이디 입력 :");
			id = input.next();
			if(saveId.indexOf(id)==-1) {
			System.out.println("비밀번호 입력 :");
			pw = input.next();
			saveId.add(id);
			savePw.add(pw);
			}else {
				System.out.println("이미 존재하는 아이디입니다");
			}
			break;
		case 3:
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
			break;
		}
		}
	}
}

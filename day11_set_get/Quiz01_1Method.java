package day11_set_get;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01_1Method {
	Scanner input = new Scanner(System.in);
		ArrayList saveId = new ArrayList();
		ArrayList savePw = new ArrayList();
		
		String id = null;
		String pw = null;
	public void newcheck() {
		System.out.println("아이디 입력 : ");
		id = input.next();
		if(saveId.indexOf(id) == -1) {
		System.out.println("비밀번호 입력 : ");
		pw = input.next();
		saveId.add(id);
		savePw.add(pw);
		System.out.println("회원가입에 성공하셧습니다");
		}
	}
	
	
}

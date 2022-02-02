package day11_set_get;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01_1Method {
	Scanner input = new Scanner(System.in);
		private ArrayList saveId = new ArrayList();
		private ArrayList savePw = new ArrayList();
		
		private String id = null;
		private String pw = null;
		
		public void setId(String id) {
			this.id = id;
		}
		
		public void setPw(String pw) {
			this.pw = pw;
		}
		public void setSaveId(ArrayList saveId) {
			this.saveId = saveId;
		}
		public void setSavePw(ArrayList savePw) {
			this.savePw = savePw;
		}
		
		public String getId() {
			return id;
		}
		
		public String getPw() {
			return pw;
		}
		public ArrayList getSaveId() {
			return saveId;
		}
		public ArrayList getSavePw() {
			return savePw;
		}
		
		
		public void login() {
			System.out.println("아이디 입력 : ");
			id = input.next();
			System.out.println("비밀번호 입력 :");
			pw = input.next();
			if(saveId.indexOf(id) != -1 && savePw.indexOf(pw) != -1){
				System.out.println("로그인에 성공하셨습니다.");
			}else {
				System.out.println("로그인에 실패하셨습니다.");
			}
		}
		
		public void newLog() {//회원가입
			System.out.println("아이디 입력 : ");
			String id = input.next();
			if(saveId.indexOf(id) == -1) {
			System.out.println("비밀번호 입력 : ");
			String pw = input.next();
			saveId.add(id);
			savePw.add(pw);
			System.out.println("회원가입 되셨습니다.");
			}else {
				System.out.println("이미 존재하는 아이디입니다");
			}
		}
		public boolean logout(boolean bool) {
			System.out.println("로그아웃 합니다");
			return bool;
		}
	
}

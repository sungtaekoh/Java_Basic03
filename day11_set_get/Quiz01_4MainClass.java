package day11_set_get;

import java.util.Scanner;

class Login {
	private String userId = null, userPw = null;

	public int compare(String userId, String userPw) {
		if (getUserId() != null && getUserPw().equals(userPw))
			return 0;//정답
		else
			return 1;//오답
	}

	public boolean out() {
		return false;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
}

public class Quiz01_4MainClass {// 선생님 정답
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Login lo = new Login();

		int num = 0, result = 0;
		String inputId = null, inputPw = null;
		boolean bool = true;

		while (bool) {
			System.out.println("1.로그인 2.가입 3.로그아웃 \n >>>>");
			num = input.nextInt();
			switch (num) {
			case 1:// 로그인
				System.out.println("아이디 입력 : ");
				inputId = input.next();
				System.out.println("비밀번호 입력 : ");
				inputPw = input.next();
				result = lo.compare(inputId, inputPw);
				if (result == 0)
					System.out.println("인증 통과");
				else
					System.out.println("인증 실패");
				break;
			case 2:
				System.out.println("가입 id : ");
				inputId = input.next();
				System.out.println("가입 pw : ");
				inputPw = input.next();
				lo.setUserId(inputId);
				lo.setUserPw(inputPw);
				System.out.println("저장 완료");
				break;
			case 3:
				bool = lo.out();
				System.out.println("종료 합니다.");
			}
		}

	}

}

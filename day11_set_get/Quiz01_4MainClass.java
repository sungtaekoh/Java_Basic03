package day11_set_get;

import java.util.Scanner;

class Login {
	private String userId = null, userPw = null;

	public int compare(String userId, String userPw) {
		if (getUserId() != null && getUserPw().equals(userPw))
			return 0;//����
		else
			return 1;//����
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

public class Quiz01_4MainClass {// ������ ����
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Login lo = new Login();

		int num = 0, result = 0;
		String inputId = null, inputPw = null;
		boolean bool = true;

		while (bool) {
			System.out.println("1.�α��� 2.���� 3.�α׾ƿ� \n >>>>");
			num = input.nextInt();
			switch (num) {
			case 1:// �α���
				System.out.println("���̵� �Է� : ");
				inputId = input.next();
				System.out.println("��й�ȣ �Է� : ");
				inputPw = input.next();
				result = lo.compare(inputId, inputPw);
				if (result == 0)
					System.out.println("���� ���");
				else
					System.out.println("���� ����");
				break;
			case 2:
				System.out.println("���� id : ");
				inputId = input.next();
				System.out.println("���� pw : ");
				inputPw = input.next();
				lo.setUserId(inputId);
				lo.setUserPw(inputPw);
				System.out.println("���� �Ϸ�");
				break;
			case 3:
				bool = lo.out();
				System.out.println("���� �մϴ�.");
			}
		}

	}

}

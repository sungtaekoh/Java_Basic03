package Quiz;

import java.util.HashMap;
import java.util.Scanner;

class win7Quiz{
	private String[] name;
	private String[] info;
	public win7Quiz(String c, String m, String cPath, String mPath) {
		name = new String[2];
		name[0] = c;
		name[1] = m;
		info = new String[2];
		info[0] = cPath;
		info[1] = mPath;
	}
	public void function(String funcName) {
		String[] name = getName();
		String[] info = getInfo();
		HashMap map = new HashMap();
		for(int i =0;i<name.length; i++) {
			map.put(name[i], info[i]);
		}
		if(map.containsKey(funcName)) {
			System.out.println(map.get(funcName)+"��� �մϴ�");
		}else {
			System.out.println("���� ����Դϴ�");
		}
		}
		public void funcPrint() {
			System.out.println("[��밡��]");
			String[] name = getName();
			for(int i =0;i<name.length;i++) {
				System.out.println(name[i]+" ");
			}
			System.out.println();
		}
		public String[] getName() {
			return name;
		}
		public String[] getInfo() {
			return info;
		}
		public void display() {
			Scanner input = new Scanner(System.in);
			System.out.println("===== ȯ���մϴ� =====");
			int sel =0;
			String funcName = null;
			while(true) {
				System.out.println("1.���");
				System.out.println("2.off");
				System.out.println("�Է� >>>");
				sel = input.nextInt();
				switch(sel) {
				case 1:
					funcPrint();
					System.out.println("����� ��� �Է� : ");
					funcName = input.next();
					function(funcName);
					break;
				case 2:
					return;
				}
			}
		}
	}
class Login extends win7Quiz{
	private String userId = null, userPw = null;
	public Login(String c, String m, String cPath, String mPath) {
		super(c,m,cPath,mPath);
	}
	public int compare(String id, String pw) {
		if(getUserId() != null && getUserPw() != null)
			if(getUserId().equals(id) && getUserPw().equals(pw))
				return 0;
			else return 1;
		return 1;
	}
	public void saveId_Pw(String id, String pw) {
		setUserId(id);
		setUserPw(pw);
	}
	public boolean out() {
		return false;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String id) {
		this.userId = id;
		}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String pw) {
		this.userPw = pw;
	}
}
public class day15Quiz01T {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num =0;
	int result =0;
	String inputId = null;
	String inputPw = null;
	boolean flag = true;
	
	Login lo = new Login("����", "�޸���", "calc", "notepad");
	
	while(flag) {
		System.out.println("1.�α��� 2.���� 3.�α׾ƿ� \n>>>");
		num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("���̵� �Է� : ");
			inputId = input.next();
			System.out.println("��й�ȣ �Է� : ");
			inputPw = input.next();
			if(result ==0) {
				System.out.println("�������");
				lo.display();
				System.out.println("���α׷� ����");
				return;
			}else
				System.out.println("���� ����");
			break;
		case 2:
			System.out.println("���� id : ");
			inputId = input.next();
			System.out.println("���� pw : ");
			inputPw = input.next();
			lo.saveId_Pw(inputId, inputPw);
			System.out.println("���� �Ϸ�");
			break;
		case 3:
			flag = lo.out();
			System.out.println("���� �մϴ�");
		}
	}
}
}

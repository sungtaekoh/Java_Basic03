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
			System.out.println("���̵� �Է� : ");
			id = input.next();
			System.out.println("��й�ȣ �Է� :");
			pw = input.next();
			if(saveId.indexOf(id) != -1 && savePw.indexOf(pw) != -1){
				System.out.println("�α��ο� �����ϼ̽��ϴ�.");
			}else {
				System.out.println("�α��ο� �����ϼ̽��ϴ�.");
			}
		}
		
		public void newLog() {//ȸ������
			System.out.println("���̵� �Է� : ");
			String id = input.next();
			if(saveId.indexOf(id) == -1) {
			System.out.println("��й�ȣ �Է� : ");
			String pw = input.next();
			saveId.add(id);
			savePw.add(pw);
			System.out.println("ȸ������ �Ǽ̽��ϴ�.");
			}else {
				System.out.println("�̹� �����ϴ� ���̵��Դϴ�");
			}
		}
		public boolean logout(boolean bool) {
			System.out.println("�α׾ƿ� �մϴ�");
			return bool;
		}
	
}

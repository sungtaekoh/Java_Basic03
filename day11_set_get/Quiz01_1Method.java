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
		System.out.println("���̵� �Է� : ");
		id = input.next();
		if(saveId.indexOf(id) == -1) {
		System.out.println("��й�ȣ �Է� : ");
		pw = input.next();
		saveId.add(id);
		savePw.add(pw);
		System.out.println("ȸ�����Կ� �����ϼ˽��ϴ�");
		}
	}
	
	
}

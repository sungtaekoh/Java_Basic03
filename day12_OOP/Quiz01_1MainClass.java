package day12_OOP;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz01_1MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz01_1Method ex = new Quiz01_1Method();
		HashMap hashMap = new HashMap();
		
		hashMap.put("�޸���", "notepad");
		hashMap.put("����", "calc");
		
		int choice = 0;
		boolean bool = true;
		
		
		while(bool) {
			System.out.println("===== ȯ �� �� �� �� =====");
			System.out.println("1.���");
			System.out.println("2.off");
			System.out.println("�Է� >>> ");
				choice = input.nextInt();
			if(choice == 1) {
				System.out.println("1 : �޸���");
				System.out.println("2 : ����");
					int num = input.nextInt(); //if�������� switch���� �޸� ���� ���� ������ �ϳ��� �ᵵ �۵��Ѵ�
					if(num == 1) {//�޸���
					ex.func01((String)hashMap.get("�޸���"));
					}else if(num ==2) {//����
						ex.func01((String)hashMap.get("����"));
					}else {//�� �� �Է�
						System.out.println("�� �� �� �Է��Դϴ�.");
					}
			}else {
				System.out.println("�ý����� �����մϴ�.");
				System.exit(0);
			}
		}
		
	}
}

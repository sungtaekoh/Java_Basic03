package day11_set_get;

import java.util.Scanner;

/*
 �α��� ��� �����
 -Ŭ���� ���·� ��ɺ��� �����
 -this,get,set Ȱ���ؼ� �����
 */
/*
  �۵��� �� �Ǵµ� �̷��� �ϴ°� �´��� �𸣰ڴ�
  ���� ������ private���� �����ߴµ� �� ������ �����Ѱɱ�
  set�� ������� �ʾ������� ���̴�
 */
public class Quiz01_1MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 Quiz01_1Method ex = new  Quiz01_1Method ();
		boolean bool =true;
		int choice = 0;
		
		while(bool) {
		System.out.print("1.�α���  ");
		System.out.print("2.����	");
		System.out.print("3.�α׾ƿ�	");
		choice = input.nextInt();
		if(choice == 1) {
			ex.login();
		}else if(choice ==2) {
			ex.newLog();
		}else if(choice ==3) {
			bool = ex.logout(false);
		}else {
			System.out.println("�� �� �� �����Դϴ�");
		}
		
		}
		
	}
}

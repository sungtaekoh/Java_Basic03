package day11_set_get;

import java.util.Scanner;

/*
 로그인 기능 만들기
 -클래스 형태로 기능별로 만들것
 -this,get,set 활용해서 만들것
 */
/*
  작동은 잘 되는데 이렇게 하는게 맞는지 모르겠다
  변수 설정을 private으로 설정했는데 왜 접근이 가능한걸까
  set을 사용하지 않았음에도 말이다
 */
public class Quiz01_1MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 Quiz01_1Method ex = new  Quiz01_1Method ();
		boolean bool =true;
		int choice = 0;
		
		while(bool) {
		System.out.print("1.로그인  ");
		System.out.print("2.가입	");
		System.out.print("3.로그아웃	");
		choice = input.nextInt();
		if(choice == 1) {
			ex.login();
		}else if(choice ==2) {
			ex.newLog();
		}else if(choice ==3) {
			bool = ex.logout(false);
		}else {
			System.out.println("잘 못 된 선택입니다");
		}
		
		}
		
	}
}

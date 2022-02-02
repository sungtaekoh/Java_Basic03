package day11_set_get;

import java.util.Scanner;

/*
 로그인 기능 만들기
 -클래스 형태로 기능별로 만들것
 -this,get,set 활용해서 만들것
 */
public class Quiz01_1MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean bool =true;
		int choice = 0;
		
		while(bool) {
		System.out.print("1. 로그인");
		System.out.print("2. 가입");
		System.out.print("3. 로그아웃");
		choice = input.nextInt();
		if(choice == 1) {
			
		}else if(choice ==2) {
			
		}else if(choice ==3) {
			
		}else {
			System.out.println("잘 못 된 선택입니다");
		}
		
		}
		
	}
}

package day12_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("윈도우 실행 명령어 입력");
		String s = input.next();
		
		ProcessBuilder pro = new ProcessBuilder(s);
		//윈도우 명령어 실행시켜주는 기능
		
		try {
			pro.start();
			//시작시켜주는 기능
			//try,catch가 있어야 사용가능하다.
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
}

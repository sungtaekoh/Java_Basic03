package day14_Exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("나이 입력 :");
		try {
			age = input.nextInt();
			if(age < 0) {
				throw new Exception("그런 나이는 없다");
			}
			System.out.println("당신의 나이는 " + age);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("다음 문장들 실행");
	}
}

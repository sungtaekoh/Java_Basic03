package day10_ClassVariable;

import java.util.Scanner;
/*
 * 인스턴스 변수로 선언
 * 입력, 출력 기능으로 나누세요
 */
public class Ex08_ST {
	int age;
	String name;
	public void display() {//입력 - 입력된 값이 인스턴스로 저장
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		name = input.next();
		System.out.println("나이 입력 : ");
		age = input.nextInt();
		print();
	}
	public void print() {//출력 입력기능을 통해 저장된 인스턴스 값을 불러서 출력함
		System.out.println("이릅 : "+name);
		System.out.println("나이 : "+age);
	}
}

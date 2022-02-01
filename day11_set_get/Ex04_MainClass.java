package day11_set_get;

import java.util.Scanner;
/*
객체 생성 후 setter을 통해 각각의 값을 저장
나이를 만으로 계산하는 메소드 생성 후 age 저장
저장된 값을 getter을 통해 main에서 출력
??님의 나이는 ??살 입니다.
*/
public class Ex04_MainClass {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Ex04_set_get ex = new  Ex04_set_get();
	
	String name;
	int age;
	System.out.println("이름 입력 : "); name = input.next();
	System.out.println("나이 입력 : "); age = input.nextInt();
	
	ex.setName(name);
	ex.setAge(age);
//	ex.calAge(age);
	System.out.println(ex.getName()+"님의 나이는 "+ex.getAge()+"살 입니다");
}
}
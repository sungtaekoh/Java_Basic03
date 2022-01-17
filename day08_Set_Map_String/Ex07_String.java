package day08_Set_Map_String;

import java.util.Scanner;

public class Ex07_String {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = new String();
//		String str; //위의 코드와 같은 뜻이다
		System.out.println("문자열 입력");
		str = input.next();
		System.out.println("입력받은 문자열 : "+str);
	}
}

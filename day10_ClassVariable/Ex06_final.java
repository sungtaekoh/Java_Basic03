package day10_ClassVariable;

import java.util.Scanner;

public class Ex06_final {//final : 변경 못하게 막는다
	public final String KOREA = "대한민국";
	public void func() {
		System.out.println("변경전 KOREA : "+KOREA);
		Scanner input = new Scanner(System.in);
		System.out.println("입력");
//		KOREA = input.next();  //final을 사용해서 변경 불가
		System.out.println("변경 후 KOREA : "+KOREA);
	}
}

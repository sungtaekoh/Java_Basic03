package day09_method;

import java.util.Scanner;

/*
이전의 거꾸로 수를 반환하는 메소드를, 각각의 기능별로 만드시오
*/	
public class Quiz06_2Method {//정답

	public int reverse(int su) {
		int temp=0, result=0;
		while(true) {
			temp = su%10;
			su = su/10;
					result = (result+temp)*10;
			if(su ==0) return result/10;
		}
	}
	public int inData() {
		Scanner input = new Scanner(System.in);
		int su =0;
		System.out.println("수 입력 : ");
		su = input.nextInt();
		return su;
	}
	public void display() {
		int su = inData();
		int result = reverse(su);
		System.out.println(su+" 거꾸로 => "+ result);
	}
}

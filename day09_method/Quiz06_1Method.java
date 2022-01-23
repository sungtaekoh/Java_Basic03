package day09_method;

import java.util.ArrayList;
import java.util.Scanner;


/*
 이전의 거꾸로 수를 반환하는 메소드를, 각각의 기능별로 만드시오
 */	
public class Quiz06_1Method {//실패
	public void reverse() {// 입력
		Scanner input = new Scanner(System.in);
	
		System.out.println("수 입력 : ");
		int su = input.nextInt();
		int result = cal(su);
		print(result);
	}
	
		public int cal(int su) {
			ArrayList arr = new ArrayList();
			ArrayList p = new ArrayList();
			
		while(true) {
			int temp= su%10;
			su = su/10;
			arr.add(temp);
			if(su == 0 ) {
				break;
				}
			}
		for(int i=0; i<arr.size();i++) {
			 p =  (ArrayList) arr.get(i);
			return 1;
		}
		return 0;
	}
		
		public void print(int result) {//
			System.out.println(result);
		}
		
		
}
		
package day09_method;

import java.util.ArrayList;
import java.util.Scanner;


/*
 이전의 거꾸로 수를 반환하는 메소드를, 각각의 기능별로 만드시오
 */
public class Quiz06_1Method {
	public void reverse() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("수 입력 : ");
		int su = input.nextInt();
		int result = cal(su);
		System.out.println(result);
//		print(result);
	}
	
		public int cal(int su) {
			ArrayList arr = new ArrayList();
			
		while(true) {
			int temp= su%10;
			su = su/10;
			arr.add(temp);
			if(su == 0 ) {
				for(int i=0; i<arr.size();i++) {
					int result(i) = (int) arr.get(i);
					
				}
			}
		}
	}
		
		public void print(int result) {
			
		}
		
		
}

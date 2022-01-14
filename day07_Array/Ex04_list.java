package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_list {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		int num=0;
		String addNum, printNum;
		System.out.println("만들 공간의 개수 입력 : ");
		num = input.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("추가할 수 입력 : ");
			addNum = input.next();
			arr.add(addNum);
		}
		System.out.println("---- 저장 값 출력 ----");
		for(int i=0 ; i<arr.size() ; i++) {
			System.out.println(arr.get(i));
		}
	}
}

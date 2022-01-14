package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_list {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList food = new ArrayList();
		food.add("설탕");
		food.add("소금");
		food.add("라면");
		food.add("계란");
		System.out.println(food);
		System.out.println("찾을 값 입력 : ");
		String n = input.next();
		System.out.println(n+"위치 : "+food.indexOf(n) );
		/*
		 indexof :
		해당하는 값이 없으면 -1
		해당하는 값이 존재하면 위치정보가 나온다
		*/
		
		System.out.println("변경할 위치 입력 : ");
		int num = input.nextInt();
		System.out.println("변경할 값 입력 : ");
		n = input.next();
		System.out.println("변경 전\n"+food);
		food.set(num, n);
		System.out.println("변경 후 \n"+food);
	}
}

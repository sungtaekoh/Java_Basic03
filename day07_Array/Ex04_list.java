package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_list {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		int num=0;
		String addNum, printNum;
		System.out.println("���� ������ ���� �Է� : ");
		num = input.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("�߰��� �� �Է� : ");
			addNum = input.next();
			arr.add(addNum);
		}
		System.out.println("---- ���� �� ��� ----");
		for(int i=0 ; i<arr.size() ; i++) {
			System.out.println(arr.get(i));
		}
	}
}

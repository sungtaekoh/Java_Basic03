package day12_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ ���� ��ɾ� �Է�");
		String s = input.next();
		
		ProcessBuilder pro = new ProcessBuilder(s);
		//������ ��ɾ� ��������ִ� ���
		
		try {
			pro.start();
			//���۽����ִ� ���
			//try,catch�� �־�� ��밡���ϴ�.
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
}

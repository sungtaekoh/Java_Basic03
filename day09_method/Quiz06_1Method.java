package day09_method;

import java.util.ArrayList;
import java.util.Scanner;


/*
 ������ �Ųٷ� ���� ��ȯ�ϴ� �޼ҵ带, ������ ��ɺ��� ����ÿ�
 */	
public class Quiz06_1Method {//����
	public void reverse() {// �Է�
		Scanner input = new Scanner(System.in);
	
		System.out.println("�� �Է� : ");
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
		
package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList telName = new ArrayList();
		ArrayList telNum = new ArrayList();
		boolean bool = true;
		int choice = 0;
		String name = null;
		int num = 0;
		int result = 0;
		
		while(bool) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.println(">>>");
			choice = input.nextInt();
			switch(choice) {
				case 1: //1.연락처 등록
					System.out.println("이름 입력 :");
					name = input.next();
					if(telName.indexOf(name) == -1) {
						System.out.println("연락처 입력 : ");
						num = input.nextInt();
						telName.add(name);
						telNum.add(num);
						System.out.println("성공적으로 저장되었습니다.");
					}else {
						System.out.println("이미 존재하는 연락처입니다.");
					}break;
				case 2://2.연락처 보기
					System.out.println("찾을 이름 입력 : ");
					name = input.next();
					if(telName.indexOf(name) != -1) {
						result = telName.indexOf(name);
						System.out.print(telName.get(result)+" : ");
						System.out.println(telNum.get(result));
					}else {
						System.out.println("존재하지 않는 연락처 입니다.");
					}break;
				case 3://3.연락처 삭제
					System.out.println("삭제 할 이름 입력 : ");
					name = input.next();
					if(telName.indexOf(name) != -1) {
						result = telName.indexOf(name);
						telName.remove(result);
						telNum.remove(result);
						System.out.println("성공적으로 "+name+"님이 삭제 되셨습니다.");
					}else {
						System.out.println("존재하지 않는 연락처 입니다.");
					}break;
				case 4://4.모든 연락처 보기
					if(telName.size()!=0) {
					for(int i =0 ; i<telName.size();i++) {
						System.out.print(telName.get(i)+" : ");
						System.out.println(telNum.get(i));
					}
					}else {
						System.out.println("저장된 연락처가 없습니다.");
					}
					break;
				case 5:
					System.out.println("종료.");
					bool = false;
			}
		}
		
	}
}

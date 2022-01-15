package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;


public class Quiz03_2 {//실패
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList telNum = new ArrayList(); //전화번호부 번호 
		ArrayList telName = new ArrayList(); //전화번호부 이름
		int choice = 0; //초기 선택
		String name = null;//초기 이름 저장
		int num = 0; //초기 번호저장
		int i=0;//식 계산 할 때 사용
		
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.println(">>>");
			choice = input.nextInt();
			if(choice == 1) { //연락처 등록
				System.out.println("이름 입력 : ");
				name = input.next();
				telName.add(name);
				System.out.println("연락처 입력 : ");
				num = input.nextInt();
				telNum.add(num);
				System.out.println("성공적으로 저장되었습니다.");
				System.out.println(telNum.get(0)+"을 저장하였습니다");
				System.out.println("성공적으로 저장 되었습니다!!");
			}else if(choice == 2) {//연락처 보기
				System.out.println("찾을 이름 입력 : ");
				name = input.next();
			}else if (choice == 3) {//연락처 삭제
				System.out.println("삭제할 ");
			}else if(choice == 4) {//모든 연락처 보기
				System.out.println("모든 연락처 보기");
			}else if(choice == 5) {//종료
				System.out.println("종료");
			}
		}
	}
}

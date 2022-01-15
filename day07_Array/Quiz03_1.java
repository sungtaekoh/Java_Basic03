package day07_Array;
import java.util.ArrayList;
/*
 * 연락처 저장 프로그램 만들기
 * (ArrayList 2개를 사용하여 만드시오.)
 * 하나의 리스트 : 이름 정보
 * 하나의 리스트 : 연락처 정보
 * 1.연락처 등록 :  이름과, 전화번호 (중복 허용 안됨)
 * 2.연락처 보기 : 등록되어 있지 않으면 목록에 없습니다
 * 3.연락처 삭제 : 목록ㅇ에 없으면 목록에 없습니다
 * 4.모든 연락처 보기 : 등록되어 있는 목록 전부 출력
 */
import java.util.Scanner;

public class Quiz03_1 {
	public static void main(String[] args) {//이번 클래스 실패
		Scanner input = new Scanner(System.in);
		ArrayList telName = new ArrayList();
		ArrayList telNum = new ArrayList();
//		telName 전화번호부 이름 저장한 곳
//		telNum 전화번호부 번호 저장한 곳
		int choice = 0;// 메뉴에서 선택
		String name = null;//연락처 저장 이름
		String name2 = null;//찾는 연락처 
		int num = 0; //연락처 입력 받는곳
		int num2 = 0; //연락처 찾는곳
		
		while(true) {
		System.out.println("1.연락처 등록");
		System.out.println("2.연락처 보기");
		System.out.println("3.연락처 삭제");
		System.out.println("4.모든 연락처 보기");
		System.out.println("5.종료");
		System.out.println(">>>");
		choice = input.nextInt();
		if(choice == 1) {//1.연락처 등록
			System.out.println("이릅 입력 : ");
			name = input.next();
			telName.add(name);
			System.out.println("연락처 입력 : ");
			num = input.nextInt();
			telNum.add(num);
			System.out.println(telName.get(0));
			System.out.println(telNum.get(0));
			System.out.println("저장 완료!!");
		}else if(choice == 2) {//2.연락처 보기
			System.out.println("찾을 이름 입력 : ");
			name2 = input.next();
			if(name2.equals(name)) {
				System.out.println("연락처 찾았다");
			}else {
				System.out.println(name2+"님은 목록에 없습니다");
			}
			
		}else if(choice == 3) {//3.연락처 삭제
			System.out.println("3번 선택");
		}else if(choice == 4) {//4.모든 연락처 보기
			System.out.println("4번 선택");
		}else if(choice == 5) {//5.종료
			System.out.println("5번 선택");
		}
		}
		
	}
}

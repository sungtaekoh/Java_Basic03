package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03_4 {// 복습 완료! 정답
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			ArrayList telName = new ArrayList();
			ArrayList telNum = new ArrayList();
			boolean bool = true;
			int choice = 0;
			String name = null;
			int num = 0;
			int result =0;
			
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
					System.out.println("이름 입력 : ");
					name = input.next();
					if(telName.indexOf(name)==-1) {
						System.out.println("연락처 입력 : ");
						num = input.nextInt();
						telName.add(name);
						telNum.add(num);
					}else {
						System.out.println("이미 존재하는 이름입니다");
					}
					break;
				case 2: //2.연락처 보기
					System.out.println("찾을 이름 입력 : ");
					name = input.next();
					if(telName.indexOf(name) != -1) {
					result = telName.indexOf(name);
					System.out.println("이름  : "+telName.get(result));
					System.out.println("연락처 : "+telNum.get(result));
					}else {
						System.out.println("존재하지 않는 연락처 입니다");
					}break;
				case 3 : //3.연락처 삭제
					System.out.println("삭제할 연락처 이름 입력 : ");
					name = input.next();
					if(telName.indexOf(name)!=-1) {
						result = telName.indexOf(name);
						telName.remove(result);
						telNum.remove(result);
						System.out.println("연락처가 성공적으로 삭제되었습니다.");
					}else {
						System.out.println("존재하지 않는 연락처 입니다.");
					}
					break;
				case 4 : //4.모든 연락처 보기
					for(int i=0;i<telName.size();i++) {
						System.out.println("이름  : "+telName.get(i));
						System.out.println("연락처 : "+telNum.get(i));
					}
					break;
				case 5 : //종료
					System.out.println("종료");
					bool = false;
			}
			}
		
		
		}
}

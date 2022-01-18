package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 2번 선택시 수정, 삭제를 추가하시오
 * 수정: 없는메뉴면 없다. 있으면 가격 수정 가능
 * 삭제: 없는 메뉴면 없다. 있으면 삭제 가능
 */
public class Quiz02_1 {//실패
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap menu = new HashMap();
		
		
		boolean bool = true;
		int choice = 0;
		String name = null;
		String money = null;
		String money2 =null;
		
		while(bool) {
		System.out.println("1.메뉴 등록");
		System.out.println("2.메뉴별 가격 보기");
		System.out.println("3.종료");
		System.out.println(">>>");
		choice = input.nextInt();
		if(choice ==1 ) {//1. 메뉴등록
		System.out.println("메뉴 입력 : ");
		name = input.next();
		if(menu.containsKey(name)!=true) {
			System.out.println("가격 입력 : ");
			money = input.next();
			menu.put(name, money);
			System.out.println("성공적으로 입력되었습니다.");
		}else {
			System.out.println("이미 존재하는 메뉴입니다.");
		}
		}else if(choice ==2) {//2.메뉴별 가격보기
			Iterator it = menu.keySet().iterator();
			while(it.hasNext()==true) {
				System.out.println(it.next()+" : "+menu.get(name));
			}
			System.out.print("1.수정  ");
			System.out.print("2.삭제  ");
			System.out.print("3.나가기");
			choice = input.nextInt();//
			switch(choice) {
			case 1://1.수정
				System.out.println("변경 메뉴이름 입력 : ");
				name = input.next();
				if(menu.containsKey(name)==true) {
					money = (String)menu.get(name);
					menu.remove(name);
					System.out.println("변경할 메뉴 이름 입력 : ");
					name = input.next();
					System.out.println("수정 가격 입력 : ");
					money2 = input.next();
					menu.put(name, money2);
					System.out.println(money+"->"+menu.containsKey(name));
				}else {
					System.out.println("잘 못된 입력입니다. \n 다시입력해 주세요.");
				}
				break;
			case 2://2.삭제
				System.out.println("삭제할 메뉴 입력 : ");
				name = input.next();
				if(menu.containsKey(name)==true) {
					menu.remove(name);
					System.out.println("성공적으로 삭제되었습니다.");
				}
				break;
			case 3://3.나가기
				System.out.println("나가기");
				break;
			}
		}else if(choice==3) {
			
		}else {
			System.out.println("잘 못된 입력입니다. \n 다시입력해주세요.");
		}
		}
		
		
		
	}
}

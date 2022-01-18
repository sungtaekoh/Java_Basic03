package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 HashMap을 이용하여 간단한 메뉴판 만들기
 1.메뉴등록 :  존재하는 메뉴면 존재하는 메뉴입니다
 1.메뉴 등록
 2.메뉴별 가격 보기
 3.종료
 >>>
 */
public class Quiz01_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap menu = new HashMap();
		
		int choice = 0;
		boolean bool = true;
		String key = null;
		String value = null;
		
		while(bool) {
		System.out.println("1.메뉴 등록");
		System.out.println("2.메뉴별 가격 보기");
		System.out.println("3.종료");
		System.out.println(">>>");
		choice = input.nextInt();
		switch(choice) {
		case 1://1.메뉴등록
			System.out.println("메뉴 입력 : ");
			key = input.next();
			if(menu.containsKey(key)!=true) {
			System.out.println("가격 입력 : ");
			value = input.next();
			menu.put(key, value);
			System.out.println("등록 되었습니다.");
			}else {
				System.out.println("이미 존재하는 메뉴입니다.");
			}
			break;
		case 2://2.메뉴별 가격 보기
			Iterator it = menu.keySet().iterator();
			while(it.hasNext()==true) {
				System.out.println(it.next()+" : "+menu.get(key));
			}
			break;
		case 3://3.종료
			System.out.println("종료합니다.");
			bool=false;
		}
		
		}
	}
}

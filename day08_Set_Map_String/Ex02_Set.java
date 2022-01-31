package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		
		Iterator it = arr.iterator();
		//ArrayList의 경우는 인덱스로 가져올 수 있지만 hashset의 경우 순서가 없기 때문에 iterator를 사용한다
		
		
//		System.out.println(it.hasNext());//다음 값이 존재하는지 물어본다 참, 거짓으로 표기
//		System.out.println(it.next());//일
	//  System.out.println(it.next());//이
	//	System.out.println(it.next());//삼
		//다음 값이 있으면 꺼내온다
		
		System.out.println(it.hasNext());//다음 값이 존재하는가?
		System.out.println(it.next()); //값을 출력한다 + 확인 대상을 다음으로 넘겨준다
		System.out.println(it.hasNext());
		System.out.println(it.next());
//		System.out.println(it.hasNext()); 
//		System.out.println(it.next()); 
		//it.hasNext가 false값일 때 출력하면 에러가 나온다
	
		
		//위의 식을 반복문으로 나타내기
		while(it.hasNext() == true) {
			System.out.println(it.next());
		}
		System.out.println("========");
//		while(it.hasNext() == true) {
//			System.out.println(it.next());
//		}
		
		//중복이 안된다 중복을 하려면 Iterator it = arr.iterator();를 다시 얻어와야한다
		
		
	}
}

package day08_Set_Map_String;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("일");
		set.add("이");
		set.add("삼");
		System.out.println("set : "+set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext() == true) {
//			형변환
//			Object o = it.next(); //오브젝트로만 입력할 수 있는 코드
//			String s = (String)o; //String으로 저장하고 싶을경우 이러한 방법으로 형변환을 해주어야마 한다.
//			String s = (String)it.next(); //위의 두코드를 요약한것
//			System.out.println(s); //위의 코드를 출력하면 결과를 확인 할 수 있다
		
			System.out.println(it.next());
		}
	}
}

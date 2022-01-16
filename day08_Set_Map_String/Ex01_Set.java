package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01_Set {
	public static void main(String[] args) {
		/*
		 Set
		 -HashSet
		 -TreeSet..등
		 HashSet
		 -순서 유지가 안된다.(인덱스 사용 못 함)
		 -데이터의 중복을 허용하지 않는다.
		 */
		HashSet hs = new HashSet();
		hs.add("라면");
		hs.add("김밥");
		hs.add("순대");
		hs.add("김밥");
		System.out.println("hs : "+hs);
		hs.remove("김밥"); //해당하는 항목 삭제
		System.out.println("hs : "+hs);
		
		ArrayList arr = new ArrayList();
		arr.add("라면");
		arr.add("김밥");
		arr.add("순대");
		arr.add("김밥");
		System.out.println("arr : "+arr);
	}
}

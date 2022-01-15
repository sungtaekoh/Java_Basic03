package day07_Array;

import java.util.ArrayList;

public class Ex03_list {
	public static void main(String[] args) {
		/*
		  List
		 - ArrayList
		 - LinkedList
		 - Stack...등이 있다.
		 
		  ArrayList
		  -데이터에 대한 순서가 있다. index로 접근 가능하다
		  -중복된 데이터를 저장할 수 있다.
		  -배열과는 다르게 서로 다른 자료형도 넣을 수 있다.
		  -가변의 크기를 갖는다./ 공간이 자동으로 늘어나거나 줄어든다
		 */
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add(456);
		
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println( arr.size() );//크기를 재어준다
		
		//contains : 해당하는 값이 존재하는지 참,거짓으로 알려줌
		System.out.println(arr.contains("123"));
		System.out.println(arr.contains("1231"));
		
		//remove :  해당하는 값을 삭제한다
//		System.out.println( arr.remove("123"));//123을 지워라
		System.out.println(arr.remove(1)); //1번째 값을 지워라
		System.out.println(arr);
		System.out.println(arr.get(0));
		
		//clear : 해당하는 내용 전체를 지운다
		arr.clear();
		System.out.println("삭제 후 arr : "+arr);
	}
}

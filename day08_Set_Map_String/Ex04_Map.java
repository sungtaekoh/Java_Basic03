package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;





public class Ex04_Map {
	public static void main(String[] args) {
		/*
		 Map
		 -HashMap
		 -TreeMap
		 -HashTable...등
		 
		 HashMap
		 - key와 값의 쌍이다
		 - 순서는 유지되지 않는다
		 - 키에 대한 중복은 허용하지 않는다. (value에 대한 중복은 허용한다.)
		 */
		HashMap map = new HashMap(); //순서가 섞인다
//		LinkedHashMap map = new LinkedHashMap(); //순서가 유지된다
		map.put("선풍기", "1000만원");
		map.put("자동차", "10만원");
		map.put("에어컨", "30만원");
		
		System.out.println(map);
		
		System.out.println(map.get("선풍기"));//키를 통해서 value값을 출력.
		System.out.println(map.get("자동차"));
		System.out.println(map.get("에어컨"));
		System.out.println(map.get("없는키"));//없는키는 null로 표기된다.
		
		System.out.println(map.containsKey("에어컨"));//키에 해당하는 벨류값이 존재하는지 참, 커짓으로 표기
		System.out.println(map.containsKey("에어컨111"));
		
		System.out.println(map.containsValue("30만원"));//true
		System.out.println(map.containsValue("31만원"));//false
		//해당하는 벨류에 존재하는 키가 있는지 참, 거짓으로 표기
		
		System.out.println(map.remove("에어컨")); //해당하는 키 삭제
		System.out.println(map.containsKey("에어컨"));//삭제가 잘 되었는지 확인
		System.out.println(map);//전부 출력해서 확인
		
		System.out.println(map.keySet());//해당하는 (키들만)을 전부 표기
		
//		Set s = map.keySet(); //mep.keySet();은 Set으로 받아주어야 한다
//		Iterator it = s.iterator();
		Iterator it = map.keySet().iterator();
		while(it.hasNext() == true) {
			String key = (String)it.next();
			System.out.println(key+" : "+map.get(key));
		}
	}
}

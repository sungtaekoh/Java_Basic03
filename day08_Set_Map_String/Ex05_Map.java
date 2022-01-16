package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
//		HashMap<String, String> map = new HashMap<String, String>();
//		<> : 제네릭이라고 부른다 <>안에 들어가는 형태의 값만 받아들인다.
		String key = null, value = null;
		System.out.println("저장할 키 입력 : ");
		key = input.next();
		System.out.println("저장할 값 입력 : ");
		value = input.next();
		
		map.put(key, value);
		System.out.println(map);
	}
}

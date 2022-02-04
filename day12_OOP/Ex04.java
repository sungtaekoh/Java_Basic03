package day12_OOP;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap();

		map.put("메모장", "notepad");
		map.put("계산기", "calc");
		map.put("그림판", "mspaint");
		
		System.out.println(map);
//		정리해서 출력하려면 이터레이터 사용
		
//		System.out.println(map.containsKey("메모장"));
//		map.containsKey(key) : 참 거짓으로 표기해주는 기능
		
		System.out.println("실행 명령어 입력 : ");
		String key = sc.next();
		if(map.containsKey(key) ==true ) {
			ProcessBuilder pro = new ProcessBuilder((String)map.get(key));
//			ProcessBuilder :  스트링밖에 받질 못하기 때문에 형변환을 해주어야 한다.
		
			try {
				pro.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("해당 명령어는 존재하지 않습니다.");
		}
		
	}
}

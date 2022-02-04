package day12_OOP;

import java.util.HashMap;

public class Quiz01_1Method {
	
	public void func01(String n) {// 입력받아 시스템 구현해주는 기능
		ProcessBuilder pro = new ProcessBuilder(n);
		try {
			pro.start();
		}catch (Exception e) {
		}
	}
	
	
}

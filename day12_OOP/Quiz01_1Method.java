package day12_OOP;

import java.util.HashMap;

public class Quiz01_1Method {
	
	public void func01(String n) {// �Է¹޾� �ý��� �������ִ� ���
		ProcessBuilder pro = new ProcessBuilder(n);
		try {
			pro.start();
		}catch (Exception e) {
		}
	}
	
	
}

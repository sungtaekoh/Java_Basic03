package day16_overriding_interface;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("������ ����Դϴ�");
	}
	
	@Override
	public Object get(int i) {
		return "�������� get�̴�";
	}
}
public class Ex02_Main {
	public static void main(String[] args) {
	AA a = new AA();
//	ArrayList arr = new ArrayList();
//	String s;
	
//	extends�� ����ϸ� ���Ǽ��� �� ����
	a.add("�ȳ��ϼ���");
	System.out.println("���� �� : "+a.get(0));
	}
}

package day16_overriding_interface;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("������ ����Դϴ�");
	}
	
	public Object get(int modCount) {
		return super.get(modCount);
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

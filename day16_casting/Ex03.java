package day16_casting;

import java.util.ArrayList;

class B{
	public void bbb() {}
}

class AAA {
	public String getText() {return "AAAŬ����";}
}
public class Ex03 {
	public static void main(String[] args) {
		Object a = new AAA();
//		�θ����·� �޾��ָ� �������̵��� �� ���־�� �Ѵ�
//		�θ��� ��ɹۿ� ������� ���ϱ� ���� 
		
		AAA aa = (AAA)a;
		aa.getText();
//		downcasting : �θ��� ���¸� �ٽ� �ڱ��ڽ����� ��ȯ
		
		ArrayList arr = new ArrayList();
		arr.add("test");
		String s = (String)arr.get(0);
	}
}

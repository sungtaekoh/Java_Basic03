package day16_overriding;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("������ ����Դϴ�");
	}
	
	@Override
	public Object get(int i) {
		return "�������� get�̴�";
	}
	public boolean add(Object o) {
		System.out.println("�߰��ϴ� ��� �Դϴ�.");
		return true;
	}
}

final class BB {//extends String ��� �Ұ�, final�� ���̸� ��ӺҰ�
	String s = new String();//final�̶�� ���ִ� ����� ��� �Ұ�, �������̵� �Ұ�
	String ss;
	
}
class CC {//extends BB{
	BB b = new BB();//��ӺҰ��϶� �̷��� ������� ����Ѵ�
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

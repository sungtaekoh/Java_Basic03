package day09_method;

public class Ex05Method {
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum; //��ȯ���°� int �����־���Ѵ�
	}
	public void test(int n) {
		// void :���� ���� ����  
		if(n == 1) {
			System.out.println("if");
		}else {
			System.out.println("else");
			return;
			// return : ���� �����ִ� ��� �ܿ��� �ش��ϴ� �޼ҵ带 �����ϴ� ��ɵ� �ִ�.
		}
		System.out.println("test �޼ҵ� ����");
	}
	
	public String test02() {
		int num =1;
		if(num ==1) {
			return "111.111";
		}else
			return null;
//		return null; //if�� ���� ������ ��츦 ����� ������� �����־�� ������ ������ �ʴ´�.
	}
}

package day11_set_get;

public class Ex03_MainClass {
	public static void main(String[] args) {
		Ex03_set_get ex = new Ex03_set_get();
//		ex.num = 123456; //private�̱� ������ ���� �Ұ�
//		������ �޼ҵ�� �����Ͽ� ������ �����Ѵ�.
//		ex.func(12345);
		ex.setNum(12345);
		ex.print();
		int num = ex.getNum() - 1000;
		System.out.println("���� ��� : "+num);
		
	}

}

package day13_Constructor;


	class Constructor01{
		public Constructor01(String s) {
			System.out.println("������ ����");
		}//������ : ������ �ʾƵ� �ڵ����� �����Ǹ� ���� �ڵ���̵� ����ȴ�.
		
		public Constructor01() {
			System.out.println("default ������ ����");
		}
		
		public void test(String s) {
			System.out.println(s+ " : test ����");
		}
		
		public void test() {
			System.out.println("�⺻ �׽�Ʈ");
		}
		
	}
	
	public class Ex01_Constructor {
	public static void main(String[] args) {
		/*
		 ������ ���
		 - ���� �ʱ�ȭ�ϰ��� �Ҷ� ����Ѵ�
		 - ��ü�� �����ɶ� �ڵ����� ȣ��ȴ�
		 
		 ������ ����� ���
		 - Ŭ���� �̸��� �����ϰ� �����.
		 -��ȯŸ���� ����� �Ѵ�
		 */
		Constructor01 con = new Constructor01("������");
		Constructor01 con01 = new Constructor01();
		//�����ε� �����ָ� �ȴ�
		
		con.test("�׽�Ʈ");
		con.test();
		//���� �ε� :���� �̸��� �޼ҵ带 �ٸ��� ����Ѵ�
		
	}
}

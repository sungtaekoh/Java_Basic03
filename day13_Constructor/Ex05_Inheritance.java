package day13_Constructor;

class Calc01{// �θ�Ŭ����
	
	public Calc01(String s){
		System.out.println("calc �θ� ������");
	}
	
	public void display() {
		System.out.println("���� �����");
	}
}

class computer01 extends Calc01{ //�ڽ�Ŭ����
	//��ӹ��� �޼ҵ尡 ����ȴ� ��, �켱������ �ڽ� �޼ҵ�
	/*
	public void display() {
		System.out.println("���� �����");
	}
	*/
	
	public computer01(){
		super("�� ����"); //�ش��ϴ� �θ�����ڿ� ������
		System.out.println("com �ڽ� ������");
	}
	
	public void print() {
		System.out.println("���� ��ǻ�;�");
	}
}

public class Ex05_Inheritance {
	public static void main(String[] args) {
		/*
		 ���
		 - extends�� ���� �����.
		 - ���ο� ����� �߰��Ѵ�.
		 */
		
//		Calc01 ca  = new Calc01();
//		ca.display();
		
		computer01 com = new computer01();
//�������� ��� ��ӹ��� �θ�Ŭ������ ���� ���� -> �ڽ�Ŭ���� ������ ����
		
		com.print(); 
		com.display();
	}
}

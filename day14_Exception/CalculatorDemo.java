package day14_Exception;

class Calculator{
	int left, right;
	public void setOprands(int left, int right) {//L : 10, R : 0/ 0���� ������ �����߻�
		this.left = left;
		this.right = right;
	}
	public void divide() {
		System.out.println("�������");
		System.out.println(this.left/this.right);//0���� ���ڸ� �����鼭 ������ �߻�
		System.out.println("�Դϴ�");
	}
}
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();//�����ڵ�
	}
}

package day14_Exception;

class Calculator02{
	int left, right;
	public void setOprands(int left, int right) {//L : 10, R : 0/ 0���� ������ �����߻�
		this.left = left;
		this.right = right;
	}
	public void divide() {
//		������� ������ �߻��߽��ϴ� : / by zero
		try {
		System.out.println("�������");
		System.out.println(this.left/this.right);//0���� ���ڸ� �����鼭 ������ �߻�
		System.out.println("�Դϴ�");
		}catch (Exception e) {
			System.out.println("������ �߻��߽��ϴ� : "+e.getMessage());
		}
	}
}
public class CalculatorDemo02 {
	public static void main(String[] args) {
		Calculator02 c02 = new Calculator02();
		c02.setOprands(10, 0);
		c02.divide();//�����ڵ�
	}
}

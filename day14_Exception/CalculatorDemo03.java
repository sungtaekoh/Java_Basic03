package day14_Exception;

class Calculator03{
	int left, right;
	public void setOprands(int left, int right) {//L : 10, R : 0/ 0���� ������ �����߻�
		this.left = left;
		this.right = right;
	}
	public void divide() {
		try {
		System.out.println("�������");
		System.out.println(this.left/this.right);//0���� ���ڸ� �����鼭 ������ �߻�
		System.out.println("�Դϴ�");
		}catch (Exception e) {
			/* ������ ������ ���� ���ϰ� ������ �˷��ش�
			 �������
e.getMessage()
/ by zero

e.toString()
java.lang.ArithmeticException: / by zero

e.printStackTrace()
java.lang.ArithmeticException: / by zero
	at day14_Exception.Calculator03.divide(CalculatorDemo03.java:12)
	at day14_Exception.CalculatorDemo03.main(CalculatorDemo03.java:26)

			 */
			System.out.println("\n\n e.getMessage()\n"+e.getMessage());
			System.out.println("\n\n e.toString()\n"+e.toString());//������� exception���� �˷��ش�
			System.out.println("\n\n e.printStackTrace()");
			e.printStackTrace(); //���������� ������ ȭ�鿡 ������ش�
//			���������, ��� �������� ���
		}
		System.out.println("Divide End");
//		try���� �ڵ带 ��������ش�
//		������ ���ܵ� �����°� �ƴϰ� �̾ �ڵ带 �����ų �� �ִ�.
	}
}
public class CalculatorDemo03 {
	public static void main(String[] args) {
		Calculator03 c03 = new Calculator03();
		c03.setOprands(10, 0);
		c03.divide();//�����ڵ�
	}
}

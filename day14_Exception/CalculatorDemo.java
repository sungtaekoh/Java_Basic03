package day14_Exception;

class Calculator{
	int left, right;
	public void setOprands(int left, int right) {//L : 10, R : 0/ 0으로 나누면 에러발생
		this.left = left;
		this.right = right;
	}
	public void divide() {
		System.out.println("계산결과는");
		System.out.println(this.left/this.right);//0으로 숫자를 나누면서 에러가 발생
		System.out.println("입니다");
	}
}
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();//에러코드
	}
}

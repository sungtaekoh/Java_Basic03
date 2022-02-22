package day14_Exception;

class Calculator02{
	int left, right;
	public void setOprands(int left, int right) {//L : 10, R : 0/ 0으로 나누면 에러발생
		this.left = left;
		this.right = right;
	}
	public void divide() {
//		계산결과는 오류가 발생했습니다 : / by zero
		try {
		System.out.println("계산결과는");
		System.out.println(this.left/this.right);//0으로 숫자를 나누면서 에러가 발생
		System.out.println("입니다");
		}catch (Exception e) {
			System.out.println("오류가 발생했습니다 : "+e.getMessage());
		}
	}
}
public class CalculatorDemo02 {
	public static void main(String[] args) {
		Calculator02 c02 = new Calculator02();
		c02.setOprands(10, 0);
		c02.divide();//에러코드
	}
}

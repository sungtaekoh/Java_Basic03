package day14_Exception;

class Calculator03{
	int left, right;
	public void setOprands(int left, int right) {//L : 10, R : 0/ 0으로 나누면 에러발생
		this.left = left;
		this.right = right;
	}
	public void divide() {
		try {
		System.out.println("계산결과는");
		System.out.println(this.left/this.right);//0으로 숫자를 나누면서 에러가 발생
		System.out.println("입니다");
		}catch (Exception e) {
			/* 밑으로 내려갈 수록 상세하게 에러를 알려준다
			 계산결과는
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
			System.out.println("\n\n e.toString()\n"+e.toString());//어떤형태의 exception인지 알려준다
			System.out.println("\n\n e.printStackTrace()");
			e.printStackTrace(); //내부적으로 에러를 화면에 출력해준다
//			어떤에러인지, 어디서 에러인지 등등
		}
		System.out.println("Divide End");
//		try밖의 코드를 실행시켜준다
//		에러가 생겨도 끝나는게 아니고 이어서 코드를 진행시킬 수 있다.
	}
}
public class CalculatorDemo03 {
	public static void main(String[] args) {
		Calculator03 c03 = new Calculator03();
		c03.setOprands(10, 0);
		c03.divide();//에러코드
	}
}

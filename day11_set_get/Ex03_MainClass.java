package day11_set_get;

public class Ex03_MainClass {
	public static void main(String[] args) {
		Ex03_set_get ex = new Ex03_set_get();
//		ex.num = 123456; //private이기 때문에 접근 불가
//		떄문에 메소드로 접근하여 변수를 변경한다.
//		ex.func(12345);
		ex.setNum(12345);
		ex.print();
		int num = ex.getNum() - 1000;
		System.out.println("연산 결과 : "+num);
		
	}

}

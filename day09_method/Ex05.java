package day09_method;

public class Ex05 {
	public static void main(String[] args) {
		Ex05Method ex = new Ex05Method();
		int s = ex.sumFunc(10, 20);
//		메소드가 궁금하면 F5번으로 들어가 확인해보자
		
		System.out.println("두 합 : "+s);
		
		/*
		 디버깅 
		 F5 : 해당 메소드 들어가서 보기
		 F6 : 다음 줄로 이동
		 */
		
		System.out.println("=========================================================");
		ex.test(1);
		
		System.out.println("=========================================================");
		ex.test(2);
		String ss = ex.test02();
		System.out.println(ss);
		System.out.println(ex.test02());
	}
}

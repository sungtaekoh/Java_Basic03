package day10_ClassVariable;
//랜덤
public class Ex02_Random {
	public static void main(String[] args) {
		for(int i =0; i<5;i++) {
			int ran = (int)(Math.random()*3)+10;
			System.out.println(ran);
//			System.out.println((int)(Math.random()*3)+1);//1~3까지의 범위의 수를 구한다
			/*
			  Math.random() :랜덤한 수를 나오게 한다
			  Math.random()*3 : 나오는 수의 범위가 3이하로 늘어난다
			  (int)Math.random() : 정수만 랜덤으로 나오게 된다
			 */
		}
	}
}

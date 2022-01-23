package day10_ClassVariable;

public class MainClass {
	public static void main(String[] args) {
		Ex05_Variable.cnt = 888; //static을 사용하여 객체화 없이도 사용가능
		System.out.println(Ex05_Variable.cnt);
		
		Ex05_Variable.func();
		
		
//		Ex05_Variable ex = new Ex05_Variable();
//		ex.cnt = 888;
	}
}

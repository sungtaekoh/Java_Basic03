package day11_set_get;

public class Ex02_This {
	public int age; //0으로 초기화 하여도 출력값은 똑같이 나온다. 입력값
//	String s; //인스턴스 변수는 자동으로 초기화 된다
	public void ageFunc(int age) { 
		this.age = age-1;
//		String s = null; //지역변수는 반드시 초기화를 시켜주어야 한다
//		System.out.println("s : "+s);
		}
	public void printAge() {
		System.out.println("당신의 나이 : "+age);}
}

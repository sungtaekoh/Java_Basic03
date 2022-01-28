package day11_set_get;

public class Ex01_This {
	//범위
	public int a = 10;
	public void func01() {
		int a = 12345; //func01안에 a라는 값이 있기때문에 안의 있는 값을 우선시 한다
		System.out.println("01 a : "+this.a);//this : 바깥의 있는 값을 찾는다
		System.out.println("this " + this);
//		this.func02();
//		func02();
	}
	public void func02() {//func02안에 값이 없기 때문에 밖에 있는 a값을 사용한다.
		System.out.println("02 a : "+a);
	}
}

package day06_interface_ex;

public interface A공방 {
	public void attack();
	public void defense();
//	public abstract void defense();
//	위의 코드와 같은 뜻 abstract를 생략해도 된다. 보통은 안 써둔다.
	
	/*
	 interface에서는 실체화가 되어있는 코드는 넣어둘 수 없다
	 추상화 코드만 넣어둘 수 있다.

	 public void test() {
		System.out.println("test");
	}
	에러 뜸
	 */
}

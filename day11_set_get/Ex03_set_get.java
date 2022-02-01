package day11_set_get;

public class Ex03_set_get {
	private int num;//자바에서는 변수를 프라이빗으로 은닉하여 주로 사용한다.
	private int age;
	private String name;
	/*
	 * 변수를 세팅하는 메소드는 set***으로 만든다
	 */
	/*
	public void setNum(int num) {//num이라는 변수에 세팅을 해준다라는 뜻의 메소드이름
		this.num = num;
	}
	public void setAge(int age) {//age란 변수에 세팅을 해준다는 뜻의 메소드이름
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	*/
	
	public void print() {
		System.out.println("num : "+num);
	}

	public void setNum(int num) {//자바 규칙 : 첫글자는 소문자 합성어의 첫글자는 대문자
		this.num = num;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getName() {//private 값을 불러오는 기능
		return name;
	}
}

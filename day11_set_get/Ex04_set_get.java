package day11_set_get;

public class Ex04_set_get {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age-1;
	}
	/*
	 내가 푼 것
	public void calAge( int age) {//만나이 출력 메소드
		int calAge = age - 1;
		this.setAge(calAge);
	}
	*/
}

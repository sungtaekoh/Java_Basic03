package day11_set_get;

public class Ex03_set_get {
	private int num;//�ڹٿ����� ������ �����̺����� �����Ͽ� �ַ� ����Ѵ�.
	private int age;
	private String name;
	/*
	 * ������ �����ϴ� �޼ҵ�� set***���� �����
	 */
	/*
	public void setNum(int num) {//num�̶�� ������ ������ ���شٶ�� ���� �޼ҵ��̸�
		this.num = num;
	}
	public void setAge(int age) {//age�� ������ ������ ���شٴ� ���� �޼ҵ��̸�
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	*/
	
	public void print() {
		System.out.println("num : "+num);
	}

	public void setNum(int num) {//�ڹ� ��Ģ : ù���ڴ� �ҹ��� �ռ����� ù���ڴ� �빮��
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
	
	public String getName() {//private ���� �ҷ����� ���
		return name;
	}
}

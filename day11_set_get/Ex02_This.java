package day11_set_get;

public class Ex02_This {
	public int age; //0���� �ʱ�ȭ �Ͽ��� ��°��� �Ȱ��� ���´�. �Է°�
//	String s; //�ν��Ͻ� ������ �ڵ����� �ʱ�ȭ �ȴ�
	public void ageFunc(int age) { 
		this.age = age-1;
//		String s = null; //���������� �ݵ�� �ʱ�ȭ�� �����־�� �Ѵ�
//		System.out.println("s : "+s);
		}
	public void printAge() {
		System.out.println("����� ���� : "+age);}
}

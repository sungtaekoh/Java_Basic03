package interface_ex;

class A����{
	public void ����() {
		System.out.println("������ �����մϴ�");
	}
	public void ���() {
		System.out.println("������ ����մϴ�.");
	}
}
class A����{
	public void �̻��ϰ���() {
		System.out.println("����Ⱑ �����մϴ�");
	}
	public void ����() {
		System.out.println("����Ⱑ �� �մϴ�");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		A����  army = new A����();
		army.����();
		army.���();
		
		A���� airForce = new A����();
		airForce.����();
	}
}

package interface_ex;

class A지상군{
	public void 공격() {
		System.out.println("지상군이 공격합니다");
	}
	public void 방어() {
		System.out.println("지상군이 방어합니다.");
	}
}
class A공군{
	public void 미사일공격() {
		System.out.println("비행기가 공격합니다");
	}
	public void 막자() {
		System.out.println("비행기가 방어를 합니다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		A지상군  army = new A지상군();
		army.공격();
		army.방어();
		
		A공군 airForce = new A공군();
		airForce.막자();
	}
}

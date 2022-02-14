package day16_overriding_interface;

public class NewFerrari extends Ferrari {
	public NewFerrari(int ye, int speed) {
		super(ye, speed);
	}
	public void autoSystem() {
		System.out.println("자동운전 모드를 시작합니다");
	}
	public void speed() {//부모의 메소드와 똑같이 만듬 자식거가 실행됌
		System.out.println(getYe()+"년 페라리 속도"+getSpeed()+"km 입니다");
		System.out.println("터보 엔진으로 동작합니다");
//		overriding : 부모에 있는것에 동일한 메소드를 만들어 업데이트 시켜준다
	}
	
}

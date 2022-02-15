package abstract_ex;

abstract class Abstract{

protected int num;
public void setNum(int num) {
	this.num = num;
}

/*
 추상화
 잠시 코드를 없애는것
 업데이트 코드를 잊어먹을 경우를 대비하여 확인하기위해 사용한다.
 public void combo() {
	System.out.println(num+" 단 콤보 공격");
}
*/
public abstract void combo();//추상화 : 틀만 만들어 둔다. 예약해두는 느낌
}

class NewAbstract extends Abstract{
	@Override 
	public void combo() {
		System.out.println(num+"단 콤보 & 2대");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Abstract a = new NewAbstract();
		a.setNum(3);
		a.combo();
	}
}

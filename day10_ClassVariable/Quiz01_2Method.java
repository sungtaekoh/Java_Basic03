package day10_ClassVariable;

public class Quiz01_2Method {
	public int com,min = 99;
	public int ranNum() {
		com = (int)(Math.random()*99+1);
		return com;
	}
	public int scoreCheck(int score) {
		if(min>score) {
			min = score;//최고 기록 저장
			return 0;
		}
		return 1;
	}
	public int comPlayerCheck(int player) {
		if(player > com) 
			return 2;
		else if(player < com)
			return 1;
		return 4;
	}
	public int record() { 
		return min;
	}
}

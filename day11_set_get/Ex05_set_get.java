package day11_set_get;

public class Ex05_set_get {//이러한 식으로 게터,세터를 사용하여 클래스로 나타낸것을 캡슐화라고 한다.
	private int kor, eng, math, sum;
	private double avg;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int k, int e, int m) {
		this.sum = k+e+m;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double sum) {
		this.avg = sum/3;
	}
	
	
}

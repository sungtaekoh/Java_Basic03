package day11_set_get;
//객체 생성 후 각각의 값(kor, eng, math, sum, avg)을 저장하세요
//출력 하세요(국,영,수,합,평균)
public class Ex05_MainClass {
	public static void main(String[] args) {
		Ex05_set_get ex = new Ex05_set_get();
		int k = 100, e=90, m=80;
		
		ex.setKor(k);
		ex.setEng(e);
		ex.setMath(m);
		ex.setSum(k,e,m);
		ex.setAvg(ex.getSum());
		System.out.println("국어 : "+ex.getKor());
		System.out.println("영어 : "+ex.getEng());
		System.out.println("수학 : "+ex.getMath());
		System.out.println("합게 : "+ex.getSum());
		System.out.println("평균 : "+ex.getAvg());
	}
}

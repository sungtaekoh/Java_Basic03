package day11_set_get;
//��ü ���� �� ������ ��(kor, eng, math, sum, avg)�� �����ϼ���
//��� �ϼ���(��,��,��,��,���)
public class Ex05_MainClass {
	public static void main(String[] args) {
		Ex05_set_get ex = new Ex05_set_get();
		int k = 100, e=90, m=80;
		
		ex.setKor(k);
		ex.setEng(e);
		ex.setMath(m);
		ex.setSum(k,e,m);
		ex.setAvg(ex.getSum());
		System.out.println("���� : "+ex.getKor());
		System.out.println("���� : "+ex.getEng());
		System.out.println("���� : "+ex.getMath());
		System.out.println("�հ� : "+ex.getSum());
		System.out.println("��� : "+ex.getAvg());
	}
}

package day10_ClassVariable;
//����
public class Ex02_Random {
	public static void main(String[] args) {
		for(int i =0; i<5;i++) {
			int ran = (int)(Math.random()*3)+10;
			System.out.println(ran);
//			System.out.println((int)(Math.random()*3)+1);//1~3������ ������ ���� ���Ѵ�
			/*
			  Math.random() :������ ���� ������ �Ѵ�
			  Math.random()*3 : ������ ���� ������ 3���Ϸ� �þ��
			  (int)Math.random() : ������ �������� ������ �ȴ�
			 */
		}
	}
}

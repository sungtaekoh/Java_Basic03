package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		 long time = System.currentTimeMillis();//�� ������ ���´�
//		 System.currentTimeMillis(); ���� �ð��� ������ ���
		 System.out.println(time);
		
		 //������ �����Ѵ� = ������
		 SimpleDateFormat s = //Ʋ�� �����
//				 new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		 new SimpleDateFormat("yyyy��MM��dd�� aa hh��mm��ss��");
//		 ���� : ����� �¾ƾ��Ѵ�
		 
		 String str = s.format(time);
		 System.out.println("time : "+str);
				 
		 System.out.println("================================================");
		 Date d = new Date();
		 //util�� �ִ� date��� 	���� ����

		 System.out.println("date : "+d);
		 System.out.println("format(d) : "+s.format(d));
//		 s.format�Ʊ� ���� Ʋ�� ����Ͽ� ��°��� ���� ���� ���ѹ������ ���� �� �ִ�.
		 
		 System.out.println("===============================================");
		 
		 Calendar cal = Calendar.getInstance();
		 System.out.println("cal : "+cal);//��ü ũ�� �Ű� �� �ᵵ �ȴ�.
		 System.out.println( cal.get(Calendar.YEAR));//��
		 System.out.println(cal.get(Calendar.MONTH)+1);//�� 0���� �����ϱ� ������ 1�� �����־�� �Ѵ�
		 System.out.println(cal.get(Calendar.DATE));//��
	}
}

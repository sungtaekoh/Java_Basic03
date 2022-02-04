package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		 long time = System.currentTimeMillis();//초 단위로 나온다
//		 System.currentTimeMillis(); 현재 시간을 얻어오는 기능
		 System.out.println(time);
		
		 //형식을 변경한다 = 포멧팅
		 SimpleDateFormat s = //틀을 만든다
//				 new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		 new SimpleDateFormat("yyyy년MM월dd일 aa hh시mm분ss초");
//		 조건 : 영어는 맞아야한다
		 
		 String str = s.format(time);
		 System.out.println("time : "+str);
				 
		 System.out.println("================================================");
		 Date d = new Date();
		 //util에 있는 date사용 	날자 정보

		 System.out.println("date : "+d);
		 System.out.println("format(d) : "+s.format(d));
//		 s.format아까 만든 틀을 사용하여 출력값을 내가 보기 편한방법으로 만들 수 있다.
		 
		 System.out.println("===============================================");
		 
		 Calendar cal = Calendar.getInstance();
		 System.out.println("cal : "+cal);//객체 크게 신경 안 써도 된다.
		 System.out.println( cal.get(Calendar.YEAR));//년
		 System.out.println(cal.get(Calendar.MONTH)+1);//월 0부터 시작하기 때문에 1을 더해주어야 한다
		 System.out.println(cal.get(Calendar.DATE));//일
	}
}

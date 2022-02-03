package day11_set_get;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
/*
  시간 -시,분,초 설정 + 알람설정, 알람울림
  날짜 -년,월,일 설정 + 일정설정, 일정알람
 */
public class Quiz04_1WatchMainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz04_1WatchMethod ex = new Quiz04_1WatchMethod();
		HashMap hashMap = new HashMap();
		
		boolean bool = true;
		boolean bool2 = true;
		int hour =0, minute =0;
		int month =0, day=0;
		int alamHour =0, alamMinute =0;
		int alamMonth =0, alamDay =0;
		
		while(bool) {
			System.out.println("1.시간");
			System.out.println("2.날짜");
			int choice = input.nextInt();
				while(bool2) {
					switch(choice) {
					case 1:// 시간
						System.out.println("1.시간 +1");
						System.out.println("2.시간 -1");
						System.out.println("3.분 +1");
						System.out.println("4.분 -1");
						System.out.println("5.알람 설정");
						System.out.println("6.돌아가기");
						System.out.println(">>>");
						int num = input.nextInt();
							if(num == 1) {//시간 +1
								System.out.println("시간 +1 ");
								hour = hour +1;
								ex.setHour(hour);
								ex.time();
								ex.TimeCal();
							}else if(num == 2) {//시간 -1
								System.out.println("시간 -1 ");
								hour = hour -1;
								ex.setHour(hour);
								ex.time();
								ex.TimeCal();//시간을 계산하는 기능은 분과 시간 모두에 넣어주어야 작동한다.
							}else if(num == 3) {//분 +1
								System.out.println("분 +1");
								minute = minute +1;
								ex.setMinute(minute);
								ex.time();
								ex.TimeCal();
							}else if(num == 4) {//분 -1
								System.out.println("분 -1");
								minute = minute -1;
								ex.setMinute(minute);
								ex.time();
								ex.TimeCal();
							}else if(num == 5) {//알람설정
								System.out.println("원하는 시간을 설정하세요.");
								System.out.println(">>> :");
								System.out.println("시간 : ");
								alamHour = input.nextInt();
								System.out.println("분 : ");
								alamMinute = input.nextInt();
								ex.setAlamHour(alamHour);
								ex.setAlamMinute(alamMinute);
								ex.alamTime();
							}else if(num == 6) {//돌아가기
								System.out.println("돌아가기 실행");
								bool2 = false;
							}else {//잘못된 입력
								System.out.println("잘못 된 입력입니다.");
							}
							break;
					case 2:// 날짜
						System.out.println("1.월 +1");
						System.out.println("2.월 -1");
						System.out.println("3.일 +1");
						System.out.println("4.일 -1");
						System.out.println("5.알람 설정");
						System.out.println("6.돌아가기");
						System.out.println(">>>");
						int num2 = input.nextInt();
							if(num2 == 1) {//시간 +1
								System.out.println("월 +1 ");
								month = month +1;
								ex.setMonth(month);
								ex.day();
								ex.dayCal();
							}else if(num2 == 2) {//시간 -1
								System.out.println("월 -1 ");
								month = month -1;
								ex.setMonth(month);
								ex.day();
								ex.dayCal();
							}else if(num2 == 3) {//분 +1
								System.out.println("일 +1");
								day = day +1;
								ex.setDay(day);
								ex.day();
								ex.dayCal();
							}else if(num2 == 4) {//분 -1
								System.out.println("일 -1");
								day = day -1;
								ex.setDay(day);
								ex.day();
								ex.dayCal();
							}else if(num2 == 5) {//알람설정
								System.out.println("원하는 날짜를 설정하세요.");
								System.out.println(">>> :");
								System.out.println("월 : ");
								alamMonth = input.nextInt();
								System.out.println("일 : ");
								alamDay = input.nextInt();
								ex.setAlamMonth(alamMonth);
								ex.setAlamDay(alamDay);
								ex.alamDay();
							}else if(num2 == 6) {//돌아가기
								System.out.println("돌아가기 실행");
								bool2 = false;
							}else {//잘못된 입력
								System.out.println("잘못 된 입력입니다.");
							}
						break;
					}
					
				}
			
		}
	} 
}

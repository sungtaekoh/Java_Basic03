package day11_set_get;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
/*
  �ð� -��,��,�� ���� + �˶�����, �˶��︲
  ��¥ -��,��,�� ���� + ��������, �����˶�
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
			System.out.println("1.�ð�");
			System.out.println("2.��¥");
			int choice = input.nextInt();
				while(bool2) {
					switch(choice) {
					case 1:// �ð�
						System.out.println("1.�ð� +1");
						System.out.println("2.�ð� -1");
						System.out.println("3.�� +1");
						System.out.println("4.�� -1");
						System.out.println("5.�˶� ����");
						System.out.println("6.���ư���");
						System.out.println(">>>");
						int num = input.nextInt();
							if(num == 1) {//�ð� +1
								System.out.println("�ð� +1 ");
								hour = hour +1;
								ex.setHour(hour);
								ex.time();
								ex.TimeCal();
							}else if(num == 2) {//�ð� -1
								System.out.println("�ð� -1 ");
								hour = hour -1;
								ex.setHour(hour);
								ex.time();
								ex.TimeCal();//�ð��� ����ϴ� ����� �а� �ð� ��ο� �־��־�� �۵��Ѵ�.
							}else if(num == 3) {//�� +1
								System.out.println("�� +1");
								minute = minute +1;
								ex.setMinute(minute);
								ex.time();
								ex.TimeCal();
							}else if(num == 4) {//�� -1
								System.out.println("�� -1");
								minute = minute -1;
								ex.setMinute(minute);
								ex.time();
								ex.TimeCal();
							}else if(num == 5) {//�˶�����
								System.out.println("���ϴ� �ð��� �����ϼ���.");
								System.out.println(">>> :");
								System.out.println("�ð� : ");
								alamHour = input.nextInt();
								System.out.println("�� : ");
								alamMinute = input.nextInt();
								ex.setAlamHour(alamHour);
								ex.setAlamMinute(alamMinute);
								ex.alamTime();
							}else if(num == 6) {//���ư���
								System.out.println("���ư��� ����");
								bool2 = false;
							}else {//�߸��� �Է�
								System.out.println("�߸� �� �Է��Դϴ�.");
							}
							break;
					case 2:// ��¥
						System.out.println("1.�� +1");
						System.out.println("2.�� -1");
						System.out.println("3.�� +1");
						System.out.println("4.�� -1");
						System.out.println("5.�˶� ����");
						System.out.println("6.���ư���");
						System.out.println(">>>");
						int num2 = input.nextInt();
							if(num2 == 1) {//�ð� +1
								System.out.println("�� +1 ");
								month = month +1;
								ex.setMonth(month);
								ex.day();
								ex.dayCal();
							}else if(num2 == 2) {//�ð� -1
								System.out.println("�� -1 ");
								month = month -1;
								ex.setMonth(month);
								ex.day();
								ex.dayCal();
							}else if(num2 == 3) {//�� +1
								System.out.println("�� +1");
								day = day +1;
								ex.setDay(day);
								ex.day();
								ex.dayCal();
							}else if(num2 == 4) {//�� -1
								System.out.println("�� -1");
								day = day -1;
								ex.setDay(day);
								ex.day();
								ex.dayCal();
							}else if(num2 == 5) {//�˶�����
								System.out.println("���ϴ� ��¥�� �����ϼ���.");
								System.out.println(">>> :");
								System.out.println("�� : ");
								alamMonth = input.nextInt();
								System.out.println("�� : ");
								alamDay = input.nextInt();
								ex.setAlamMonth(alamMonth);
								ex.setAlamDay(alamDay);
								ex.alamDay();
							}else if(num2 == 6) {//���ư���
								System.out.println("���ư��� ����");
								bool2 = false;
							}else {//�߸��� �Է�
								System.out.println("�߸� �� �Է��Դϴ�.");
							}
						break;
					}
					
				}
			
		}
	} 
}

package day11_set_get;

import java.util.Scanner;

public class Quiz02_1RadioMainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz02_1RadioMethod ex = new Quiz02_1RadioMethod();
		
		boolean bool = true;
		int channel =0;
		int volume =0;
		
		while(bool) {
			System.out.println("1.���� Ŵ");
			System.out.println("2.���� ��");
			int choice = input.nextInt();
			while(bool) {
				switch(choice) {
				case 1://���� ��
					System.out.println("1.ä�� +1");
					System.out.println("2.ä�� -1");
					System.out.println("3.���� +1");
					System.out.println("4.���� -1");
					System.out.println("5.�� ��");
					 int num = input.nextInt();
					if(num == 1) {
						System.out.println("ä�� +1");
						channel = channel+1;
						ex.setChannel(channel);
						System.out.println("���� ä�� : "+ex.getChannel());
						break;
					}else if(num == 2) {
						System.out.println("ä�� -1");
						channel = channel -1;
						ex.setChannel(channel);
						System.out.println("���� ä�� : "+ex.getChannel());
						break;
					}else if(num == 3) {
						System.out.println("���� +1");
						volume = volume +1;
						ex.setVolume(volume);
						System.out.println("���� ���� : "+ex.getVolume());
						break;
					}else if(num == 4) {
						System.out.println("���� -1");
						volume = volume -1;
						ex.setVolume(volume);
						System.out.println("���� ���� : "+ex.getVolume());
						break;
					}else {
						ex.powerOff();
						System.exit(0);
					}
				case 2://���� ��
					ex.powerOff();
					System.exit(0);
				}
				
				}
		}
	}

}

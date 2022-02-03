package day11_set_get;

import java.util.Scanner;

public class Quiz03_1AirconditionerMainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz03_1AirconditionerMethod ex = new Quiz03_1AirconditionerMethod();
		
		boolean bool = true;
		int cooling = 0;//냉방
		int heater = 0;//히터
		
		while(bool) {
			System.out.println("1.전원 킴");
			System.out.println("2.전원 끔");
			int choice = input.nextInt();
			while(bool) {
			if(choice == 1) {//전원 킴
				System.out.println("1. 냉방 온도+1");
				System.out.println("2. 냉방 온도-1");
				System.out.println("3. 히터 온도 +1");
				System.out.println("4. 히터 온도 -1");
				System.out.println("5. 종 료");
					int num = input.nextInt();
					switch(num) {
					case 1://냉방 온도 +1
						System.out.println("냉방 온도 +1");
						cooling = cooling +1;
						ex.setCooling(cooling);
						System.out.println("현재 냉방온도 : "+ex.getCooling());
						break;
					case 2://냉방 온도 -1
						System.out.println("냉방 온도 -1");
						cooling = cooling -1;
						ex.setCooling(cooling);
						System.out.println("현재 냉방온도 : "+ex.getCooling());
						break;
					case 3: // 히터온도 +1
						System.out.println("히터 온도 +1");
						heater = heater +1;
						ex.setHeater(heater);
						System.out.println("현재 히터온도 : "+ex.getHeater());
						break;
					case 4: // 히터온도 -1
						System.out.println("히터 온도 -1");
						heater = heater -1;
						ex.setHeater(heater);
						System.out.println("현재 히터온도 : "+ex.getHeater());
						break;
					case 5://종료
						ex.powerOff();
						System.exit(0);
					}
			}else {//전원 끔
				ex.powerOff();
				System.exit(0);
			}
			}
			
		}

		
		
		
	}
}

package day11_set_get;

import java.util.Scanner;

public class Quiz03_1AirconditionerMainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz03_1AirconditionerMethod ex = new Quiz03_1AirconditionerMethod();
		
		boolean bool = true;
		int cooling = 0;//�ù�
		int heater = 0;//����
		
		while(bool) {
			System.out.println("1.���� Ŵ");
			System.out.println("2.���� ��");
			int choice = input.nextInt();
			while(bool) {
			if(choice == 1) {//���� Ŵ
				System.out.println("1. �ù� �µ�+1");
				System.out.println("2. �ù� �µ�-1");
				System.out.println("3. ���� �µ� +1");
				System.out.println("4. ���� �µ� -1");
				System.out.println("5. �� ��");
					int num = input.nextInt();
					switch(num) {
					case 1://�ù� �µ� +1
						System.out.println("�ù� �µ� +1");
						cooling = cooling +1;
						ex.setCooling(cooling);
						System.out.println("���� �ù�µ� : "+ex.getCooling());
						break;
					case 2://�ù� �µ� -1
						System.out.println("�ù� �µ� -1");
						cooling = cooling -1;
						ex.setCooling(cooling);
						System.out.println("���� �ù�µ� : "+ex.getCooling());
						break;
					case 3: // ���Ϳµ� +1
						System.out.println("���� �µ� +1");
						heater = heater +1;
						ex.setHeater(heater);
						System.out.println("���� ���Ϳµ� : "+ex.getHeater());
						break;
					case 4: // ���Ϳµ� -1
						System.out.println("���� �µ� -1");
						heater = heater -1;
						ex.setHeater(heater);
						System.out.println("���� ���Ϳµ� : "+ex.getHeater());
						break;
					case 5://����
						ex.powerOff();
						System.exit(0);
					}
			}else {//���� ��
				ex.powerOff();
				System.exit(0);
			}
			}
			
		}

		
		
		
	}
}

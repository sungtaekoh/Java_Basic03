package day07_Array;
import java.util.ArrayList;
/*
 * ����ó ���� ���α׷� �����
 * (ArrayList 2���� ����Ͽ� ����ÿ�.)
 * �ϳ��� ����Ʈ : �̸� ����
 * �ϳ��� ����Ʈ : ����ó ����
 * 1.����ó ��� :  �̸���, ��ȭ��ȣ (�ߺ� ��� �ȵ�)
 * 2.����ó ���� : ��ϵǾ� ���� ������ ��Ͽ� �����ϴ�
 * 3.����ó ���� : ��Ϥ��� ������ ��Ͽ� �����ϴ�
 * 4.��� ����ó ���� : ��ϵǾ� �ִ� ��� ���� ���
 */
import java.util.Scanner;

public class Quiz03_1 {
	public static void main(String[] args) {//�̹� Ŭ���� ����
		Scanner input = new Scanner(System.in);
		ArrayList telName = new ArrayList();
		ArrayList telNum = new ArrayList();
//		telName ��ȭ��ȣ�� �̸� ������ ��
//		telNum ��ȭ��ȣ�� ��ȣ ������ ��
		int choice = 0;// �޴����� ����
		String name = null;//����ó ���� �̸�
		String name2 = null;//ã�� ����ó 
		int num = 0; //����ó �Է� �޴°�
		int num2 = 0; //����ó ã�°�
		
		while(true) {
		System.out.println("1.����ó ���");
		System.out.println("2.����ó ����");
		System.out.println("3.����ó ����");
		System.out.println("4.��� ����ó ����");
		System.out.println("5.����");
		System.out.println(">>>");
		choice = input.nextInt();
		if(choice == 1) {//1.����ó ���
			System.out.println("�̸� �Է� : ");
			name = input.next();
			telName.add(name);
			System.out.println("����ó �Է� : ");
			num = input.nextInt();
			telNum.add(num);
			System.out.println(telName.get(0));
			System.out.println(telNum.get(0));
			System.out.println("���� �Ϸ�!!");
		}else if(choice == 2) {//2.����ó ����
			System.out.println("ã�� �̸� �Է� : ");
			name2 = input.next();
			if(name2.equals(name)) {
				System.out.println("����ó ã�Ҵ�");
			}else {
				System.out.println(name2+"���� ��Ͽ� �����ϴ�");
			}
			
		}else if(choice == 3) {//3.����ó ����
			System.out.println("3�� ����");
		}else if(choice == 4) {//4.��� ����ó ����
			System.out.println("4�� ����");
		}else if(choice == 5) {//5.����
			System.out.println("5�� ����");
		}
		}
		
	}
}

package day08_Set_Map_String;

public class Ex08_String {
	public static void main(String[] args) {
		String str ="Java is Easy. �׸��� Programming �Ҹ��ϴ�. ";
		System.out.println("�⺻ : "+str);
		String changeStr = new String();
		changeStr = str.toUpperCase(); //���� �빮��
		System.out.println("��ȯ : "+changeStr);
		changeStr = str.toLowerCase(); // ���� �ҹ���
		System.out.println("��ȯ : "+changeStr);
		
	} 
	
}

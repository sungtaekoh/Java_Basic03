package day08_Set_Map_String;

public class Ex09_String {

	public static void main(String[] args) {
		String str = new String("abcdefg");
		System.out.println(str.length());
		
		System.out.println(str.charAt(2));
		//�ش��ϴ� �ε��� ������ �ִ� ���ڸ� ��� �ε����� 0���� ����
		
		str+="�ȳ��ϼ���";//�̷��� ������ ���ؼ� ���°͵� �����ϴ�
		System.out.println(str);
		
		System.out.println(str.charAt(0) == 'a');//���� �� ��, �������� ��
		System.out.println(str.charAt(0) == 'b');//���� �� ��, �������� ��
		
		//�ƽ�Ű �ڵ�� ǥ��
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
	}

}

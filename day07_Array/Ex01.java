package day07_Array;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * �迭
		 * ���� �ڷ������� �������� ������ ����� ����ϴ� ��
		 * �ڷ��� [] ������(�迭��)
		 * �ڷ��� �迭��(������) []
		 * index(÷��) : 0��° ���� ����
		 */
		int[] arr = new int[5];
		for(int i=0;i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		System.out.println("arr 0 : "+arr[0]);
		System.out.println("arr 1 : "+arr[1]);
		System.out.println("arr 2 : "+arr[2]);
		System.out.println("arr 3 : "+arr[3]);
		System.out.println("arr 4 : "+arr[4]);
//		System.out.println("arr 5 : "+arr[5]);//����
	
		System.out.println(arr.length);//������ ǥ��
		
		for(int i=0;i < arr.length; i++) {
			arr[i] = (i+1)*100;
			System.out.println(arr[i]);
		}
		
		int arr01[] = new int[] {10,20,30,40,50};
		for(int i =0; i<arr01.length;i++) {
			System.out.println(arr01[i]);
		}
	}
}

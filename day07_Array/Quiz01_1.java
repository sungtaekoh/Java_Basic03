package day07_Array;
/*
 * int arr[]= new int[]{10,54,13,17,25,30};
 * 
 * �ݺ����� �̿��ؼ� arr�� ����Ǿ��ִ� ¦���� ���� Ȧ���� ���� ���� ��� �Ͻÿ�
 * ¦�� : 10
 * ¦�� : 54
 * Ȧ�� : 13
 * Ȧ�� : 17
 * Ȧ�� : 25
 * ¦�� : 30
 */
public class Quiz01_1 {
 public static void main(String[] args) {
	int arr[] = new int[]{10,54,13,17,25,30};
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println("¦�� : "+arr[i]);
		}else {
			System.out.println("Ȧ�� : "+arr[i]);
		}
	}
}
}

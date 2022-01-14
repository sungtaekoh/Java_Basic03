package day07_Array;
/*
 * int arr[]= new int[]{10,54,13,17,25,30};
 * 
 * 반복문을 이용해서 arr에 저장되어있는 짝수의 값과 홀수의 값을 따로 출력 하시오
 * 짝수 : 10
 * 짝수 : 54
 * 홀수 : 13
 * 홀수 : 17
 * 홀수 : 25
 * 짝수 : 30
 */
public class Quiz01_1 {
 public static void main(String[] args) {
	int arr[] = new int[]{10,54,13,17,25,30};
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println("짝수 : "+arr[i]);
		}else {
			System.out.println("홀수 : "+arr[i]);
		}
	}
}
}

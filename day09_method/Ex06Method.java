package day09_method;

import java.util.Scanner;

public class Ex06Method {//���� Ŭ�����ȿ����� .�� ������� �ʾƵ� �ȴ�
  public void display() {
	  Scanner input = new Scanner(System.in);
	  int n1, n2;
	  System.out.println("�� �� �Է� :");
	  n1 = input.nextInt();
	  n2 = input.nextInt();
	  int sum = test(n1, n2);
	  printSum(n1,n2,sum);
  }
  public int test(int n, int n2) {
	  return n+n2;
  }
  	public void printSum(int n1, int n2, int s) {
  		System.out.println(n1 + "+" + n2 + "=" +s);
  	}
  
}

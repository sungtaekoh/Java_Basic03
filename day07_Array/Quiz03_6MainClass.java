package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03_6MainClass {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	ArrayList phName = new ArrayList();//전화번호 이름
	ArrayList phNum = new ArrayList();//전화번호
	
	boolean bool = true;
	int choice = 0;
	String name = null;
	int num = 0;
	
	while(bool) {
		System.out.println("1.연락처 등록");
		System.out.println("2.연락처 보기");
		System.out.println("3.연락처 삭제");
		System.out.println("4.모든 연락처 보기");
		System.out.println("5.종료");
		System.out.println(">>>");
		choice = input.nextInt();
		if(choice ==1 ) {//연락처 등록
			System.out.println("저장할 이름을 입력해 주세요. :");
			name = input.next();
			if(phName.indexOf(name) == -1) {
				phName.add(name);
				System.out.println("전화번호를 입력해 주세요 :");
				num = input.nextInt();
				phNum.add(num);
				System.out.println("성공적으로 저장되었습니다.");
			}else {
				System.out.println("이미 있는 이름입니다.");
				System.out.println("다시 입력해 주세요. :");
			}
		}else if(choice ==2) {//연락처 보기
			System.out.println("찾을 이름 입력 : ");
			name = input.next();
			if(phName.indexOf(name)!=-1) {
				int n = phName.indexOf(name);
				System.out.print(phName.get(n)+ " : ");
				System.out.println(phNum.get(n));
			}else {
				System.out.println("없는 이름입니다.");
			}
		}else if(choice ==3) {//연락처 삭제
			System.out.println("삭제할 이름 입력 : ");
			name = input.next();
			if(phName.indexOf(name)!=-1) {
				int n = phName.indexOf(name);
				phName.remove(n);
				phNum.remove(n);
				System.out.println("성공적으로 "+name+"님이 삭제 되었습니다.");
			}else {
				System.out.println("없는 이름입니다.");
			}
		}else if(choice ==4) {//모든 연락처 보기
			for(int i =0;i<phName.size();i++) {
				System.out.print(phName.get(i)+":");
				System.out.println(phNum.get(i));
			}
		}else if(choice ==5) {//종료
			System.out.println("종료합니다.");
			return;
		}
	}
}
}

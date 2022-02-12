package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Quiz01_1Metod {
	
}

class Timer{
	public void timerDisplay() {
		//프레임 
				JFrame frame = new JFrame("Sungtaek's Timer");//jframe 만들기
				Container con = frame.getContentPane();//컨테이너 깔기
				frame.setPreferredSize(new Dimension(700, 200));//창크기
				frame.pack(); //크기 변경저장
				
				JLabel lable = new JLabel();//라벨 만들기
				con.add(lable);
				
				frame.setVisible(true);//창 띄움
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창 닫기 할때 콘솔종료
				
				Font font = new Font("Tempus San ITC", Font.ITALIC, 32);
				//(글꼴 , 글자 스타일, 폰트크기)
				
				lable.setFont(font);
				
				//시간기능
				SimpleDateFormat s = 
						new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
				
				String str = null;
				
				for(int i=0; ;i++) {
					try {
						Thread.sleep(100);
						Date d = new Date();
						str = s.format(d);
						lable.setText(str);
//						System.out.println(str);
					}catch (Exception e) {
						// TODO: handle exception
					}
				}
				
				
	}
}

class Win7{
	
	public void win7Display() {
	
		Scanner input = new Scanner(System.in);	
		HashMap map = new HashMap();
		
		int choice2 = 0;
		String s = null; //기능 입력
		
		map.put("메모장", "notepad");
		map.put("계산기", "calc");
		
		while(true) {
			System.out.println(" ===== 환영합니다 =====");
			System.out.println("1.기능");
			System.out.println("2.off");
			System.out.println("입력 : ");
			choice2 = input.nextInt();
			switch(choice2) {
			case 1:
				System.out.println("사용가능 기능");
				System.out.println("메모장, 계산기");
				System.out.println("입력 : ");
				s = input.next();
				if(map.containsKey(s) == true) {
					ProcessBuilder pro = new ProcessBuilder((String)map.get(s));
					try {
						System.out.println(s+"가 실행됩니다");
						pro.start();
					}catch (Exception e) {
						// TODO: handle exception
					}
				}else {
					System.out.println("잘 못된 입력입니다.");
				}
				break;
			case 2:
				System.out.println("Win7을 종료합니다.");
				break;
			}
			
		}
			
		
		
	}
	
	
}



class LoginGame {
	Scanner input = new Scanner(System.in);
	Timer t = new Timer();
	Win7 win7 = new Win7();
	
	ArrayList saveId = new ArrayList();
	ArrayList savePw = new ArrayList();
	
	boolean bool1 = true;
	boolean bool2 = true;
	int choice1 = 0;
	String id = null;
	String pw = null;
	
	
	public void newLog() {
		
		System.out.println("아이디 입력 : ");
		id = input.next();
		if(saveId.indexOf(id) == -1) {
			saveId.add(id);
		System.out.println("비밀번호 입력 : ");
			pw= input.next();
		savePw.add(pw);
		System.out.println("회원가입에 성공하였습니다.");
		}else {
		System.out.println("이미 존재하는 아이디 입니다.");
		}
	}
	
	public void login() {
		System.out.println("아이디 입력 :");
		id = input.next();
		System.out.println("비밀번호 입력 : ");
		pw = input.next();
		if(saveId.indexOf(id) != -1 && savePw.indexOf(pw) != -1) {
			System.out.println("로그인에 성공하셨습니다");
			
			//두개 중 한개읨 메소드만 작동한다.. 왜..??
			win7.win7Display();
			t.timerDisplay();
			
		}else {
			System.out.println("로그인에 실패하셨습니다.");
		}
	}
	
	public void loginDisplay() {

		while(true) {
			System.out.println("1.로그인 2.가입 3.로그아웃");
			System.out.println(">>>");
			choice1 = input.nextInt();
			switch(choice1) {
			case 1://로그인
				login();
				break;
			case 2://가입
				newLog();
				break;
			case 3://로그아웃
				System.out.println("로그인을 종료합니다.");
				System.exit(0);
			}
		}
	}
	
	
}




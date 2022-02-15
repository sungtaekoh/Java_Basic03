package day16_overriding;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 1. 로그인하면 이전과 동일하게 시간이 흘러간다
 2. off를 선택하면 마지막에 사용한 시간을 출력되게 업그레이드 진행
 
 해답지
 */
class TimerQuiz extends Thread{ //다중 상송이 안되서 TimerQuiz에 상속시켰다
	private Date date;
	private SimpleDateFormat simpl;
	public void setDate() {
		date = new Date();
		simpl = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
	}
	public String getDate() {return simpl.format(date);}
	public void time() {
		for(int i=0;i<10;i++) {
			setDate();
			String s = getDate();
			System.out.println(s);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {//이게 뭘까?
			}
		}
	}
}

class Win7Quiz extends TimerQuiz{
	private String[] name;
	private String[] info;
	public Win7Quiz(String c, String m, String cPath, String mPath) {
		name = new String[2];
		name[0] = c;
		name[1] =m;
		info = new String[2];
		info[0] = cPath;
		info[1] = mPath;
	}
	public void function(String funcName) {
		String[] name = getName1();
		String[] info = getInfo();
		HashMap map = new HashMap();
		for(int i=0;i<name.length;i++) {
			map.put(name[i], info[i]);
		}
		if(map.containsKey(funcName)) {
			System.out.println(map.get(funcName)+"사용 합니다");
		}else {
			System.out.println("없는 기능입니다");
		}
	}
	public void funcPrint() {
		System.out.println("[사용 가능] : "  );
		String[] name = getName1();
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+" ");
		}
		System.out.println();
	}
	public String[] getName1() {return name;}
	public String[] getInfo() {return info;}
	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("===== 환영합니다 ======");
		int sel =0;
		String funcName=null;
		while(true) {
			System.out.println("1.기능");
			System.out.println("2.off");
			System.out.println("입력 >>>");
			sel = input.nextInt();
			switch(sel) {
			case 1 :
				funcPrint();
				System.out.println("사용할 기능 입력 : ");
				funcName = input.next();
				function(funcName);
				break;
			case 2:
				return;
			}
		}
	}
}
/*
 셋터 겟터가 스레드를 상속받으니 메소드의 이름이 중복되는 것들이 있어 에러가 발생한다
 오버라이딩이 되는데 리턴 타입이 다르다고 해서 에러 발생
 그래서 이름을 getId1 뒤에 숫자 1을 붙여서 변경했다
 */

class Login extends Win7Quiz{
	private String userId = null, userPw=null;
	public Login(String c, String m, String cPath, String mPath) {
		super(c, m, cPath, mPath);
	}
	public int compare(String id, String pw) {
		if(getUserId() != null && getUserPw() != null)
			if(getUserId().equals(id) && getUserPw().equals(pw))
				return 0;
			else return 1;
		return 1;
	}
	public void saveId_Pw(String id, String pw) {
		setUserId(id); setUserPw(pw);}
	public boolean out() {return false;}
	public String getUserId() {return userId;}
	public void setUserId(String id) { this.userId = id; }
	public String getUserPw() { return userPw; }
	public void setUserPw(String pw) { this.userPw = pw;}
	}

class MyJframe extends TimerQuiz{
	JFrame frame;
	Container c;
	JLabel label;
	Font font;
	public MyJframe() {
		frame = new JFrame("Time");
		c = frame.getContentPane();
		label = new JLabel();
		font = new Font(null, 0, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		c.add(label);
		frame.setLocation(1000, 200);//화면 위치
		frame.setPreferredSize(new Dimension(500, 200 ));//프레임 크기
		frame.pack(); //프레임 변경 적용하기
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void run() {
		for(int i=0; ;i++) {
			try {
				Thread.sleep(1000);
				super.setDate();
				label.setText(super.getDate());
			}catch (InterruptedException e) {
			}
			
		}
	}
}
// 오버 라이딩 코드
class NewMyJframe extends MyJframe{
	private int second;
	public static boolean FLAG = true;
	public NewMyJframe() {second=0;}
	public void run() {
		while(FLAG) {
			second++;
			try {
				Thread.sleep(1000);
				super.setDate();
				label.setText(super.getDate());
			}catch (InterruptedException e) {}
		}
		int reHour = second/ (60*60);
		int reSecond = second % (60*60);
		int reMinute = reSecond / 60;
		reSecond = reSecond % 60;
		label.setText(reHour+"시"+reMinute+"분"+reSecond+"초 사용");
		System.out.println("총 시간 : "+second);
	}
}
//=============================
public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NewMyJframe mf = null; //수정코드
		int num =0, result=0;
		String inputId = null, inputPw = null;
		Login lo = new Login("계산기","메모장","calc.exe","notpad.exe");
		boolean flag =true;
		lo.time();
		
		while(flag) {
			System.out.println("1.로그인 2.가입 3.로그아웃 \n>>>");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("아이디 입력 : ");
				inputId = input.next();
				System.out.println("비밀번호 입력 : ");
				inputPw = input.next();
				result = lo.compare(inputId, inputPw);
				if(result == 0 ) {
					System.out.println("인증 통과");
					mf = new NewMyJframe(); // 수정코드
					mf.setDaemon(true);
					mf.start();
					lo.display();
					NewMyJframe.FLAG = false; //수정코드
					System.out.println("프로그램 종료");
					return;
				}else 
					System.out.println("인증 실패");
					case 2:
						System.out.println("가입 id : ");
						inputId = input.next();
						System.out.println("가입 pw : ");
						inputPw = input.next();
						lo.saveId_Pw(inputId, inputPw);
						System.out.println("저장 완료");
						break;
					case 3:
						flag = lo.out();
						System.out.println("종료 합니다");
			}
		}
	}
}

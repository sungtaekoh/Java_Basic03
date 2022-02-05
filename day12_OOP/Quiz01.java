package day12_OOP;
import java.util.*;
import java.text.*;
class Win7Quiz{ //선생님 답안지 근데 작동도 안되고 잘 모르겠다
	private HashMap map;
	private ArrayList funcList;
	public void function(String funcName){
		if(map.containsKey(funcName)){
			System.out.println(map.get(funcName)+"동작 합니다");
		}else{System.out.println("없는 기능 입니다");}
	}
	public ArrayList getFuncList(){
		funcList = new ArrayList();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			funcList.add(it.next());
		}
		return funcList;
	}
	public void setMap() {
		map = new HashMap();
		map.put("계산기", "calc.exe");
		map.put("메모장", "notepad.exe");
	}

	public void display(){ 
		ArrayList list = null;
		setMap();
		Scanner input = new Scanner(System.in);
		System.out.println("===== 환 영 합 니 다 =====");
		int sel=0;
		String funcName=null;
		while(true){
			System.out.println("1.기 능");
			System.out.println("2.off");
			System.out.print("입력 >>>> ");
			sel = input.nextInt();
			switch(sel){
				case 1:
					list=getFuncList();
					System.out.println("사용 가능 기능");
					for(int i=0;i<list.size();i++)
						System.out.println(i+1+" : "+list.get(i));
					System.out.print("사용할 기능 입력 : ");
					funcName=input.next();
					function(funcName);
					break;
				case 2:
					System.out.println("프로그램 종료 합니다!!!");
					return;
			}
		}
	}
}
public class Quiz01 {
	public static void main(String[] args){
		Win7Quiz win7 = new Win7Quiz();
		win7.display();
	}
}


package day12_OOP;
import java.util.*;
import java.text.*;
class Win7Quiz{ //������ ����� �ٵ� �۵��� �ȵǰ� �� �𸣰ڴ�
	private HashMap map;
	private ArrayList funcList;
	public void function(String funcName){
		if(map.containsKey(funcName)){
			System.out.println(map.get(funcName)+"���� �մϴ�");
		}else{System.out.println("���� ��� �Դϴ�");}
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
		map.put("����", "calc.exe");
		map.put("�޸���", "notepad.exe");
	}

	public void display(){ 
		ArrayList list = null;
		setMap();
		Scanner input = new Scanner(System.in);
		System.out.println("===== ȯ �� �� �� �� =====");
		int sel=0;
		String funcName=null;
		while(true){
			System.out.println("1.�� ��");
			System.out.println("2.off");
			System.out.print("�Է� >>>> ");
			sel = input.nextInt();
			switch(sel){
				case 1:
					list=getFuncList();
					System.out.println("��� ���� ���");
					for(int i=0;i<list.size();i++)
						System.out.println(i+1+" : "+list.get(i));
					System.out.print("����� ��� �Է� : ");
					funcName=input.next();
					function(funcName);
					break;
				case 2:
					System.out.println("���α׷� ���� �մϴ�!!!");
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


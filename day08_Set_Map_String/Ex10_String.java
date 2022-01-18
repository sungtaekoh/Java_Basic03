package day08_Set_Map_String;

public class Ex10_String {
	public static void main(String[] args) {
		String str = " Have a nice day        ";
		String result = str.trim();//공백을 없애준다
		System.out.println("1. "+str);
		System.out.println("2. "+result);
		
		String inputId = "abcd   ";
		String saveId = "abcd";
		System.out.println(inputId);
		System.out.println(inputId.equals("abcd"));
		//공백이 있을경우 거짓으로 출력된다
		//이러할 경우 trim으로 공백을 없앤다
		
		System.out.println(inputId.length());//공백여부 확인
		System.out.println(saveId.length());
		inputId = inputId.trim();
		System.out.println(inputId.equals(saveId));
		
		System.out.println("-------------------------");
		String[] split = result.split(" ");
		//스플릿 : 공백을 기준으로 잘라라
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		
		String addr = "101 서울시 종로구 종로3가 100번지 4층";
		String[] ad = addr.split("/");
		for(int i =0;i<ad.length;i++) {
			System.out.println(ad[i]);
		}
		
		String replace = result.replace(" ", "+++");
		//" "를 "+++"로 변경하겠다
		System.out.println(replace);
	}
}

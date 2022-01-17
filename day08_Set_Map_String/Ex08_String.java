package day08_Set_Map_String;

public class Ex08_String {
	public static void main(String[] args) {
		String str ="Java is Easy. 그리고 Programming 할만하다. ";
		System.out.println("기본 : "+str);
		String changeStr = new String();
		changeStr = str.toUpperCase(); //전부 대문자
		System.out.println("변환 : "+changeStr);
		changeStr = str.toLowerCase(); // 전부 소문자
		System.out.println("변환 : "+changeStr);
		
	} 
	
}

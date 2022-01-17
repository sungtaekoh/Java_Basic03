package day08_Set_Map_String;

public class Ex09_String {

	public static void main(String[] args) {
		String str = new String("abcdefg");
		System.out.println(str.length());
		
		System.out.println(str.charAt(2));
		//해당하는 인덱스 순번에 있는 글자를 출력 인덱스는 0부터 센다
		
		str+="안녕하세요";//이러한 식으로 더해서 쓰는것도 가능하다
		System.out.println(str);
		
		System.out.println(str.charAt(0) == 'a');//문자 비교 참, 거짓으로 비교
		System.out.println(str.charAt(0) == 'b');//문자 비교 참, 거짓으로 비교
		
		//아스키 코드로 표기
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
	}

}

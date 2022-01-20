package day08_Set_Map_String;

public class Quiz03_1 {
	public static void main(String[] args) {
		String str02 = new String("tESt sTring change first");
		String changeStr = new String();
		int k =0;
		//test string change first
		str02 = str02.toLowerCase();
		if(str02.charAt(0) >= 'a' && str02.charAt(0) <='z') {
			changeStr+=(char)(str02.charAt(k)-32);
				k++;
			}
		while(k<str02.length()) {
			if(str02.charAt(k)!=' ') {
				changeStr+=str02.charAt(k);
				k++;
				continue;
			}
			while(str02.charAt(k)==' ') {
				changeStr+=str02.charAt(k);
				k++;
			}if(str02.charAt(k) >= 'a' && str02.charAt(k)<='z')
				changeStr+=(char)(str02.charAt(k)-32);
			k++;
		}
		System.out.println(str02);
		System.out.println(changeStr);
		System.out.println("Á¾·á");
		}
	}


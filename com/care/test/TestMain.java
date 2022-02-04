package com.care.test;

import java.util.Date;

import com.care.zzz.*;
// * :모든걸 가져다 쓰겠다. import가 너무 많을경우 생략하기 위한 코드

public class TestMain {

	public static void main(String[] args) {
//		Scanner
//		arrayList
//		HashSet<E>
//		HashMap
		
		a.a.a.TestClass tc2 = new a.a.a.TestClass();
		//같은 이름의 클래스가 있을경우네는 앞에 패키지명이 따라나온다.
		tc2.testClass();
		
		TestClass tc = new TestClass();
		//다른 패키지의 클래스를 가져와서 쓸땐 임폴트import가 추가된다.
		//다른 패키지의 클래스는 디폴트의 경우 가져올 수 없다
		tc.testClass();
		
		Test t = new Test();
		t.test();
		
		TestClass02 tc02 = new TestClass02();
		tc02.testClass02();
		
		
		java.sql.Date ddd = new java.sql.Date(0);
		Date dd = new Date();
//		같은 이름이더라도 다른 기능이기때문에 잘 알아보고 사용하도록 하자.
	}

}

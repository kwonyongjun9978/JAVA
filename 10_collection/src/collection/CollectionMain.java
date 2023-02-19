package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	@SuppressWarnings("all") //all : 모든 경고를 억제
	public static void main(String[] args) {
		/*
		Collection 인터페이스를 사용하려면?
		1. implements
		 -모든 추상메소드를 오버라이드 해줘야 한다, but collection인터페이스에는 추상메소드가 많다..
		2.대신 override 해주는 클래스 (우체국 택배 역할)-interface를 대신 가져옴
		 -Collection coll = new ArrayList();
		3.메소드 이용
		 -Iterator it = coll.iterator();
		*/
		Collection coll = new ArrayList(); //2번 방법 사용
		coll.add("호랑이"); //add() : 원소를 추가
		coll.add("사자");
		coll.add("호랑이"); //중복 허용
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		Iterator it = coll.iterator(); 
		while(it.hasNext()) { 
			System.out.println(it.next()); 
		}
	}

}

package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		/*
		인터페이스 Collection 사용하려면?
		1. implements
		 -모든 추상메소드를 오버라이드 해줘야 한다, but collection인터페이스에는 추상메소드가 많다..
		2.대신 Override해주는 클래스
		 -Collection coll = new ArrayList();
		3.메소드
		 -Iterator it = coll.iterator();
		*/
		
		Collection coll = new ArrayList();
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이"); //중복 허용
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		Iterator it = coll.iterator(); //하나의 지시자
		while(it.hasNext()) { //항목이 있냐? (true), 없으면 (false)
			System.out.println(it.next());  //항목을 꺼내고 다음 항목으로 이동
		}
	}

}

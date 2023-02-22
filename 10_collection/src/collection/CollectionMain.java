package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	@SuppressWarnings("all") //all : 모든 경고를 억제
	public static void main(String[] args) {
		/*
		Collection : 데이터를 저장하는 자료구조
		Collection 인터페이스를 사용하려면?
		1. implements
		 -인터페이스를 구현한 클래스에서 인터페이스의 모든 추상메소드를 오버라이드 해줘야 한다, but collection인터페이스에는 추상메소드가 많다..
		2.대신 override해주는 클래스(우체국 택배 역할)(오버라이드된 메소드들이 내장되어있음)-interface를 대신 가져옴
		 -Collection coll = new ArrayList();
		3.메소드 이용
		 -Iterator it = coll.iterator();
		*/
		
		Collection coll = new ArrayList(); //2번 방법 사용(Collection - interface, ArrayList - class)
		//ArrayList 클래스에서 Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess 인터페이스들을 구현 하고있다 
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

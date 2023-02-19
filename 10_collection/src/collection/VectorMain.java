package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("백터 크기 = "+v.size()); //0
		System.out.println("백터 용량 = "+v.capacity()); //기본용량 10, 10개씩 증가
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i=0; i<10; i++) {
			v.add(i+1+""); //add() : 벡터에 요소를 추가
			System.out.print(v.get(i)+" "); //get() : 백터에서 값을 추출
		}//for
		System.out.println();
		System.out.println("백터 크기 = "+v.size()); //10
		System.out.println("백터 용량 = "+v.capacity()); //10
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.addElement(5+"");//중복 허용
		System.out.println("백터 크기 = "+v.size()); //11
		System.out.println("백터 용량 = "+v.capacity()); //20
		System.out.println();
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("마지막 항목 삭제");
		//v.remove(5+""); //앞 부분의 "5" 항목이 삭제
		v.remove(10); //10번 위치의 항목을 삭제
		
		//iterator : '반복자', 배열과 같은 여러 개의 데이터의 집합으로 이루어진 자료구조를 순회하는 객체, Iterator 인터페이스는 컬렉션 프레임워크에 저장된 요소들을 순회하여 읽어오는데 사용
		Iterator<String> it = v.iterator(); //Iterator는 interface라서 new로 생성 X, 메소드로 interface 생성
		while(it.hasNext()) { //hasNext() : 다음 요소가 존재하는지 혹은 그렇지 않은지 true/false로 리턴한다. true 이면 다음 요소다 있다는 것이고, false 이면 현재 요소가 마지막이라는 뜻이다.
			System.out.print(it.next()+" "); //next() : 다음 요소를 가져온다.
		}
		System.out.println();
	}
	

}

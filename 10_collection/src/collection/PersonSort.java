package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		Arrays.sort(ar); //Arrays 클래스의 sort 메소드 호출 : 오름차순으로 정렬
		
		System.out.print("정렬 후 = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		//---------------------------------------------------------------
		//객체 sort
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("프로도",40);
		PersonDTO cc = new PersonDTO("라이언",35);
		
		ArrayList<PersonDTO> arrayList = new ArrayList<PersonDTO>();
		arrayList.add(aa); 
		arrayList.add(bb);
		arrayList.add(cc);
		
		System.out.print("정렬 전 = ");
		for(PersonDTO personDTO : arrayList) {
			System.out.print(personDTO+" ");
		}
		System.out.println();
		
		Collections.sort(arrayList); //Collections 클래스의 sort 메소드 호출
		
		System.out.print("정렬 후 = ");
		for(PersonDTO personDTO : arrayList) {
			System.out.print(personDTO+" ");
		}
		System.out.println();
		
		System.out.println("이름으로 내림차순");
		//Comparator 인터페이스의 compare 메소드 오버라이드
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() { //익명 내부 클래스로 객체 생성

			@Override
			public int compare(PersonDTO dto1, PersonDTO dto2) { //객체 비교(두 매개변수 객체를 비교)
				//return dto1.getName().compareTo(dto2.getName()); //오름차순
				
				//return dto2.getName().compareTo(dto1.getName()); //내림차순
				return dto1.getName().compareTo(dto2.getName())*-1;
				/*
				 첫 번째 개체가 두 번째 개체보다 작은 것으로 간주되면 음의 정수가 반환됩니다. 
				 첫 번째 개체가 두 번째 개체보다 큰 것으로 간주되면 양의 정수가 반환됩니다. 
				 개체가 동일한 것으로 간주되면 메서드는 0을 반환합니다.
				 */
			}
		};
		
		Collections.sort(arrayList, com);
		
		System.out.println("정렬 후");
		for(PersonDTO personDTO : arrayList) {
			System.out.println(personDTO+" ");
		}
		System.out.println();
	}

}

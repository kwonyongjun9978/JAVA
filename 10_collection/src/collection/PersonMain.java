package collection;

import java.util.ArrayList;

public class PersonMain {
	
	//PersonDTO 타입의 ArrayList를 반환하는 init 메서드를 선언
	public ArrayList<PersonDTO> init() { //구현
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("프로도",30);
		PersonDTO cc = new PersonDTO("라이언",40);
		
		//return은 1개만 가능, 그러므로 ArrayList 이용
		ArrayList<PersonDTO> arrayList = new ArrayList<PersonDTO>();
		arrayList.add(aa); //aa객체의 주소를 넣는다.
		arrayList.add(bb);
		arrayList.add(cc);
		
		return arrayList;
	}

	public static void main(String[] args) {
		
		PersonMain personMain = new PersonMain();
		
		ArrayList<PersonDTO> arrayList = personMain.init();
		
		for(PersonDTO personDTO : arrayList) {
			System.out.println(personDTO.getName()+"\t"+personDTO.getAge());
		}
		
		for(PersonDTO personDTO : arrayList) {
			System.out.println(personDTO);
		}

	}

}

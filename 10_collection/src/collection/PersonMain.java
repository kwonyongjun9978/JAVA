package collection;

import java.util.ArrayList;

public class PersonMain {
	
	//PersonDTO Ÿ���� ArrayList�� ��ȯ�ϴ� init �޼��带 ����
	public ArrayList<PersonDTO> init() { //����
		PersonDTO aa = new PersonDTO("ȫ�浿",25);
		PersonDTO bb = new PersonDTO("���ε�",30);
		PersonDTO cc = new PersonDTO("���̾�",40);
		
		//return�� 1���� ����, �׷��Ƿ� ArrayList �̿�
		ArrayList<PersonDTO> arrayList = new ArrayList<PersonDTO>();
		arrayList.add(aa); //aa��ü�� �ּҸ� �ִ´�.
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

package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("���� �� = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		Arrays.sort(ar); //Arrays Ŭ������ sort �޼ҵ� ȣ�� : ������������ ����
		
		System.out.print("���� �� = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		//---------------------------------------------------------------
		//��ü sort
		PersonDTO aa = new PersonDTO("ȫ�浿",25);
		PersonDTO bb = new PersonDTO("���ε�",40);
		PersonDTO cc = new PersonDTO("���̾�",35);
		
		ArrayList<PersonDTO> arrayList = new ArrayList<PersonDTO>();
		arrayList.add(aa); 
		arrayList.add(bb);
		arrayList.add(cc);
		
		System.out.print("���� �� = ");
		for(PersonDTO personDTO : arrayList) {
			System.out.print(personDTO+" ");
		}
		System.out.println();
		
		Collections.sort(arrayList); //Collections Ŭ������ sort �޼ҵ� ȣ��
		
		System.out.print("���� �� = ");
		for(PersonDTO personDTO : arrayList) {
			System.out.print(personDTO+" ");
		}
		System.out.println();
		
		System.out.println("�̸����� ��������");
		//Comparator �������̽��� compare �޼ҵ� �������̵�
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() { //�͸� ���� Ŭ������ ��ü ����

			@Override
			public int compare(PersonDTO dto1, PersonDTO dto2) { //��ü ��(�� �Ű����� ��ü�� ��)
				//return dto1.getName().compareTo(dto2.getName()); //��������
				
				//return dto2.getName().compareTo(dto1.getName()); //��������
				return dto1.getName().compareTo(dto2.getName())*-1;
				/*
				 ù ��° ��ü�� �� ��° ��ü���� ���� ������ ���ֵǸ� ���� ������ ��ȯ�˴ϴ�. 
				 ù ��° ��ü�� �� ��° ��ü���� ū ������ ���ֵǸ� ���� ������ ��ȯ�˴ϴ�. 
				 ��ü�� ������ ������ ���ֵǸ� �޼���� 0�� ��ȯ�մϴ�.
				 */
			}
		};
		
		Collections.sort(arrayList, com);
		
		System.out.println("���� ��");
		for(PersonDTO personDTO : arrayList) {
			System.out.println(personDTO+" ");
		}
		System.out.println();
	}

}

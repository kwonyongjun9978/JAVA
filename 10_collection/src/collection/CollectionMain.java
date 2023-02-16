package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		/*
		�������̽� Collection ����Ϸ���?
		1. implements
		 -��� �߻�޼ҵ带 �������̵� ����� �Ѵ�, but collection�������̽����� �߻�޼ҵ尡 ����..
		2.��� Override���ִ� Ŭ����
		 -Collection coll = new ArrayList();
		3.�޼ҵ�
		 -Iterator it = coll.iterator();
		*/
		
		Collection coll = new ArrayList();
		coll.add("ȣ����");
		coll.add("����");
		coll.add("ȣ����"); //�ߺ� ���
		coll.add(25);
		coll.add(43.8);
		coll.add("�⸰");
		coll.add("�ڳ���");
		
		Iterator it = coll.iterator(); //�ϳ��� ������
		while(it.hasNext()) { //�׸��� �ֳ�? (true), ������ (false)
			System.out.println(it.next());  //�׸��� ������ ���� �׸����� �̵�
		}
	}

}

package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	@SuppressWarnings("all") //all : ��� ��� ����
	public static void main(String[] args) {
		/*
		Collection �������̽��� ����Ϸ���?
		1. implements
		 -��� �߻�޼ҵ带 �������̵� ����� �Ѵ�, but collection�������̽����� �߻�޼ҵ尡 ����..
		2.��� override ���ִ� Ŭ���� (��ü�� �ù� ����)-interface�� ��� ������
		 -Collection coll = new ArrayList();
		3.�޼ҵ� �̿�
		 -Iterator it = coll.iterator();
		*/
		Collection coll = new ArrayList(); //2�� ��� ���
		coll.add("ȣ����"); //add() : ���Ҹ� �߰�
		coll.add("����");
		coll.add("ȣ����"); //�ߺ� ���
		coll.add(25);
		coll.add(43.8);
		coll.add("�⸰");
		coll.add("�ڳ���");
		
		Iterator it = coll.iterator(); 
		while(it.hasNext()) { 
			System.out.println(it.next()); 
		}
	}

}

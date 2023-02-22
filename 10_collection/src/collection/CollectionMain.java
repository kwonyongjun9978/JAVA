package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	@SuppressWarnings("all") //all : ��� ��� ����
	public static void main(String[] args) {
		/*
		Collection : �����͸� �����ϴ� �ڷᱸ��
		Collection �������̽��� ����Ϸ���?
		1. implements
		 -�������̽��� ������ Ŭ�������� �������̽��� ��� �߻�޼ҵ带 �������̵� ����� �Ѵ�, but collection�������̽����� �߻�޼ҵ尡 ����..
		2.��� override���ִ� Ŭ����(��ü�� �ù� ����)(�������̵�� �޼ҵ���� ����Ǿ�����)-interface�� ��� ������
		 -Collection coll = new ArrayList();
		3.�޼ҵ� �̿�
		 -Iterator it = coll.iterator();
		*/
		
		Collection coll = new ArrayList(); //2�� ��� ���(Collection - interface, ArrayList - class)
		//ArrayList Ŭ�������� Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess �������̽����� ���� �ϰ��ִ� 
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

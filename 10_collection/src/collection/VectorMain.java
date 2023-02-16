package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("���� ũ�� = "+v.size()); //0
		System.out.println("���� �뷮 = "+v.capacity()); //�⺻�뷮 10, 10���� ����
		System.out.println();
		
		System.out.println("�׸� �߰�");
		for(int i=0; i<10; i++) {
			v.add(i+1+"");
			System.out.print(v.get(i)+" ");
		}//for
		System.out.println();
		System.out.println("���� ũ�� = "+v.size()); //10
		System.out.println("���� �뷮 = "+v.capacity()); //10
		System.out.println();
		
		System.out.println("�׸� 1�� �߰�");
		v.addElement(5+"");//�ߺ� ���
		System.out.println("���� ũ�� = "+v.size()); //11
		System.out.println("���� �뷮 = "+v.capacity()); //20
		System.out.println();
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("������ �׸� ����");
		//v.remove(5+""); //�� �κ��� "5" �׸��� ����
		v.remove(10); //10�� ��ġ�� �׸��� ����
		
		Iterator<String> it = v.iterator(); //Iterator�� interface�� new�� ���� X, �޼ҵ�� interface ����
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
	

}

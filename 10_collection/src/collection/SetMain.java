package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		//Collection �������̽� Set
		Set<String> set = new HashSet<String>(); 
		
		set.add("ȣ����");
		set.add("����");
		set.add("ȣ����"); //�ߺ� ��� x, ���� x
		set.add("�⸰");
		set.add("�ڳ���");
		
		Iterator it = set.iterator(); 
		while(it.hasNext()) { 
			System.out.println(it.next());  
		}//while
		

	}

}

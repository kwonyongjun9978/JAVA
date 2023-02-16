package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �� �̸� �Է� : ");
		String name= scan.next();
		
		int count = 0;
		Iterator<SungJukDTO> it = arrayList.iterator();
		while(it.hasNext()) {
			SungJukDTO sungJukDTO = it.next(); //�����͸� ������ buffer�ȿ� ����
			
			if(sungJukDTO.getName().equals(name)) {
				it.remove(); //it.next()�� ��ȯ�ϴ� �׸��� �����
				count++;
			}
		}//while
		
		if(count == 0) {
			System.out.println("ȸ���� ������ �����ϴ�");
		}
			else {
				System.out.println(count+"���� �����Ͽ����ϴ�");
			}
	}
		
}



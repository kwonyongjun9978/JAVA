package interface_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �̸� �Է� : ");
		String name = sc.next();
		
		int count = 0;
		Iterator<SungJukDTO> it = arrayList.iterator();
		while(it.hasNext()) {
			SungJukDTO sungJukDTO = it.next();
			
			if(sungJukDTO.getName().equals(name)) {
				it.remove();
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("ȸ���� ������ �����ϴ�");
		}else {
			System.out.println(count+"���� �����Ͽ����ϴ�");
		}

	}

}

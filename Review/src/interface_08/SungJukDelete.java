package interface_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제 할 이름 입력 : ");
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
			System.out.println("회원의 정보가 없습니다");
		}else {
			System.out.println(count+"건을 삭제하였습니다");
		}

	}

}

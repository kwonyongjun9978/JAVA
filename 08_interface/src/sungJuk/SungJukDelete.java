package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제 할 이름 입력 : ");
		String name= scan.next();
		
		int count = 0;
		Iterator<SungJukDTO> it = arrayList.iterator();
		while(it.hasNext()) {
			SungJukDTO sungJukDTO = it.next(); //데이터를 꺼내서 buffer안에 보관
			
			if(sungJukDTO.getName().equals(name)) {
				it.remove(); //it.next()가 반환하는 항목을 지운다
				count++;
			}
		}//while
		
		if(count == 0) {
			System.out.println("회원의 정보가 없습니다");
		}
			else {
				System.out.println(count+"건을 삭제하였습니다");
			}
	}
		
}



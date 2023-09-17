package interface_08;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.print("번호 입력 : ");
		int no = sc.nextInt();
		
		int sw = 0;
		for(SungJukDTO sungJukDTO : arrayList) {
			if(sungJukDTO.getNo() == no) {
				sw = 1;
				
				System.out.println(sungJukDTO);
				
				System.out.print("수정 할 이름 입력 : ");
				String name = sc.next();
				System.out.print("수정 할 국어 입력 : ");
				int kor = sc.nextInt();
				System.out.print("수정 할 영어 입력 : ");
				int eng = sc.nextInt();;
				System.out.print("수정 할 수학 입력 : ");
				int math = sc.nextInt();
				
				sungJukDTO.setName(name);
				sungJukDTO.setKor(kor);
				sungJukDTO.setEng(eng);
				sungJukDTO.setMath(math);
				
				sungJukDTO.calc();
				
				System.out.println("수정하였습니다.");
			}
		}
		if(sw == 0)System.out.println("없는 번호 입니다.");
	}

}

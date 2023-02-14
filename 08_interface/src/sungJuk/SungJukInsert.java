package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.err.print("번호 입력 : ");
		int no = scan.nextInt();
		System.err.print("이름 입력 : ");
		String name = scan.next();
		System.err.print("국어 입력 : ");
		int kor = scan.nextInt();
		System.err.print("영어 입력 : ");
		int eng = scan.nextInt();
		System.err.print("수학 입력 : ");
		int math = scan.nextInt();
		
		SungJukDTO sungJukDTO = new SungJukDTO(no,name,kor,eng,math);
		sungJukDTO.calc();
		
		arrayList.add(sungJukDTO);
		
		System.out.println("입력하였습니다.");
	}

}

package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.err.print("��ȣ �Է� : ");
		int no = scan.nextInt();
		System.err.print("�̸� �Է� : ");
		String name = scan.next();
		System.err.print("���� �Է� : ");
		int kor = scan.nextInt();
		System.err.print("���� �Է� : ");
		int eng = scan.nextInt();
		System.err.print("���� �Է� : ");
		int math = scan.nextInt();
		
		SungJukDTO sungJukDTO = new SungJukDTO(no,name,kor,eng,math);
		sungJukDTO.calc();
		
		arrayList.add(sungJukDTO);
		
		System.out.println("�Է��Ͽ����ϴ�.");
	}

}

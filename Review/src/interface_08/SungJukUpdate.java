package interface_08;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.print("��ȣ �Է� : ");
		int no = sc.nextInt();
		
		int sw = 0;
		for(SungJukDTO sungJukDTO : arrayList) {
			if(sungJukDTO.getNo() == no) {
				sw = 1;
				
				System.out.println(sungJukDTO);
				
				System.out.print("���� �� �̸� �Է� : ");
				String name = sc.next();
				System.out.print("���� �� ���� �Է� : ");
				int kor = sc.nextInt();
				System.out.print("���� �� ���� �Է� : ");
				int eng = sc.nextInt();;
				System.out.print("���� �� ���� �Է� : ");
				int math = sc.nextInt();
				
				sungJukDTO.setName(name);
				sungJukDTO.setKor(kor);
				sungJukDTO.setEng(eng);
				sungJukDTO.setMath(math);
				
				sungJukDTO.calc();
				
				System.out.println("�����Ͽ����ϴ�.");
			}
		}
		if(sw == 0)System.out.println("���� ��ȣ �Դϴ�.");
	}

}

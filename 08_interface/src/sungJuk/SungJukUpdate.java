package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		System.out.println();

		System.out.print("��ȣ �Է� : ");
		int no = scan.nextInt();
		
//		for(int i=0 ; i<arrayList.size();i++) {
//			if(no == arrayList.get(i).getNo()) {
//			System.err.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
//			
//			System.out.println(arrayList.get(i).getNo()+ "\t"+
//								   arrayList.get(i).getName()+"\t"+
//								   arrayList.get(i).getKor()+"\t"+
//								   arrayList.get(i).getEng()+"\t"+
//								   arrayList.get(i).getMath()+"\t"+
//								   arrayList.get(i).getTot()+"\t"+
//								   arrayList.get(i).getAvg());
		int sw=0;
		for(SungJukDTO sungJukDTO : arrayList) {
			if(sungJukDTO.getNo() == no)
			{
				sw=1;
				
				System.out.println(sungJukDTO);
				
			System.out.print("���� �� �̸� �Է� : ");
			String name = scan.next();
			System.out.print("���� �� ���� �Է� : ");
			int kor = scan.nextInt();
			System.out.print("���� �� ���� �Է� : ");
			int eng = scan.nextInt();;
			System.out.print("���� �� ���� �Է� : ");
			int math = scan.nextInt();
			
			sungJukDTO.setName(name);
			sungJukDTO.setKor(kor);
			sungJukDTO.setEng(eng);
			sungJukDTO.setMath(math);
			
			sungJukDTO.calc();
			
			System.out.println("�����Ͽ����ϴ�.");
			}
		}
		if(sw == 0) System.out.println("���� ��ȣ �Դϴ�.");		
		
	}
}

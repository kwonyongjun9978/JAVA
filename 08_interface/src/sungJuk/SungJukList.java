package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		System.err.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		
		/*
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getNo()+"\t"+
							   arrayList.get(i).getName()+"\t"+
							   arrayList.get(i).getKor()+"\t"+
							   arrayList.get(i).getEng()+"\t"+
							   arrayList.get(i).getMath()+"\t"+
							   arrayList.get(i).getTot()+"\t"+
							   arrayList.get(i).getAvg());
		}
		*/
		
		/*
		for (SungJukDTO sungJukDTO : arrayList) {
			System.out.println(sungJukDTO.getNo()+"\t"+
							   sungJukDTO.getName()+"\t"+
							   sungJukDTO.getKor()+"\t"+
							   sungJukDTO.getEng()+"\t"+
							   sungJukDTO.getMath()+"\t"+
							   sungJukDTO.getTot()+"\t"+
							   sungJukDTO.getAvg());
			
		}
		*/
		
		for (SungJukDTO sungJukDTO : arrayList) {
			System.out.println(sungJukDTO); //SungJukDTO���� toString�� �������̵��ؼ� return�� ����
		}
		
	}

}

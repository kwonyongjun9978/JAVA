package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		System.out.println();

		System.out.print("번호 입력 : ");
		int no = scan.nextInt();
		
//		for(int i=0 ; i<arrayList.size();i++) {
//			if(no == arrayList.get(i).getNo()) {
//			System.err.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
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
				
			System.out.print("수정 할 이름 입력 : ");
			String name = scan.next();
			System.out.print("수정 할 국어 입력 : ");
			int kor = scan.nextInt();
			System.out.print("수정 할 영어 입력 : ");
			int eng = scan.nextInt();;
			System.out.print("수정 할 수학 입력 : ");
			int math = scan.nextInt();
			
			sungJukDTO.setName(name);
			sungJukDTO.setKor(kor);
			sungJukDTO.setEng(eng);
			sungJukDTO.setMath(math);
			
			sungJukDTO.calc();
			
			System.out.println("수정하였습니다.");
			}
		}
		if(sw == 0) System.out.println("없는 번호 입니다.");		
		
	}
}

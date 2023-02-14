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
		
		for(int i=0 ; i<arrayList.size();i++) {
			if(no == arrayList.get(i).getNo()) {
			System.err.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			
			System.out.println(arrayList.get(i).getNo()+ "\t"+
								   arrayList.get(i).getName()+"\t"+
								   arrayList.get(i).getKor()+"\t"+
								   arrayList.get(i).getEng()+"\t"+
								   arrayList.get(i).getMath()+"\t"+
								   arrayList.get(i).getTot()+"\t"+
								   arrayList.get(i).getAvg());
				
			System.out.print("수정 할 이름 입력 : ");
			String name = scan.next();
			System.out.print("수정 할 국어 입력 : ");
			int kor = scan.nextInt();
			System.out.print("수정 할 영어 입력 : ");
			int eng = scan.nextInt();;
			System.out.print("수정 할 수학 입력 : ");
			int math = scan.nextInt();
			
			arrayList.get(i).setName(name);
			arrayList.get(i).setKor(kor);
			arrayList.get(i).setEng(eng);
			arrayList.get(i).setMath(math);
			
			System.out.println("입력되었습니다.");
			}
			
		
			else{
				System.out.println("잘못된번호입니다."); 
				continue;
				}
		}
	}
}

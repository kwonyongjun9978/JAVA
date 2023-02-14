package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> arrayList = new ArrayList<SungJukDTO>();
	
	public void menu() {
		//ArrayList ���
		Scanner scan = new Scanner(System.in);
		SungJuk sungJuk = null;
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***********");
			System.out.println("  1. �Է�");
			System.out.println("  2. ���");
			System.out.println("  3. ����");
			System.out.println("  4. ����");
			System.out.println("  5. ����");
			System.out.println("  6. �� ");
			System.out.println("***********");
			System.out.print("��ȣ �Է� : ");
			num = scan.nextInt();
			
			if(num == 6) {break;}
			else if(num == 1) {sungJuk = new SungJukInsert();}
			else if(num == 2) {sungJuk = new SungJukList();}
			else if(num == 3) {sungJuk = new SungJukUpdate();}
			else if(num == 4) {sungJuk = new SungJukDelete();}
			else if(num == 5) {sungJuk = new SungJukSort();}
			else {System.out.println("1~6�������� �Է��ض�Ѥ�");
				  continue;}

			sungJuk.execute(arrayList);
			
			
		}//while
	}//menu
}

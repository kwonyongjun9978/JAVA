package io_12;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {
	private ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		Member member;
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***************");
			System.out.println("1. ���");
			System.out.println("2. ���");
			System.out.println("3. �ڵ��� �˻�");
			System.out.println("4. �̸����� ��������");
			System.out.println("5. ���� ����");
			System.out.println("6. ���� �б�");
			System.out.println("7. ������");
			System.out.println("***************");
			System.out.print("��ȣ : ");
			num = sc.nextInt();
			
			System.out.println();
			
			if(num == 1) member = new MemberInsert();
			else if(num == 2) member = new MemberPrint();
			else if(num == 3) member = new MemberPhoneSearch();
			else if(num == 4) member = new MemberNameAsc();
			else if(num == 5) member = new MemberFileOutput();
			else if(num == 6) member = new MemberFileInput();
			else if(num == 7) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {System.out.println("1~7�������� �Է��ض�Ѥ�");
			  continue;}
			
			member.execute(arrayList);
		}
	}
}

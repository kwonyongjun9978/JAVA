package io_12;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberPhoneSearch implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �ڵ��� ��ȣ �Է� : ");
		String phone = sc.next();
		
		int sw=0;
		for(MemberDTO memberDTO : arrayList) {
			if(memberDTO.getPhone().equals(phone)) {
				System.out.println("�̸�\\t����\\t�ڵ���\\t�ּ�");
				System.out.println(memberDTO);
				sw=1;
				break;
			}
		}
		if(sw == 0) System.out.println("�˻��� �ڵ��� ��ȣ�� �����ϴ�.");
	}
}

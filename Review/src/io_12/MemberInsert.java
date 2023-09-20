package io_12;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInsert implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("�ڵ��� �Է� : ");
		String phone = sc.next();
		System.out.print("�ּ� �Է� : ");
		String address = sc.next();
		
		MemberDTO memberDTO = new MemberDTO(name,age,phone,address);
		
		arrayList.add(memberDTO);
		
		System.out.println("�Է��Ͽ����ϴ�.");

	}

}

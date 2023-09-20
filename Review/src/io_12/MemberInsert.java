package io_12;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInsert implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("핸드폰 입력 : ");
		String phone = sc.next();
		System.out.print("주소 입력 : ");
		String address = sc.next();
		
		MemberDTO memberDTO = new MemberDTO(name,age,phone,address);
		
		arrayList.add(memberDTO);
		
		System.out.println("입력하였습니다.");

	}

}

package io_12;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberPhoneSearch implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 핸드폰 번호 입력 : ");
		String phone = sc.next();
		
		int sw=0;
		for(MemberDTO memberDTO : arrayList) {
			if(memberDTO.getPhone().equals(phone)) {
				System.out.println("이름\\t나이\\t핸드폰\\t주소");
				System.out.println(memberDTO);
				sw=1;
				break;
			}
		}
		if(sw == 0) System.out.println("검색한 핸드폰 번호가 없습니다.");
	}
}

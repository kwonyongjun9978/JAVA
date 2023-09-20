package io_12;

import java.util.ArrayList;

public class MemberPrint implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		System.out.println("이름\t나이\t핸드폰\t주소");
		
		for(MemberDTO memberDTO : arrayList) {
			System.out.println(memberDTO);
		}

	}

}

package io_12;

import java.util.ArrayList;

public class MemberPrint implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		System.out.println("�̸�\t����\t�ڵ���\t�ּ�");
		
		for(MemberDTO memberDTO : arrayList) {
			System.out.println(memberDTO);
		}

	}

}

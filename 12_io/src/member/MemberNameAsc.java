package member;

import java.util.ArrayList;
import java.util.Collections;


public class MemberNameAsc implements Member{
	
	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		Collections.sort(arrayList);
		
		System.out.println("�̸�\t����\t�ڵ���\t�ּ�");
		for (MemberDTO memberDTO : arrayList) {
			System.out.println(memberDTO); 
		}
		
	}

}

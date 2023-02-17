package member;

import java.util.ArrayList;
import java.util.Collections;


public class MemberNameAsc implements Member{
	
	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		Collections.sort(arrayList);
		
		System.out.println("이름\t나이\t핸드폰\t주소");
		for (MemberDTO memberDTO : arrayList) {
			System.out.println(memberDTO); 
		}
		
	}

}

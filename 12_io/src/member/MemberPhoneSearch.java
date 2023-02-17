package member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberPhoneSearch implements Member{

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int phone = scan.nextInt();
	}

}

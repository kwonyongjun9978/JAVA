package member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberPhoneSearch implements Member{

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��ȣ �Է� : ");
		int phone = scan.nextInt();
	}

}

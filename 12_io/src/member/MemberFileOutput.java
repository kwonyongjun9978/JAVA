package member;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemberFileOutput implements Member{

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt"));
			
			for(MemberDTO memberDTO : arrayList) {
				oos.writeObject(memberDTO);
			}
			
			oos.close();
			
			
		} catch (IOException e) {
			  e.printStackTrace();
		}
		
	}

}

package io_12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemberFileOutput implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt"));
			
			for(MemberDTO memberDTO : arrayList) {
				oos.writeObject(memberDTO);
			}
			
			oos.close();
			System.out.println("파일에 저장 완료");
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}

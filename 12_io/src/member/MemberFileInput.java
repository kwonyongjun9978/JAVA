package member;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MemberFileInput implements Member{

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		
		arrayList.clear(); //�ʱ�ȭ
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.txt"));
			
			while(true) {
				try {
					MemberDTO memberDTO = (MemberDTO)ois.readObject();
					arrayList.add(memberDTO);
				}catch(EOFException e){
					break;
				}
			}
		
			ois.close();
			System.out.println("���Ͽ� �б� �Ϸ�");
		
	
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}



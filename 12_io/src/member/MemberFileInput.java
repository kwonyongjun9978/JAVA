package member;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MemberFileInput implements Member{

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		
		arrayList.clear(); //초기화
		
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
			System.out.println("파일에 읽기 완료");
		
	
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
/*
EOFException
데이터를 읽거나 쓰는 동안 파일 끝(End of File)에 도달했을 때 발생합니다.
즉, 파일의 끝까지 읽거나 쓰려고 시도할 때 발생하는 예외입니다.
 */



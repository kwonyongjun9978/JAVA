package interface_08;

import java.util.ArrayList;

public class SungJukList implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		
		for(SungJukDTO sungJukDTO : arrayList) {
			System.out.println(sungJukDTO);
		}

	}

}

package interface_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class SungJukSort implements SungJuk {

	public void menu(ArrayList<SungJukDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("********************");
			System.out.println("  1. �������� ��������");
			System.out.println("  2. �̸����� ��������");
			System.out.println("  3. ���� �޴�");
			System.out.println("********************");
			System.out.print  ("��ȣ �Է� : ");
			num = sc.nextInt();
			if(num == 3)break;
			
			Comparator<SungJukDTO> com = null;
			if(num == 1) {
				com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						if(s1.getTot() < s2.getTot()) return 1;
						else if(s1.getTot() > s2.getTot()) return -1;
						else return 0;
					}
				};
			}else if(num == 2) {
				com = new Comparator<SungJukDTO>() {
				@Override
				public int compare(SungJukDTO s1, SungJukDTO s2) {
					return s1.getName().compareTo(s2.getName());
				}
			};
			}else {
				System.out.println("1~3�������� �Է��ϼ���");
				continue;
			}
			
			Collections.sort(arrayList, com);
			
			new SungJukList().execute(arrayList);
			
		}
	}
	
	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		this.menu(arrayList);
	}
}

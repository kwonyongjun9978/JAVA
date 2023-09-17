package interface_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		int num;
		//SungJukList sungJukList = new SungJukList();
		while(true) {
			
			System.out.println();
			System.out.println("********************");
			System.out.println("  1. �������� ��������");
			System.out.println("  2. �̸����� ��������");
			System.out.println("  3. ���� �޴�");
			System.out.println("********************");
			System.out.print  ("��ȣ �Է� : ");
			num = scan.nextInt();
	        if(num == 3) break;
	        
	        Comparator<SungJukDTO> com = null;
	        if(num == 1) {
	        	 com = new Comparator<SungJukDTO>() { //�͸� ���� Ŭ����
	        		@Override
	        		public int compare(SungJukDTO s1, SungJukDTO s2) {
	        			//�������� ��������
	        			if(s1.getTot() < s2.getTot()) return 1;
	        			else if(s1.getTot() > s2.getTot()) return -1;
	        			else return 0;
	  
	        		}
	        	};
	        	
	        }else if(num == 2) {
	        	com = new Comparator<SungJukDTO>() { //�͸� ���� Ŭ����
	        		@Override
	        		public int compare(SungJukDTO s1, SungJukDTO s2) {
	        			//�̸����� ��������
	        			return s1.getName().compareTo(s2.getName()); 
	        			/*
	        			compareTo �޼���� Comparable �������̽��� ���ǵ� �޼����, ��ü�� ���ϴ� �� ���˴ϴ�. ������ String Ŭ������ Comparable �������̽��� ������ Ŭ���� �� �ϳ��̸�, compareTo �޼��带 ���ڿ� �񱳿� �°� ������(override)�ϰ� �ֽ��ϴ�.
						���� s1.getName().compareTo(s2.getName()) �ڵ忡�� compareTo �޼���� String Ŭ������ �޼��带 ȣ���ϴ� ���̸�, �̰��� ���ڿ��� ���ϱ� ���� �޼����Դϴ�. Comparable �������̽��� compareTo �޼���� ��ü �񱳿� ��������, String Ŭ������ ���ڿ� �񱳸� ���� compareTo �޼��带 �����Ͽ����ϴ�.
	        			 */
	        		}
	        	};
	        } else {
	        	System.out.println("1 ~ 3�������� �Է��ϼ���");
	        	continue;
	        }
	        
	        Collections.sort(arrayList, com);
	        
	        //sungJukList.execute(arrayList);
	        new SungJukList().execute(arrayList); //�̷��� �ѹ������ε� ȣ�� ����
	        
		}//while
	}
}

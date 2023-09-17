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
			System.out.println("  1. 총점으로 내림차순");
			System.out.println("  2. 이름으로 오름차순");
			System.out.println("  3. 이전 메뉴");
			System.out.println("********************");
			System.out.print  ("번호 입력 : ");
			num = scan.nextInt();
	        if(num == 3) break;
	        
	        Comparator<SungJukDTO> com = null;
	        if(num == 1) {
	        	 com = new Comparator<SungJukDTO>() { //익명 내부 클래스
	        		@Override
	        		public int compare(SungJukDTO s1, SungJukDTO s2) {
	        			//총점으로 내림차순
	        			if(s1.getTot() < s2.getTot()) return 1;
	        			else if(s1.getTot() > s2.getTot()) return -1;
	        			else return 0;
	  
	        		}
	        	};
	        	
	        }else if(num == 2) {
	        	com = new Comparator<SungJukDTO>() { //익명 내부 클래스
	        		@Override
	        		public int compare(SungJukDTO s1, SungJukDTO s2) {
	        			//이름으로 오름차순
	        			return s1.getName().compareTo(s2.getName()); 
	        			/*
	        			compareTo 메서드는 Comparable 인터페이스에 정의된 메서드로, 객체를 비교하는 데 사용됩니다. 하지만 String 클래스는 Comparable 인터페이스를 구현한 클래스 중 하나이며, compareTo 메서드를 문자열 비교에 맞게 재정의(override)하고 있습니다.
						따라서 s1.getName().compareTo(s2.getName()) 코드에서 compareTo 메서드는 String 클래스의 메서드를 호출하는 것이며, 이것은 문자열을 비교하기 위한 메서드입니다. Comparable 인터페이스와 compareTo 메서드는 객체 비교에 사용되지만, String 클래스는 문자열 비교를 위해 compareTo 메서드를 구현하였습니다.
	        			 */
	        		}
	        	};
	        } else {
	        	System.out.println("1 ~ 3번까지만 입력하세요");
	        	continue;
	        }
	        
	        Collections.sort(arrayList, com);
	        
	        //sungJukList.execute(arrayList);
	        new SungJukList().execute(arrayList); //이렇게 한문장으로도 호출 가능
	        
		}//while
	}
}

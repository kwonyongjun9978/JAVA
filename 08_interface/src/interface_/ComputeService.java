package interface_;

import java.util.Scanner;

public class ComputeService {
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		Compute com = null; 
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***********");
			System.out.println("    1. ��");
			System.out.println("    2. ��");
			System.out.println("    3. ��");
			System.out.println("    4. ��");
			System.out.println("    5. ������");
			System.out.println("***********");
			System.out.print("  ��ȣ  : ");
			num = scan.nextInt();
			
			if(num == 5) break;
			else if(num == 1) com=new SumImpl(); //�θ� = �ڽ�
			else if(num == 2) com=new SubImpl();
			else if(num == 3) com=new MulImpl();
			else if(num == 4) com=new DivImpl();
			com.disp();
		}//while
	}//menu

}

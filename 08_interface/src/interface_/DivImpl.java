package interface_;

import java.util.Scanner;

public class DivImpl implements Compute{
	private int x, y;
	
	public DivImpl() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x�� �� �Է� : ");
		x=scan.nextInt();
		System.out.print("y�� �� �Է� : ");
		y=scan.nextInt();
	}
	@Override
	public void disp() {
		System.out.println(x+" / "+y+" = "+String.format("%.2f",((double)x/y)));
		
	}

}

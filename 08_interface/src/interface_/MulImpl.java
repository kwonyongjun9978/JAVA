package interface_;

import java.util.Scanner;

public class MulImpl implements Compute{
	private int x, y;
	
	public MulImpl() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x�� �� �Է� : ");
		x=scan.nextInt();
		System.out.print("y�� �� �Է� : ");
		y=scan.nextInt();
	}
	@Override
	public void disp() {
		System.out.println(x+" * "+y+" = "+(x*y));
		
	}

}

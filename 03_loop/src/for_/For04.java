package for_;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x�� �Է� : ");
		int x = sc.nextInt();
		System.out.print("y�� �Է� : ");
		int y = sc.nextInt();
		int a=1;
		for(int i=1; i<=y; i++) {
			a*=x;
		}
		System.out.println(x+"��"+y+" ���� "+a);
		

	}

}
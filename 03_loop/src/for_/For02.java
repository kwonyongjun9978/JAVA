package for_;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ϴ� ���� �Է� : ");
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" +i+"="+dan*i);
		}
		
	}

}
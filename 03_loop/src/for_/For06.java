package for_;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		
		int a = sc.nextInt();
		int b=1;
		String c="";
		
		for(int i=1; i<=a; i++) {
			b*=i;
			c += i;
			if(i==a) break;
			c = c + "*";
		}
		System.out.printf(a+"! = "+b+" ("+c+")");
		
		}
		
}


/*
[����] ���丮���� ���Ͻÿ� (for)
- �ԷµǴ� ���ڴ� 1 ~ 10 ���̸� �Է��Ѵ�.
[������]
���� �Է� : 3
3! = 6 (1*2*3)
---------------------
���� �Է� : 5
5! = 120 (1*2*3*4*5) 
*/
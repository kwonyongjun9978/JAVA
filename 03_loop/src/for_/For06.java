package for_;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		
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
[문제] 팩토리얼을 구하시오 (for)
- 입력되는 숫자는 1 ~ 10 사이만 입력한다.
[실행결과]
숫자 입력 : 3
3! = 6 (1*2*3)
---------------------
숫자 입력 : 5
5! = 120 (1*2*3*4*5) 
*/
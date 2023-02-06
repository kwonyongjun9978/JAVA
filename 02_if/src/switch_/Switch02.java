package switch_;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.print("a의 값 : ");
		int a = sc.nextInt();
		System.err.print("b의 값 : ");
		int b = sc.nextInt();
		System.err.print("연산자(+,-,*,/)를 입력 : ");
		String op = sc.next();
		
		switch(op) {
		case "+" : System.out.println(a+" +" +b+" = "+(a+b)); break; 
		case "-" : System.out.println(a+" - "+b+" = "+(a-b)); break; 
		case "*" : System.out.println(a+" * "+b+" = "+(a*b)); break; 
		case "/" : System.out.println(a+" / "+b+" = "+((double)a/b));; break; 
		}
		
		

	}

}
/*
[문제] 2개의 정수형 숫자와 연산자(+,-,*,/)를 입력하여 계산하시오

[실행결과]
a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : +

25 + 36 = xx
--------------------------------
a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : /

25 / 36 = 0.6944444444444444
--------------------------------
a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : #

연산자 error
*/

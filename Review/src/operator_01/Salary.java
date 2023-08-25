package operator_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String na = scan.next();
		System.out.println("직급 입력 : ");
		String po = scan.next();
		System.out.println("기본급 입력: ");
		int a = scan.nextInt();
		System.out.println("수당 입력: ");
		int b = scan.nextInt();
		
		int c = a+b;
		double d;
		if(c>=5000000) {
			d = c*0.03;
		}else if(c>=3000000) {
			d = c*0.02;
		}else {
			d = c*0.01;
		}
		double e = c-d;
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("*** "+na+" "+po+" 월급 ***");
		System.out.println("기본급 : "+df.format(a)+"원");
		System.out.println("수당 : "+df.format(b)+"원");
		System.out.println("합계 : "+df.format(c)+"원");
		System.out.println("세금 : "+df.format(d)+"원");
		System.out.println("월급 : "+df.format(e)+"원");
		
	}

}
/*
[문제] 월급 계산 프로그램 - 조건 연산자
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금
[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000
*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
*/
package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //키보드로부터 입력받는 Scanner 클래스를 생성
		System.out.print("이름 입력 : ");
		String na = scan.next();
		System.out.print("직급 입력 : ");
		String po = scan.next();
		System.out.print("기본급 입력 : ");
		int re = scan.nextInt();
		System.out.print("수당 입력 : ");
		int al = scan.nextInt();
		
		int a = re+al; //합계
		double b; //세금
		if(a>=5000000) {
			b=a*0.03;
		}
		else if(a>=3000000) {
			b=a*0.02;
		}
		else {
			b=a*0.01;
		}
		double c = a - b; //월급
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("*** "+na+" "+po+" 월급 ***");
		System.out.println("기본급 : "+df.format(re)+"원");
		System.out.println("수당 : "+df.format(al)+"원");
		System.out.println("합계 : "+df.format(a)+"원");
		System.out.println("세금 : "+df.format(b)+"원");
		System.out.println("월급 : "+df.format(c)+"원");
		
		/*
		12345
		#,###.## = 12,345
		#,##0.00 = 12,345.00
		*/
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
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

/*
객체형 변수에 기본형 변수를 더하는 것은 가능합니다. Java에서는 객체형과 기본형 간의 자동 형 변환(autoboxing, unboxing)이 지원되기 때문에 기본형 값을 객체형으로 변환하여 연산을 수행할 수 있습니다.

예를 들어, 위의 코드에서 c += i; 부분에서 변수 i는 기본형 변수로서 정수 값을 갖고 있습니다. 하지만 c는 객체형 변수인 문자열(String)이므로 자동으로 기본형 i가 문자열로 변환되어 문자열에 더해집니다. 이렇게 자동 형 변환을 통해 기본형과 객체형 간의 연산이 가능해집니다.
*/
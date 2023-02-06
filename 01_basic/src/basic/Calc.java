package basic;

public class Calc {

	public static void main(String[] args) {
		/*
		[문제] 320(a), 258(b)을 변수에 저장하여 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오
		단, 소수이하 2째자리까지 출력하시오
		[실행결과]
		320 + 258 = xxx
		320 - 258 = xxx
		320 * 258 = xxx
		320 / 258 = x.xx
		*/
		int a = 320; 
		int b = 258;
		int sum = (a+b);
		int sub = (a-b);
		int mul = (a*b);
		double div = ((double)a/b);
		
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println(a+" - "+b+" = "+sub);
		System.out.println(a+" * "+b+" = "+mul);
		System.out.println(a+" / "+b+" = "+String.format("%.2f", div));
		
		System.out.printf("%d + %d = %d\n",a,b,sum);
		System.out.printf("%d - %d = %d\n",a,b,sub);
		System.out.printf("%d * %d = %d\n",a,b,mul);
		System.out.printf("%d / %d = %.2f\n",a,b,div);
		
		/*
		//print vs println vs printf
		int num = 9978;
		System.out.print("print ! " + num + "\n");	//print   : 괄호안 내용을 단순히 출력. 개행문자(\n) 포함X.
											//		    형식(int, float, double 등)에 구애받지 않는 문자를 그대로 출력하고 싶을 때 사용한다.			
		System.out.println("println ! " + num);		//println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.
											//          print와 동일하게 형식(int, float, double 등)에 구애받지 않는 문자를 그대로 출력하고 싶을 때 사용한다.
		System.out.printf("printf ! %d \n", num);	//printf  : C에서의 printf와 동일. %d, %s 등을 쓰기위해 사용. 개행문자 포함X
											//          형식을 신경써야할 때 사용(int, long, float, double 등)
		*/
		
		/*
		서식문자
		%d : 정수
		%f : 실수
		%c : 문자
		%s : 문자열
		*/
		
		/*
		//주의
		System.out.println("25 + 3 = " + 25 + 3);
		System.out.println("25 + 3 = " + (25 + 3));
		*/
		
		
	}

}

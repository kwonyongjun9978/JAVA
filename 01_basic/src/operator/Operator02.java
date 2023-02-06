package operator;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		String result = num%2==0 ? "짝수" : "홀수";
		System.out.println(result);
		
		//num을 2로 나누면 나머지가 0 이고, 3으로 나누어도 나머지 0
		String result01 = num%2==0 && num%3==0 ? "공배수이다" : "공배수 아니다";
		System.out.println(result01);

	}

}

package operator_01;

public class Money {

	public static void main(String[] args) {
		int money = 5378;
		System.out.println("현금 : "+money+"원");
		System.out.println("천원 : "+money/1000+"장");
		System.out.println("백원 : "+(money%1000)/100+"개");
		System.out.println("십원 : "+((money%1000)%100)/10+"개");
		System.out.println("일원 : "+((money%1000)%100)%10+"개");
	}
}
/*
[문제]
동전교환기 - 현금 5378원이 있습니다.
[실행결과]
현금 : 5378원
천원 : 5장
백원 : 3개
십원 : 7개
일원 : 8개
*/

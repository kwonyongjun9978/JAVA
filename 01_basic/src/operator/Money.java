package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
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
	
		int money = 5378;
		
		Scanner scan = new Scanner(System.in); //키보드로부터 입력받는 (lang package안의)Scanner 클래스를 생성
											   //(lang package안의)System 클래스에서 in 메소드 호출
		System.out.print("돈 입력 : ");
		money = scan.nextInt(); //Scanner 클래스에서 nextInt메소드 호출
		
		int a = money/1000;
		int b = (money%1000)/100;
		int c = ((money%1000)%100)/10;
		int d = ((money%1000)%100)%10;
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("현금 : "+df.format(money)+"원"); //3자리마다 , 찍기
		System.out.printf("천원 : %d장\n",a);
		System.out.printf("백원 : %d개\n",b);
		System.out.printf("십원 : %d개\n",c);
		System.out.printf("일원 : %d개\n",d);
	}

}

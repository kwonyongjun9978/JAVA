package basic;

import java.util.Arrays;
import java.util.Random;

public class MethodTest02 {

	public static void main(String[] args) {
		//난수 : 컴퓨터가 불규칙적으로 발생하는 수(0<=난수<1)
		//클래스(Math)를 바로 썻을경우 메소드(random)의 변수가 static(실행하자마자 메모리에 잡힌다)으로 설정 되어있다.
		//static메소드에서는 static변수만 사용 가능
		double a = Math.random(); //클래스명.메소드명(값1, 값2,...) → 메소드가 static 일 경우
		System.out.println("난수값은? "+a);
		
		//java.util패키지는 import 시켜줘야 한다.
		//java.util패키지안의 Random클래스에서 nextDouble이라는 메소드를 호출한다
		//메소드의 변수가 static이 아니기 때문에 클래스(Random)를 생성(클래스를 반드시 new)해줘야한다.(인스턴스화)
		Random r = new Random();
		double b = r.nextDouble(); //객체명.메소드명(값1, 값2,...)
		System.out.println("난수값은? "+b);
		
		//배열
		int[] ar = new int[5]; 
		ar[0] = 25;
		ar[1] = 13;
		ar[2] = 45;
		ar[3] = 30;
		ar[4] = 15;
		System.out.println(ar[0]+","+ar[1]+","+ar[2]+","+ar[3]+","+ar[4]);
		
		//Sort(정렬)
		//오름차순
		//sort 메소드의 변수는 정수형 배열로 들어가고 반환값은 없다(static void)
		Arrays.sort(ar);
		System.out.println(ar[0]+","+ar[1]+","+ar[2]+","+ar[3]+","+ar[4]);
		
	}

}
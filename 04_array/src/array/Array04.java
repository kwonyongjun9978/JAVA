package array;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i;
		boolean[] ar;
		ar=new boolean[5]; //초기값 false
		
		while(true) {
			System.out.println("주차장 관리 프로그램");
			System.out.println("**************");
			System.out.println("  "+"1. 입차");
			System.out.println("  "+"2. 출차");
			System.out.println("  "+"3. 리스트");
			System.out.println("  "+"4. 종료");
			System.out.println("**************");
			System.out.print(" "+"메뉴 : ");
			num = sc.nextInt();
			
			if(num == 3) {
				for(i=0; i<ar.length; i++) {
					System.out.println((i+1)+"위치 : "+ar[i]);
				}
			}
			if(num == 4) break;
			
			if(num ==1) {
				
				System.out.println("위치 입력 : ");
				int position= sc.nextInt();
				if(ar[position-1]) {
					System.out.println(position+"위치에 이미 주차되어있습니다");
				}
				else {
					ar[position-1] = true;
					System.out.println(position+"위치에 입차");
				}
				
			}
			
			if(num ==2) {
				
				System.out.println("위치 입력 : ");
				int position= sc.nextInt();
				if(ar[position-1]) {
					ar[position-1] = false;
					System.out.println(position+"위치에서 출차되었습니다");
				}
				else {
					
					System.out.println(position+"위치에 주차되어 있지않습니다");
				}
				
			}
				
			
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
/*
[문제] 주차관리 프로그램

[실행결과]
주차장 관리 프로그램
**************
   1. 입차
   2. 출차
   3. 리스트
   4. 종료
**************
  메뉴 : 
  
1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false  
*/
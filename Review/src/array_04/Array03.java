package array_04;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 입력 : ");
		int size = sc.nextInt();
		
		int[] ar;
		ar = new int[size];
		int sum = 0;
		for(int i=0; i<size; i++) {
			System.out.print("ar["+i+"] 입력 : ");
			ar[i] = sc.nextInt();
		}
		
		//합
		for(int data : ar) {
			sum+=data;
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("합 = "+sum);
		
		//최대값
		int max = ar[0];
		for(int i=0; i<size; i++) {
			if(max<ar[i]) {
				max = ar[i];
			}
		}
		System.out.println("최대값 = "+max);
		
		//최소값
		int min = ar[0];
		for(int i=0; i<size; i++) {
			if(min>ar[i]) {
				min = ar[i];
			}
		}
		System.out.println("최소값 = "+min);

	}

}
/*
[문제] 배열의 크기를 입력받아서 배열을 생성한다.
데이터를 출력하고 합, 최대값, 최소값을 구하시오.
[실행결과]
배열 크기 입력 : 3
ar[0] 입력 : 25
ar[1] 입력 : 13
ar[2] 입력 : 57
25 13 57
합 = xxx
최대값 = xx
최소값 = xx
*/

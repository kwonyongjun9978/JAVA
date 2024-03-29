package array_04;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		
		System.out.print("게임을 실행하시겠습니까(Y/N) : ");
		String yn = sc.next();
		if(yn.equals("y") || yn.equals("Y")) {
			System.out.println("게임을 시작합니다");
			
			for(int i=0; i<com.length; i++) {
				com[i] = (int)(Math.random()*9)+1;
				for(int j=0; j<i; j++) { //중복제거
					if(com[i] == com[j]) {
						i--;
						break;
					}//if
				}//for
			}//for
			for(int data : com) {
				System.out.print(data + " ");
			}
			System.out.println();
			
			while(true) {
				int strike = 0;
				int ball = 0;
				System.out.print("숫자입력 : ");
				int num = sc.nextInt();
				user[0]=num/100;
				user[1]=(num%100)/10;
				user[2]=(num%100)%10;
				
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<com.length; j++) {
						if(com[i]==user[j]) {
							if(i==j) {
								strike++;
							}else{
								ball++;
							}
						}
					}//for j
				}//for i
				System.out.println(strike+"스트라이크\t"+ball+"볼");
				
				
				if(strike == 3) {
					System.out.println("정답!");
					break; //while을 벗어나라
				}
			}//while
		}else {
			System.out.println("프로그램을 종료합니다.");
		}
	}

}
/*
[문제] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 숫자를 맞추는 게임
단, 중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼

프로그램을 종료합니다.
*/

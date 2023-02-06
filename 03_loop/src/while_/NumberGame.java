package while_;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		int com, user, count=0;
		
		while(true) {
				com = (int)(Math.random()*(100) + 1);
				Scanner sc = new Scanner(System.in);
				System.out.println("1~100사이의 숫자를 맞추세요");
				while(true) {
					System.out.print("숫자 입력 : ");
					user = sc.nextInt();
					count++;
					if(com == user)break;
					else if(com>user) {
						System.out.println(user+"보다 큰 숫자입니다.");
					}
					else {
						System.out.println(user+"보다 작은 숫자입니다.");
					}
				}
				System.out.println("딩동뎅..."+count+"번만에 맞추셨습니다.");
				
				System.out.print("한번 더 (y/n) : ");
				//int yn = sc.nextInt();
				String yn = sc.next();
				
				//if(yn == 'n' || yn =='N')
				if(yn.equals("n") || yn.equals("N")) break;
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
/*
 [문제] 숫자 맞추기 게임
- 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
- 몇 번만에 맟주었는지 출력한다.

[실행결과]
1 ~ 100사이의 숫자를 맞추세요 (70)

숫자 입력 : 50
50보다 큰 숫자입니다.

숫자 입력 : 85
85보다 작은 숫자입니다.

~~~

숫자 입력 : 70
딩동뎅...x번만에 맞추셨습니다.

한번 더 (y/n) :
*/

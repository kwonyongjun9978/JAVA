package for_;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("insert coin : ");
		int won= sc.nextInt();
		for(int i=won; i>=300;) {
			
		System.out.print("����(1), ����(2), ��(3) �� ��ȣ �Է� : ");
		int b= sc.nextInt();
		int com = (int)(Math.random()*3)+1;
		if(b==1) {
			if(com==1) {
				System.out.println("��ǻ�� : ����   �� : ����");
				System.out.println("You Draw!!");
			}
			else if(com==2) {
				System.out.println("��ǻ�� : ����   �� : ����");
				System.out.println("You Lose!!");
			}
			else {
				System.out.println("��ǻ�� : ��   �� : ����");
				System.out.println("You Win!!");
			}
		}
		else if(b==2){
			if(com==1) {
				System.out.println("��ǻ�� : ����   �� : ����");
				System.out.println("You Win!!");
			}
			else if(com==2) {
				System.out.println("��ǻ�� : ����   �� : ����");
				System.out.println("You Draw!!");
			}
			else {
				System.out.println("��ǻ�� : ��   �� : ����");
				System.out.println("You Lose!!");
			}
		}
		else {
			if(com==1) {
				System.out.println("��ǻ�� : ����   �� : ��");
				System.out.println("You Lose!!");
			}
			else if(com==2) {
				System.out.println("��ǻ�� : ����   �� : ��");
				System.out.println("You Win!!");
			}
			else {
				System.out.println("��ǻ�� : ��   �� : ��");
				System.out.println("You Draw!!");
			}
		
	  }
		i-=300;
	  }
		//switch���
		/* 
		Scanner sc = new Scanner(System.in);
		System.out.print("insert coin : ");
		int coin = sc.nextInt();
		for(;coin>300;coin-=300) {
		System.out.print("����(3), ����(2),��(1)�� �ϳ��� �Է�>");
		int user = sc.nextInt();
		int com = (int)(Math.random()*3+1);
		int result = com -user;	
		switch(result) {
			case 0: System.out.println("You Draw!!");break;
			case 2: case -1:System.out.println("You Win!!");break;
			case -2: case 1:System.out.println("You Lose!!");break;	
			default:coin+=300; break;
		}
		}
		*/
		
	}
}
/*
  [����] ����, ����, �� ����
- ����(1), ����(2), ���ڱ�(3) �����Ѵ�.
- ��ǻ��(com)�� 1 ~ 3���� ������ ���´�
- 1���Ӵ� 300������ �Ѵ�.
[������]
insert coin : 1000
����(1), ����(2), ��(3) �� ��ȣ �Է� : 3 (user, �����)
��ǻ�� : ����   �� : ���ڱ�
You Win!!
����(1),����(2),��(3) �� ��ȣ �Է� : 1 (user)
��ǻ�� : ����   �� : ����
You Draw!!
����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����   �� : ���ڱ�
You Lose!!
*/
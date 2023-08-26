package loop_03;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("insert coin : ");
		int coin = sc.nextInt();
		for(int i=coin/300; i>0; i--) {
			System.out.print("����(1), ����(2), ��(3) �� ��ȣ �Է� : ");
			int user = sc.nextInt();
			int com = (int)(Math.random()*3)+1;
			if(user == 1) {
				if(com == 1) {
					System.out.println("��ǻ�� : ����   �� : ����");
					System.out.println("You Draw!!");
				}else if(com == 2){
					System.out.println("��ǻ�� : ����   �� : ����");
					System.out.println("You Lose!!");
				}else {
					System.out.println("��ǻ�� : ��   �� : ����");
					System.out.println("You Win!!");
				}
			}else if(user == 2) {
				if(com == 1) {
					System.out.println("��ǻ�� : ����   �� : ����");
					System.out.println("You Win!!");
				}else if(com == 2){
					System.out.println("��ǻ�� : ����   �� : ����");
					System.out.println("You Draw!!");
				}else {
					System.out.println("��ǻ�� : ��   �� : ����");
					System.out.println("You Lose!!");
				}
			}else {
				if(com == 1) {
					System.out.println("��ǻ�� : ����   �� : ��");
					System.out.println("You Lose!!");
				}else if(com == 2){
					System.out.println("��ǻ�� : ����   �� : ��");
					System.out.println("You Win!!");
				}else {
					System.out.println("��ǻ�� : ��   �� : ��");
					System.out.println("You Draw!!");
				}
			}
		}
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

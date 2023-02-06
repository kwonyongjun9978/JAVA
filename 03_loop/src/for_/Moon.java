package for_;

import java.util.Scanner;

public class Moon {

		public static void main(String[] args) {
			String shape[] = {"����", "����", "��"};
			Scanner scan = new Scanner(System.in);
			
			
			System.out.print("insert coin : ");
			int insertCoin = scan.nextInt();
			
			for(int i=insertCoin/300; i>0 ; i--) {
				int com = (int)(Math.random()*3 +1);
				System.out.print("����(1), ����(2), ��(3) �� ��ȣ �Է� : ");
				int user = scan.nextInt();
				if(user<1 || user>3) {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					i++;
					continue;
				}
				System.out.println("��ǻ�� : " + shape[com-1] + "\t�� : " + shape[user-1]);
				for(int j =1; j<4; j++) 
					if(user==j) {
						if(com == (j-1==0 ? 3 : j-1)) //j=3 -> 3 
							System.out.println("You Win!!\n");
						else if(com==j) 
							System.out.println("You Draw!!\n");
						else
							System.out.println("You Lose!!\n");
					}
					
			}
			System.out.println("you need to insert coin");
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
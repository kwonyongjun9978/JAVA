package while_;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		int com, user, count=0;
		
		while(true) {
				com = (int)(Math.random()*(100) + 1);
				Scanner sc = new Scanner(System.in);
				System.out.println("1~100������ ���ڸ� ���߼���");
				while(true) {
					System.out.print("���� �Է� : ");
					user = sc.nextInt();
					count++;
					if(com == user)break;
					else if(com>user) {
						System.out.println(user+"���� ū �����Դϴ�.");
					}
					else {
						System.out.println(user+"���� ���� �����Դϴ�.");
					}
				}
				System.out.println("������..."+count+"������ ���߼̽��ϴ�.");
				
				System.out.print("�ѹ� �� (y/n) : ");
				//int yn = sc.nextInt();
				String yn = sc.next();
				
				//if(yn == 'n' || yn =='N')
				if(yn.equals("n") || yn.equals("N")) break;
		}
		System.out.println("���α׷��� �����մϴ�.");

	}

}
/*
 [����] ���� ���߱� ����
- ��ǻ�Ͱ� 1 ~ 100������ ������ �߻��ϸ�, �߻��� ������ ���ߴ� ����
- �� ������ ���־����� ����Ѵ�.
[������]
1 ~ 100������ ���ڸ� ���߼��� (70)
���� �Է� : 50
50���� ū �����Դϴ�.
���� �Է� : 85
85���� ���� �����Դϴ�.
~~~
���� �Է� : 70
������...x������ ���߼̽��ϴ�.
�ѹ� �� (y/n) :
*/
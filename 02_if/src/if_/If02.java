package if_;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("a�� �� : ");
		int a =scan.nextInt();
		System.out.print("b�� �� : ");
		int b =scan.nextInt();
		System.out.print("c�� �� : ");
		int c =scan.nextInt();
		double avg = (a+b+c)/3;
		if(avg>=60) {
			if(a>=40 && b>=40 && c>=40) {
				System.out.println("�հ�");
			}
			else {
				System.out.println("�������� ���հ�");
			}
		}
		else {
			System.out.println("���հ�");
		}
	}

}
/*
[����] 
3����(a,b,c)�� ������ �Է¹޾Ƽ� �հ����� ���հ����� ����Ͻÿ�
�հ��� ����� 60�� �̻��̾�� �ϰ� �� ������ 40�� �̻��̾�� �Ѵ�
[������]
a�� �� : 98
b�� �� : 90
c�� �� : 85
�հ�
a�� �� : 98
b�� �� : 90
c�� �� : 35
�������� ���հ�
a�� �� : 68
b�� �� : 50
c�� �� : 45
���հ�
 */
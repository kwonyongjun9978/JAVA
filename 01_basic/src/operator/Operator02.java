package operator;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		String result = num%2==0 ? "¦��" : "Ȧ��";
		System.out.println(result);
		
		//num�� 2�� ������ �������� 0 �̰�, 3���� ����� ������ 0
		String result01 = num%2==0 && num%3==0 ? "������̴�" : "����� �ƴϴ�";
		System.out.println(result01);

	}

}
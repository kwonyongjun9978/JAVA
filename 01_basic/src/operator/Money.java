package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		/*
		[����]
		������ȯ�� - ���� 5378���� �ֽ��ϴ�.
		[������]
		���� : 5378��
		õ�� : 5��
		��� : 3��
		�ʿ� : 7��
		�Ͽ� : 8��
		*/
	
		int money = 5378;
		
		Scanner scan = new Scanner(System.in); //Ű����κ��� �Է¹޴� (lang package����)Scanner Ŭ������ ����
											   //(lang package����)System Ŭ�������� in �޼ҵ� ȣ��
		System.out.print("�� �Է� : ");
		money = scan.nextInt(); //Scanner Ŭ�������� nextInt�޼ҵ� ȣ��
		
		int a = money/1000;
		int b = (money%1000)/100;
		int c = ((money%1000)%100)/10;
		int d = ((money%1000)%100)%10;
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("���� : "+df.format(money)+"��"); //3�ڸ����� , ���
		System.out.printf("õ�� : %d��\n",a);
		System.out.printf("��� : %d��\n",b);
		System.out.printf("�ʿ� : %d��\n",c);
		System.out.printf("�Ͽ� : %d��\n",d);
	}

}
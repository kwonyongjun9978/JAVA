package operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Ű����κ��� �Է¹޴� Scanner Ŭ������ ����
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		
		String result = score>=80 && score<=100 ? "�հ�" : "���հ�";
		System.out.println(result);
		

	}

}
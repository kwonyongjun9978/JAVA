package switch_;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days;
		
		System.out.print("�� �Է� : ");
		int month = scan.nextInt();
		
		switch(month) { //�Ǽ��� Ÿ���� �� �� ����
		case 2 : days=28; break;
		case 1 : days=31; 
		case 3 : days=31; 
		case 5 : days=31; 
		case 7 : days=31; 
		case 8 : days=31; 
		case 10 : days=31; 
		case 12 : days=31; break; //switch�� �����
		case 4 : days=30; 
		case 6 : days=30; 
		case 9 : days=30;
		case 11 : days=30; break;
		default : days=0; //days �� �ʱ�ȭ�� �Ƚ��ױ� ������(garbage�� ����)
		}
		
		System.out.println(month + "����" + days + "�� �Դϴ�");
		
		
	}

}
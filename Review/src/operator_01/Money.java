package operator_01;

public class Money {

	public static void main(String[] args) {
		int money = 5378;
		System.out.println("���� : "+money+"��");
		System.out.println("õ�� : "+money/1000+"��");
		System.out.println("��� : "+(money%1000)/100+"��");
		System.out.println("�ʿ� : "+((money%1000)%100)/10+"��");
		System.out.println("�Ͽ� : "+((money%1000)%100)%10+"��");
	}
}
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

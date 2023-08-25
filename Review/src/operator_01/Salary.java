package operator_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸� �Է� : ");
		String na = scan.next();
		System.out.println("���� �Է� : ");
		String po = scan.next();
		System.out.println("�⺻�� �Է�: ");
		int a = scan.nextInt();
		System.out.println("���� �Է�: ");
		int b = scan.nextInt();
		
		int c = a+b;
		double d;
		if(c>=5000000) {
			d = c*0.03;
		}else if(c>=3000000) {
			d = c*0.02;
		}else {
			d = c*0.01;
		}
		double e = c-d;
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("*** "+na+" "+po+" ���� ***");
		System.out.println("�⺻�� : "+df.format(a)+"��");
		System.out.println("���� : "+df.format(b)+"��");
		System.out.println("�հ� : "+df.format(c)+"��");
		System.out.println("���� : "+df.format(d)+"��");
		System.out.println("���� : "+df.format(e)+"��");
		
	}

}
/*
[����] ���� ��� ���α׷� - ���� ������
�̸�, ����, �⺻��, ������ �Է��Ͽ� �հ�, ����, ������ ����Ͻÿ�
�� �հ谡 5,000,000�� �̻��̸� 3%
       3,000,000�� �̻��̸� 2%
       �ƴϸ� 1%
       
�հ� = �⺻�� + ����
���� = �հ� * ����
���� = �հ� - ����
[������]
�̸� �Է� : ȫ�浿
���� �Է� : ����
�⺻�� �Է� : 4900000
���� �Է� : 200000
*** ȫ�浿 ���� ���� ***
�⺻�� : 4,900,000��
���� : 200,000��
�հ� : 5,100,000��
���� : 153,000��
���� : 4,947,000��
*/
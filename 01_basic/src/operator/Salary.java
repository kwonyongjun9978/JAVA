package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Ű����κ��� �Է¹޴� Scanner Ŭ������ ����
		System.out.print("�̸� �Է� : ");
		String na = scan.next();
		System.out.print("���� �Է� : ");
		String po = scan.next();
		System.out.print("�⺻�� �Է� : ");
		int re = scan.nextInt();
		System.out.print("���� �Է� : ");
		int al = scan.nextInt();
		
		int a = re+al; //�հ�
		double b; //����
		if(a>=5000000) {
			b=a*0.03;
		}
		else if(a>=3000000) {
			b=a*0.02;
		}
		else {
			b=a*0.01;
		}
		double c = a - b; //����
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("*** "+na+" "+po+" ���� ***");
		System.out.println("�⺻�� : "+df.format(re)+"��");
		System.out.println("���� : "+df.format(al)+"��");
		System.out.println("�հ� : "+df.format(a)+"��");
		System.out.println("���� : "+df.format(b)+"��");
		System.out.println("���� : "+df.format(c)+"��");
		
		/*
		12345
		#,###.## = 12,345
		#,##0.00 = 12,345.00
		*/
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
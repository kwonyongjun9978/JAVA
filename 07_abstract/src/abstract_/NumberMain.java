package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
//		NumberFormat nf = new NumberFormat(); //error : �߻�Ŭ������ ������ �ȵ�
//		sub class �̿�
		NumberFormat nf = new DecimalFormat();//Sub Class �̿��Ͽ� ����
//		3�ڸ����� , �� ��� �Ҽ����� 3°�ڸ����� ���
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##��");//Sub Class �̿��Ͽ� ����
//		��ȿ���ڰ� �ƴѰ��� ǥ������ �ʴ´�
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00��");//Sub Class �̿��Ͽ� ����
//		0�� ������ ǥ��
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//�޼ҵ� �̿��Ͽ� ����
		NumberFormat nf4 = NumberFormat.getInstance();
//		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.KOREAN);
//		nf4.setMaximumFractionDigits(2);//�Ҽ����� 2°�ڸ�
//		nf4.setMinimumFractionDigits(2);
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);
//		nf5.setMaximumFractionDigits(2);//�Ҽ����� 2°�ڸ�
//		nf5.setMinimumFractionDigits(2);
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
	}
	
	//getInstance() : �Ҽ����� 3°�ڸ����� ���, �Ҽ����� �ڸ����� ������ ���X
	//getCurrencyInstance() : �Ҽ����� ������ 2°�ڸ����� ���
	//setMaximumFractionDigits(2) : �Ҽ����� �ִ� 2°¥������ ���
	//setMinimumFractionDigits(2) : �Ҽ����� �ּ� 2°¥������ ���
}

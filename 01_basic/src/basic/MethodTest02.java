package basic;

import java.util.Arrays;
import java.util.Random;

public class MethodTest02 {

	public static void main(String[] args) {
		//���� : ��ǻ�Ͱ� �ұ�Ģ������ �߻��ϴ� ��(0<=����<1)
		//Ŭ����(Math)�� �ٷ� ������� �޼ҵ�(random)�� ������ static(�������ڸ��� �޸𸮿� ������)���� ���� �Ǿ��ִ�.
		//static�޼ҵ忡���� static������ ��� ����
		double a = Math.random(); //Ŭ������.�޼ҵ��(��1, ��2,...) �� �޼ҵ尡 static �� ���
		System.out.println("��������? "+a);
		
		//java.util��Ű���� import ������� �Ѵ�.
		//java.util��Ű������ RandomŬ�������� nextDouble�̶�� �޼ҵ带 ȣ���Ѵ�
		//�޼ҵ��� ������ static�� �ƴϱ� ������ Ŭ����(Random)�� ����(Ŭ������ �ݵ�� new)������Ѵ�.(�ν��Ͻ�ȭ)
		Random r = new Random();
		double b = r.nextDouble(); //��ü��.�޼ҵ��(��1, ��2,...)
		System.out.println("��������? "+b);
		
		//�迭
		int[] ar = new int[5]; 
		ar[0] = 25;
		ar[1] = 13;
		ar[2] = 45;
		ar[3] = 30;
		ar[4] = 15;
		System.out.println(ar[0]+","+ar[1]+","+ar[2]+","+ar[3]+","+ar[4]);
		
		//Sort(����)
		//��������
		//sort �޼ҵ��� ������ ������ �迭�� ���� ��ȯ���� ����(static void)
		Arrays.sort(ar);
		System.out.println(ar[0]+","+ar[1]+","+ar[2]+","+ar[3]+","+ar[4]);
		
	}

}
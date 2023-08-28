package array_04;

public class MultiArray03 {

	public static void main(String[] args) {
		String[] name = {"ȫ�浿", "���ε�", "�Ҹ���"};
		int[][] jumsu = {{90,95,100}, {100,89,75}, {75,80,48}};
		int[] sum = new int[3];
		double[] avg = new double[3];
		char[] grade = new char[3];
		
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu[i].length; j++) {
				sum[i] += jumsu[i][j]; //����
			}
			avg[i] = (double)sum[i]/3; //���
			
			if(avg[i]>=90) grade[i] = 'A';
			else if(avg[i]>=80) grade[i] = 'B';
			else if(avg[i]>=70) grade[i] = 'C';
			else if(avg[i]>=60) grade[i] = 'D';
			else grade[i] = 'F';		
		}
		
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println(sum[i]+"\t"+String.format("%.2f", avg[i])+"\t"+grade[i]);
		}

	}

}
/*
[����]���� ó��
-����, ���, ������ ���Ͻÿ�
-����� �Ҽ����� 2°�ڸ����� ���

���� = ���� + ���� + ����
��� = ����/�����
������ ����� 90 �̻��̸� 'A'
	����� 80 �̻��̸� 'B'
	����� 70 �̻��̸� 'C'
	����� 60 �̻��̸� 'D'
	�׿ܴ� 'F'
	
[������]	
------------------------------------------------
�̸�    ����    ����   ����    ����    ���    ����
------------------------------------------------
ȫ�浿   90    95    100
���ε�   100   89    75
�Ҹ���   75    80    48
------------------------------------------------
*/
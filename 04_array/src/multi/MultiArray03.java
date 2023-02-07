package multi;

public class MultiArray03 {

	public static void main(String[] args) {
		String[] name = {"ȫ�浿", "���ε�", "�Ҹ���"};
		int[][] jumsu = {{91,95,100,0},{100,88,75,0},{75,80,48,0}};
		double[] avg = new double[3];
		char[] grade = new char[3];
		
		//����, ���, ����
		
		//�������		
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu[i].length-1; j++) {
				jumsu[i][3] +=jumsu[i][j]; //����
			}//for j
			avg[i] = (double)jumsu[i][3]/3; //���
			
			if(avg[i]>=90) grade[i] = 'A';
			else if(avg[i]>=80) grade[i] = 'B';
			else if(avg[i]>=70) grade[i] = 'C';
			else if(avg[i]>=60) grade[i] = 'D';
			else grade[i] = 'F';
		}//for i
		
		//���
		for(int x=0; x<jumsu.length; x++) {
			System.out.print(name[x]+"\t");
			for(int y=0; y<jumsu[x].length; y++) {
				System.out.print(jumsu[x][y]+"\t");
			}
			System.out.println(String.format("%.2f", avg[x])+"\t"+grade[x]);
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
	����� 70 �̻��̸� 'D'
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

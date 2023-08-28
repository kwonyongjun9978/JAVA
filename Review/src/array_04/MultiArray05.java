package array_04;

import java.util.Scanner;

public class MultiArray05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name; //�̸�
		int[] subjectCnt; //�����
		String[][] subject; //�����
		int[][] jumsu; //����
		double[] avg; //���
		
		System.out.print("�ο��� : ");
		int cnt = sc.nextInt();
		
		name = new String[cnt];
		subjectCnt = new int[cnt];
		subject = new String[cnt][];
		jumsu = new int[cnt][];
		avg = new double[cnt];
		
		for(int i=0; i<cnt; i++) {
			System.out.print("�̸� �Է� : ");
			name[i] = sc.next();
			
			System.out.print("���� �� �Է� : ");
			subjectCnt[i] = sc.nextInt();
			subject[i] = new String[subjectCnt[i]];
			jumsu[i] = new int[subjectCnt[i]+1];
			
			for(int j=0; j<subjectCnt[i]; j++) {
				System.out.print("����� �Է� : ");
				subject[i][j] = sc.next();
			}
			
			for(int j=0; j<subjectCnt[i]; j++) {
				System.out.print(subject[i][j]+"���� �Է� : ");
				jumsu[i][j] = sc.nextInt();
				jumsu[i][subjectCnt[i]] += jumsu[i][j];
			}
			
			avg[i] = jumsu[i][subjectCnt[i]] / (double)subjectCnt[i];
			System.out.println();	
		}
		
		for(int i=0; i<cnt; i++) {
			System.out.print("�̸�\t");
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.print("����\t");
			System.out.println("���\t");
			
			System.out.print(name[i]+ "\t");
			
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			
			System.out.print(String.format("%5.2f", avg[i]));
			System.out.println("\n");
			
			
		}
	}

}
/*
�ο����� �Է��Ͽ� �ο�����ŭ �����͸� �Է¹ް� ������ ����� ���Ͻÿ�
����� �Ҽ����� 2°�ڸ����� ���

[������]
�ο��� : 2 (cnt)

�̸��Է� : ȫ�浿 (name)
����� �Է� : 2   (subjectCnt)
����� �Է� : ���� (subject)
����� �Է� : ����
���� ���� �Է� : 95 (jumsu)
���� ���� �Է� : 100
---------------------
�̸��Է� : �̱���
����� �Է� : 3
����� �Է� : ����
����� �Է� : ����
����� �Է� : ����
���� ���� �Է� : 95
���� ���� �Է� : 100
���� ���� �Է� : 90
---------------------

�̸�     ����     ����   ����     ���
ȫ�浿    95     100   xxx     xx.xx

�̸�      ����  ����   ����    ����      ���
�̱���   95   100   90    xxx      xx.xx
*/

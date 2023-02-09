package multi;

import java.util.Scanner;

public class MultiArray05_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο��� : ");
		int cnt = sc.nextInt();
		
		String[] name = new String[cnt];
		int subjectCnt;
		String subject[][]=new String[cnt][];
		int jumsu[][] = new int[cnt][];
		double[] avg = new double[cnt];
		
		for(int i=0; i<cnt; i++) {
			System.out.print("�̸� �Է� : ");
			name[i] = sc.next();
			
			System.out.print("����� �Է� : ");
			subjectCnt = sc.nextInt();
			
			subject[i] = new String[subjectCnt];
			for(int j=0; j<subjectCnt; j++) {
				System.out.print("����� �Է� : ");
				subject[i][j]=sc.next();
				}
			jumsu[i] = new int[subjectCnt+1];
			for(int j=0; j<subjectCnt; j++) {
				System.out.print(subject[i][j]+"���� �Է� : ");
				jumsu[i][j]=sc.nextInt();
				
				//����
				jumsu[i][subjectCnt] = jumsu[i][j];
			}
			//���
			avg[i]=(double)jumsu[i][subjectCnt]/subjectCnt;	
			
			System.out.println("------------------------");
		}
		
		//���
		for(int i=0; i<cnt; i++) { //�ο���
			
			System.out.print("�̸�\t");
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.print("����\t���");
			
			//������
			System.out.print("\n"+name[i]+"\t");
			for(int j=0; j<jumsu[i].length; j++) { //����,����
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println(String.format("%.2f", avg[i])+"\n");
		}//for i
		
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
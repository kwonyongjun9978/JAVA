package array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {32,40,25,78,56};
		
		//���
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); //4�ڸ� ���
		}
		System.out.println();
		
		/*
		Sort(����)
		��������
		sort �޼ҵ��� ������ ������ �迭�� ���� ��ȯ���� ����(static void)
		Arrays.sort(ar);
		System.out.println(ar[0]+","+ar[1]+","+ar[2]+","+ar[3]+","+ar[4]);
		*/
		
		//sort�޼ҵ带 �������� ���������غ���!
		//��������(ASCENDING)
		int tmp;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					tmp=ar[i];
					ar[i]=ar[j];
					ar[j]=tmp;
					
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); 
		}
		
		//��������(DESCENDING)
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					tmp=ar[i];
					ar[i]=ar[j];
					ar[j]=tmp;
					
				}
			}
		}
		System.out.println();
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); 
		}
	}

}

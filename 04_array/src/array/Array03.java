package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		int[] ar;
		int sum=0;
		
		System.out.print("�迭 ũ�� �Է� : ");
		size = sc.nextInt();
		
		ar= new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.print("ar["+i+"] �Է� : ");
			ar[i] = sc.nextInt();
		}
		
		/*
		for(int i=0; i<=size-1; i++) {
			sum+=ar[i];
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("�� = "+sum);
		*/
		
		//�ִ밪���ϱ�.
		int max = ar[0]; //�迭�� ù��° �����͸� �ʱⰪ���� ���´�.
		for(int i=1; i<size; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		
		//�ּҰ����ϱ�
		int min = ar[0]; //�迭�� ù��° �����͸� �ʱⰪ���� ���´�.
		for(int i=1; i<size; i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		
		for(int data : ar) {
			sum+=data;
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("�� = "+sum);
		System.out.println("�ִ밪 = "+max);
		System.out.println("�ּҰ� = "+min);
	}

}
/*
[����] �迭�� ũ�⸦ �Է¹޾Ƽ� �迭�� �����Ѵ�.
�����͸� ����ϰ� ��, �ִ밪, �ּҰ��� ���Ͻÿ�.
[������]
�迭 ũ�� �Է� : 3
ar[0] �Է� : 25
ar[1] �Է� : 13
ar[2] �Է� : 57
25 13 57
�� = xxx
�ִ밪 = xx
�ּҰ� = xx
*/
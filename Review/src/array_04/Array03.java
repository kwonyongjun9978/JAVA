package array_04;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭 ũ�� �Է� : ");
		int size = sc.nextInt();
		
		int[] ar;
		ar = new int[size];
		int sum = 0;
		for(int i=0; i<size; i++) {
			System.out.print("ar["+i+"] �Է� : ");
			ar[i] = sc.nextInt();
		}
		
		//��
		for(int data : ar) {
			sum+=data;
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("�� = "+sum);
		
		//�ִ밪
		int max = ar[0];
		for(int i=0; i<size; i++) {
			if(max<ar[i]) {
				max = ar[i];
			}
		}
		System.out.println("�ִ밪 = "+max);
		
		//�ּҰ�
		int min = ar[0];
		for(int i=0; i<size; i++) {
			if(min>ar[i]) {
				min = ar[i];
			}
		}
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

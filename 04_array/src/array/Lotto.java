package array;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int money=sc.nextInt();
		for(int a=1; a<=(money/1000); a++) {
		int[] lotto= new int[6];
		//������ȣ ����
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			//�ߺ���ȣ ����
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
				
			}
			
		}
		//SelectionSort
		//�������� ����
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int tmp = lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;
				}
			}
		}
		for(int data : lotto) {
			System.out.print(String.format("%5d", data));
		}
		System.out.println();
		
		if(a%5 == 0)System.out.println();
		}

	}
}

/*
[����] �ζ� - �ڵ�
- ũ�Ⱑ 6���� �迭 ����
- 1 ~ 45 ������ ���� �߻�
- ���ڴ� ���������Ͽ� ���(Selection Sort)
- ��½� �ڸ����� 5�ڸ��� ����
- �ߺ� ���ڰ� ������ �ȵȴ�
- 1000���� 1���� ���´�
- 5�ٸ��� �ٹٲ�

[������]
���� �Է� : 7000
 2 4 19 39 43 44
 9 15 17 21 30 37 
 8 10 14 36 39 40 
 1 9 20 22 27 35 
 1 9 14 28 39 43 
 
 13 16 17 20 26 29 
 3 5 15 19 23 29 
 */

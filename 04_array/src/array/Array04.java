package array;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i;
		boolean[] ar;
		ar=new boolean[5]; //�ʱⰪ false
		
		while(true) {
			System.out.println("������ ���� ���α׷�");
			System.out.println("**************");
			System.out.println("  "+"1. ����");
			System.out.println("  "+"2. ����");
			System.out.println("  "+"3. ����Ʈ");
			System.out.println("  "+"4. ����");
			System.out.println("**************");
			System.out.print(" "+"�޴� : ");
			num = sc.nextInt();
			
			if(num == 3) {
				for(i=0; i<ar.length; i++) {
					System.out.println((i+1)+"��ġ : "+ar[i]);
				}
			}
			if(num == 4) break;
			
			if(num ==1) {
				
				System.out.println("��ġ �Է� : ");
				int position= sc.nextInt();
				if(ar[position-1]) {
					System.out.println(position+"��ġ�� �̹� �����Ǿ��ֽ��ϴ�");
				}
				else {
					ar[position-1] = true;
					System.out.println(position+"��ġ�� ����");
				}
				
			}
			
			if(num ==2) {
				
				System.out.println("��ġ �Է� : ");
				int position= sc.nextInt();
				if(ar[position-1]) {
					ar[position-1] = false;
					System.out.println(position+"��ġ���� �����Ǿ����ϴ�");
				}
				else {
					
					System.out.println(position+"��ġ�� �����Ǿ� �����ʽ��ϴ�");
				}
				
			}
				
			
		}
		System.out.println("���α׷��� �����մϴ�.");

	}

}
/*
[����] �������� ���α׷�
[������]
������ ���� ���α׷�
**************
   1. ����
   2. ����
   3. ����Ʈ
   4. ����
**************
  �޴� : 
  
1���� ���
��ġ �Է� : 3
3��ġ�� ���� / �̹� �����Ǿ��ֽ��ϴ�
2���� ���
��ġ �Է� : 4
4��ġ�� ���� / �����Ǿ� �����ʽ��ϴ�
3���� ���
1��ġ : true
2��ġ : false
3��ġ : true
4��ġ : false
5��ġ : false  
*/
package class__;

import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��Է� : ");
		String st = sc.next();
		System.out.print("���� ���ڿ� �Է� : ");
		String st_now = sc.next();
		st_now = st_now.toLowerCase();
		System.out.print("�ٲ� ���ڿ� �Է� : ");
		String st_ch = sc.next();
		
		st = st.toLowerCase();
		st_now = st_now.toLowerCase();
		
		
		int count =0;
		int index2=0;
		int result=0;
			
		while(true) {
			
//		.indexOf( "ã�� Ư�� ����" , "������ ��ġ" ) //��ó���� ���� "ã�� Ư�� ����"�� �˷��ش�
			
		index2 = st.indexOf(st_now,result);
		result = index2;
//		System.out.println(result);
		
		if(index2==-1) {break;}
		count++;
		
		if(result == index2) {result++;}
	
		}//while
	
		if(st.length()<st_now.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
			System.out.println("ġȯ �� �� �����ϴ�.");
//			return; //�Լ��� �����
			System.exit(0); //���α׷� ���� ����
		}
		else{
		System.out.println(st.replace(st_now, st_ch));
		System.out.println(count+"�� ġȯ");
		}
		

	}

}
/*
ġȯ�ϴ� ���α׷��� �ۼ��Ͻÿ� - indexOf(?, ?), replace()
String Ŭ������ �޼ҵ带 �̿��Ͻÿ�
��ҹ��� ������� ������ ����Ͻÿ�

[������]
���ڿ� �Է� : aabba
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddbba
1�� ġȯ

���ڿ� �Է� : aAbbA
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddbba
1�� ġȯ

���ڿ� �Է� : aabbaa
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddbbdd
2�� ġȯ

���ڿ� �Է� : AAccaabbaaaaatt
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddccddbbddddatt
4�� ġȯ

���ڿ� �Է� : aabb
���� ���ڿ� �Է� : aaaaa
�ٲ� ���ڿ� �Է� : ddddd
�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�
ġȯ �� �� �����ϴ�
*/
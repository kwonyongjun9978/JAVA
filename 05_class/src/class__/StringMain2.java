package class__;

import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��Է� : ");
		String st1 = sc.next();
		st1 = st1.toLowerCase();
		System.out.print("���� ���ڿ� �Է� : ");
		String st2 = sc.next();
		System.out.print("�ٲ� ���ڿ� �Է� : ");
		String change = sc.next();
		
		int count =0;
		int index2=0;
		int result=0;
		int i=0;
			
		while(true) {
		index2 = st1.indexOf(st2,result);
		result = index2;
//		System.out.println(index2);
		
		
		if(index2==-1) {break;}
		count++;
		
		if(result ==index2) {result++;}
	
		}
	
		if(st1.length()<st2.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
			System.out.println("ġȯ �� �� �����ϴ�.");
		}
		
		else{
		st1.replace(st2, st1);
		System.out.println(st1.replace(st2, change));
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
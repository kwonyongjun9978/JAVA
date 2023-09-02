package class_05;

import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String original = sc.next();
		
		System.out.print("���� ���ڿ� �Է� : ");
		String current = sc.next();
		
		System.out.print("�ٲ� ���ڿ� �Է� : ");
		String after = sc.next();
		
		if(original.length() < current.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
			System.out.println("ġȯ �� �� �����ϴ�");
			//return; //�Լ��� �����
			System.exit(0); //���α׷� ���� ����
		}
		
		original = original.toLowerCase();
		current = current.toLowerCase();
		
		int index = 0;
		int count = 0;
		//indexOf("ã�� Ư�� ����", "������ ��ġ")
		while((index = original.indexOf(current, index))!= -1) {
			System.out.println(index);
			count++;
			index = index + current.length();
		}
		
		System.out.println(original.replace(current, after));
		System.out.println(count + "�� ġȯ");
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

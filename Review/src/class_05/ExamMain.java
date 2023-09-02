package class_05;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο��� �Է� : ");
		int cnt = sc.nextInt();
		
		Exam[] ar = new Exam[cnt];
		for(int i=0; i<cnt; i++) {
			ar[i] = new Exam();
			ar[i].compare();
		}
		
		System.out.println("�̸�\t1 2 3 4 5\t����");
		for(Exam e : ar) {
			System.out.print(e.getName()+"\t");
			for(int i=0; i<e.getOx().length; i++) {
				System.out.print(e.getOx()[i]+" ");
			}
		System.out.println("\t"+e.getScore());
		}

	}

}
/*
[����] ����������
- �� 5������ ���� �Է¹޴´�
- ������ "11111" �̴�
- ������ 'O', Ʋ���� 'X'
- 1������ ������ 20���� ó��

Ŭ������ : Exam
* �ʵ�
private String name = null;
private String dap = null;
private char[] ox = null;
private int score = 0;
private final String JUNG = "11111"; //���ȭ

* �޼ҵ�
������ - Scanner �� �̿��Ͽ� �̸��� ���� �Է¹޴´�. 
compare() - ��
getName()
getOx()
getScore()

Ŭ������ : ExamMain

[������]
�ο��� �Է� : 2

�̸� �Է� : ȫ�浿
�� �Է� : 12311  

�̸� �Է� : �ڳ�
�� �Է� : 24331

�̸�      1 2 3 4 5   ����
ȫ�浿     O X X O O   60
�ڳ�     X X X X O   20
*/

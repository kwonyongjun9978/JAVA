package class__;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     System.out.print("�ο��� �Է�: ");
	     int num = scan.nextInt();
//	         scan.nextLine();
	      // Ŭ���� �� �� �� �迭����(��ü�迭)
	      Exam[] exams = new Exam[num];
	        
	        for (int i = 0 ; i < num; i++){
	            System.out.print("�̸� �Է� : ");
	            String name = scan.next();
	            System.out.print("�� �Է� : ");
	            String dap = scan.next();
	            // for ������ �迭���� new �־���
	            char[] ox = {'X','X','X','X','X'};
	            exams[i] = new Exam(name,dap,ox,0);
	        }

	        System.out.println("�̸�\t12345\t����");
	        for (int i =0 ; i <num; i ++){
	            exams[i].compare();
	            
	            // char[] ���� string ����ȯ
	            String ar = new String((exams[i].getOX()));

	            System.out.print(exams[i].getName()+"\t"+ar+"\t"+exams[i].getScore());
	            System.out.println();
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

package class__;

import java.util.Scanner;

public class ExamMain_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     System.out.print("�ο��� �Է�: ");
	     int cnt = scan.nextInt();
	     
//	     Exam_Test aa = new Exam_Test();
//	     aa.compare();
//
//	     System.out.println("�̸�\t 1 2 3 4 5 \t ����");
//	     System.out.print(aa.getName()+"\t");
//	     for(int i=0; i<aa.getOX().length; i++) {
//	    	 System.out.print(aa.getOX()[i]+" ");
//	     }
//	     System.out.println(aa.getScore());
	     
	     
//	     ��ü�迭
	     Exam_Test[] ar = new Exam_Test[cnt]; //Exam_Test Ŭ������ ��������
	     for(int k = 0; k<cnt; k++) {
	    	 ar[k] = new Exam_Test();
	    	 ar[k].compare();
	     }
	     
	     //���
	     System.out.println("�̸�\t1 2 3 4 5 \t ����");
	     for(Exam_Test e : ar) { 
		     System.out.print(e.getName()+"\t");
		     for(int i=0; i<e.getOX().length; i++) {
	    	 System.out.print(e.getOX()[i]+" ");
		     }
		 System.out.println("\t"+e.getScore());
	     }

	}

}

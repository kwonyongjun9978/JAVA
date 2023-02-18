package class__;

import java.util.Scanner;


public class StringBufferMain {
	private int dan;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ϴ� ���� �Է� : ");
		dan = sc.nextInt();
	}
	
	public void output() {
		StringBuffer buffer = new StringBuffer(); 
//		StringBuffer buffer = " " // X
		
		//append() : �߰�, delete() : ����
		for(int i=1; i<10; i++) {
			//System.out.println(dan+"*"+i+"="+(dan*i));
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			System.out.println(buffer.toString()); //StringBuffer -> String ��ȯ
			
			//StringBuffer�� ���� ������� �ʰ� ������
			// 2*1=2 2*2=4 2*3=6 2*4=8 2*5=10 2*6=12 2*7=14 2*8=16 2*9=18 -> delete() �ʿ�
			buffer.delete(0,buffer.length());
		}
	}
	
	
	public static void main(String[] args) {
		StringBufferMain sbm = new StringBufferMain();
		sbm.input();
		sbm.output();

	}

}
/*
[����] ������

���ϴ� ���� �Է� : 5      input()
------------------------------------
5*1=5               output()
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
*/

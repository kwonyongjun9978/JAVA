package if_;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int a =scan.nextInt();
		
		if(a>=50) System.out.println(a + "�� 50���� ũ�ų� ����");
		System.out.println(a + "�� 50���� �۴�");
		System.out.println();
		
		if(true)
			if(true) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		if(false)
			if(true) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		if(true)
			if(false) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		if(a>='A' && a<='Z') //65~90
			System.out.println((char)a+"�� �빮��");
		else if(a>='a' && a<='z') //97~122
			System.out.println((char)a+"�� �ҹ���");
		else
			System.out.println((char)a+"�� �����̰ų� Ư������");

	}

}
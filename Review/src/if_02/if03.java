package if_02;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a�� �� : ");
		int a = sc.nextInt();
		System.out.print("b�� �� : ");
		int b = sc.nextInt();
		System.out.print("c�� �� : ");
		int c = sc.nextInt();
		
		if(a<b && a<c) { //a�� ���� ���� ���
			if(b<c) {
				System.out.println(a+" "+b+" "+c);
			}else {
				System.out.println(a+" "+c+" "+b);
			}
		}else if(b<a && b<c){ //b�� ���� ���� ���
			if(a<c) {
				System.out.println(b+" "+a+" "+c);
			}else {
				System.out.println(b+" "+c+" "+a);
			}
		}else { //c�� ���� ���� ���
			if(a<b){
				System.out.println(c+" "+a+" "+b);
			}else {
				System.out.println(c+" "+b+" "+a);
			}
		}
	}
}
/*
[����] 3���� ����(a,b,c)�� �Է¹޾Ƽ� ������� ����Ͻÿ� (if�� ����Ͻÿ�)
[������]
a�� �� : 98
b�� �� : 90
c�� �� : 85
85 90 98
---------------------
a�� �� : 75
b�� �� : 25
c�� �� : 36
25 36 75 
*/
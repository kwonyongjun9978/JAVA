package switch_;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.print("a�� �� : ");
		int a = sc.nextInt();
		System.err.print("b�� �� : ");
		int b = sc.nextInt();
		System.err.print("������(+,-,*,/)�� �Է� : ");
		String op = sc.next();
		
		switch(op) {
		case "+" : System.out.println(a+" +" +b+" = "+(a+b)); break; 
		case "-" : System.out.println(a+" - "+b+" = "+(a-b)); break; 
		case "*" : System.out.println(a+" * "+b+" = "+(a*b)); break; 
		case "/" : System.out.println(a+" / "+b+" = "+((double)a/b));; break; 
		}
		
	}

}
/*
[����] 2���� ������ ���ڿ� ������(+,-,*,/)�� �Է��Ͽ� ����Ͻÿ�
[������]
a�� �� : 25
b�� �� : 36
������(+,-,*,/)�� �Է� : +
25 + 36 = xx
--------------------------------
a�� �� : 25
b�� �� : 36
������(+,-,*,/)�� �Է� : /
25 / 36 = 0.6944444444444444
--------------------------------
a�� �� : 25
b�� �� : 36
������(+,-,*,/)�� �Է� : #
������ error
*/
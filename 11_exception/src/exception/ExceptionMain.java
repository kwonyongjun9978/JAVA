package exception;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		if(args.length>=2) {
			System.out.println(args[0]);
			System.out.println(args[1]);
		}
		System.out.println();
		
		try {
			int num1 = Integer.parseInt(args[0]);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("���� �Է� : ");
			int num2 = sc.nextInt();
			
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		} catch(NumberFormatException e) {
			System.out.println("�ݵ�� ���� �������� �Է��ϼ���");
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
			e.printStackTrace();
		} finally {
			System.out.println("error�� �ְ� ���� ������ ����!!");
		}
	}

}

package exception_11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("������ ������ ���ڸ� �Է��ϼ��� : ");
            int num = s.nextInt(); // ����ڷκ��� ������ �Է� ����
            if (num < 0) {
                // ���� ����ڰ� ���� �ȵ�� ������ �Է��ϸ� ������ ���� �߻� ���ѹ�����!!
                throw new ArithmeticException("�� ��������� ���� �Ͻô� ����? �Ѥ�"); // ArithmeticException ���� Ŭ���� ��ü�� ������ catch������ �Ѱܹ����ٰ� �����ϸ� �ȴ�
            }
            System.out.println("������ �Է����� �����̱���. �����մϴ�");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("���α׷��� �����մϴ�");
        }

	}

}

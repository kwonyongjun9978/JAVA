package basic;

public class MethodTest01 {

	public static void main(String[] args) {
		//25, 36�� ū���� ���Ͻÿ�
		//�ڹ��� �⺻(default, �ڹٵ� �˰� �ִ�) ��Ű�� => java.lang
		int big = Math.max(25, 36); //java.lang��Ű������ MathŬ�������� max��� �޼ҵ带 ȣ���Ѵ�
		System.out.println("�ִ밪��? "+big);
		
		//25.8, 78.6�� �������� ���Ͻÿ�
		double small = Math.min(25.8,78.6);
		System.out.println("�ּҰ���? "+small);
		
		//250�� 2������ ����Ͻÿ�
		String binary = Integer.toBinaryString(250);
		System.out.println("2���� = "+binary);
		
		//250�� 8������ ����Ͻÿ�
		String oct = Integer.toOctalString(250);
		System.out.println("8���� = "+oct);
		
		//250�� 16������ ����Ͻÿ�
		String hexa = Integer.toHexString(250);
		System.out.println("16���� = "+hexa);
	}

}
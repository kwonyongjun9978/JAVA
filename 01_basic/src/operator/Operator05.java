package operator;

public class Operator05 {

	public static void main(String[] args) {
		boolean a = 25>36;
		System.out.println("a = "+a);
		System.out.println("!a = "+!a);
		System.out.println();
		
		String b ="apple"; //literal ����
		System.out.println(b);
		String c =new String("apple"); //�ν��Ͻ�ȭ
		System.out.println(c);
		
		String result = b==c ? "����" : "�ٸ���";//�޸��� �ּ� ��
		System.out.println("b == c : "+ result);
		System.out.println("b != c : "+ (b!=c ? "��" : "����"));
		String result2 = b.equals(c)? "����" : "�ٸ���"; //���ڿ� ��
		System.out.println("b.equals(c) : "+result2);
		System.out.println("!b.equals(c) : "+(!b.equals(c)? "��" : "����"));
	}
}
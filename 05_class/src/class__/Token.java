package class__;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str="�п�,��,,���ӹ�";
		
		StringTokenizer st = new StringTokenizer(str, ","); //����ִ� ���� �������� �ʴ´�
		System.out.println("��ū ���� = "+st.countTokens());
		
		while(st.hasMoreTokens()) { //��ū �ִ�?(true) ����?(false)
			System.out.println(st.nextToken()); //��ū�� ������ ���� ��ū���� �̵�
		} //while
		System.out.println("--------------------------");
		
		String[] ar = str.split(","); //����ִ� ���� �����´� 
		
		for(String data : ar) {
			System.out.println(data);
		}
	}

}

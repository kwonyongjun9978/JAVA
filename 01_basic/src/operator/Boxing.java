package operator;

public class Boxing {

	public static void main(String[] args) {
		int a =25;
		double b = (double)a /3; //Casting, ��������ȯ / �ڵ�����ȯ 
		System.out.println(b); 
		
		String c = "25";
		//int d =(int)c; //d:�⺻��,c:��ü�� / (�⺻��)��ü�� /error
		int d = Integer.parseInt(c);
		System.out.println(d);
		
		int e=5;
		//��ü��    �⺻�� 
		Integer f=e; //JDK 5.0, AutoBoxing(�⺻�� -> ��ü��)
		//Integer f = new Integer(e); //JDK 5.0����,deprecate
		System.out.println(f);
		
		Integer g =5;
		int h=g; //JDK 5.0, unAutoBoxing(��ü�� -> �⺻��)
		//int h = g.intValue(); //JDK 5.0����
		System.out.println(h);
	
		/*
		��ü��
		�⺻�� -----> ��ü��(Ŭ����ȭ, Wrapper Class (�����Ŵ))
		int           Integer
		double        Double
		 */
	}
}
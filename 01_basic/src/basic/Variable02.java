package basic;

class Test{
	int a =10;
	static int b = 20;
	static String str;
}
//Variable02.java���� 1���� �������ϸ� class������ 2�� �����(Test.class,Variable02.class)

public class Variable02 {
	int a; //��������(�ʵ�, 0������ �ʱ�ȭ�� �Ǿ��ִ�, ���� : class)
	double b; 
	static int c; //�������ڸ��� �޸𸮿� ������, �ν��Ͻ�ȭ �ʿ����
	
	public static void main(String[] args) {
		//int a; //��������(local variable, ���� : �޼ҵ�({}), ���� garbage���� ����ִ�(�ʱ�ȭ�� �ȵǾ�������))
		int a = 5; //�ʱⰪ 5�� �Ҵ��Ѵ�(�ʱ�ȭ��Ų��)
		System.out.println("�������� a = "+a);
		
		Variable02 v = new Variable02(); //�޸� �Ҵ�(����),��ü��
		System.out.println("��ü = "+v); //�ּ�(Ŭ����@16����)
		System.out.println("�ʵ� a = "+v.a); //intŸ���� �ʱ�ȭ �� : 0
		System.out.println("�ʵ� b = "+v.b); //doubleŸ���� �ʱ�ȭ �� : 0.0
		
		System.out.println("static �ʵ� c = "+Variable02.c);
		System.out.println("static �ʵ� c = "+c); //�ڽ��� Ŭ���� �����̴ϱ� ��������
		
		
		//TestŬ������ ���� ����Ͻÿ�
		Test t = new Test();
		System.out.println("TestŬ������ �ʵ� a = "+t.a);
		System.out.println("TestŬ������ static �ʵ� b = "+Test.b);
		System.out.println("TestŬ������ static �ʵ� str = "+Test.str); //String Ÿ���� �ʱ�ȭ�� : null
	}

}
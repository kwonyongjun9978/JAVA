package class__;

class StaticTest{
	/*
	 �� static - Ŭ��������
	 1. �޸� static ������ 1���� �����ȴ�. �� �ʱ�ȭ 1���� ����
		�ڡڡڸ�� ��ü�� �����Ѵ�.(��������)�ڡڡ�
     2. static�޼ҵ忡���� static������ ��� ����
		static�޼ҵ忡���� this�� ������ �� ����
	 3. static������ �޼ҵ�� ȣ��� Ŭ���������� ���� ȣ�� �� �� �ִ�.
		��ü�ε� ȣ���� �����ϴ�
     4. static{ } - �ʱ�ȭ ����
        		  - �����ں��ٵ� ���� �����Ѵ�.
	 */
	private int a; //�ʵ�, �ν��Ͻ� ����(��ü ���� �Ŀ��� ����� ����, ��ü�� �Ҹ�Ǹ� �ν��Ͻ� ������ ��������.)
	private static int b; //�ʵ�, Ŭ���� ����
	
	static { //static block : Ŭ������ �޸𸮿� �ε�� �� �� ���� ����Ǵ� ������� �����̴�, �Ϲ������� ���� �������� �ʱ�ȭ�ϴ� �뵵�� ���� ���ȴ�.
		System.out.println("�ʱ�ȭ ����");
		StaticTest.b=5;
	}
	
	public StaticTest() {
		System.out.println("�⺻ ������");
		this.a=5;
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a = "+this.a+" b = "+this.b);
	}                                          //StaticTest.b
	
	public static void output() {
		System.out.println("static method...");
		//System.out.println("a = "+a+" b = "+b); //error(static�޼ҵ�ȿ����� static ������ ��� ����)
	}
	
}

public class StaticMain {	
	public static void main(String[] args) {
		StaticTest aa = new StaticTest();
		aa.calc();
		aa.disp();
		System.out.println();
		
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp();
		System.out.println();
		
		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp();
		System.out.println();
		
		StaticTest.output(); //Ŭ������.�޼ҵ�()
		aa.output(); //��ü.�޼ҵ�()
	}

}

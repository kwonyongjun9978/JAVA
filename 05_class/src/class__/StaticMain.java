package class__;

class StaticTest{
	private int a; //�ʵ�, �ν��Ͻ� ����
	private static int b; //�ʵ�, Ŭ���� ����
	
	static {
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
		System.out.println("a = "+this.a+" b = "+StaticTest.b);
	}
	
	public static void output() {
		System.out.println("static method...");
		//System.err.println("a = "+a+" b = "+b); //error(static�޼ҵ�ȿ����� static ������ ��� ����)
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

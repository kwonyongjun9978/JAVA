package class_;

class This{
	private int b; //�ʵ�
	private static int c;
	
	public void setB(int b) { //�μ�(argument), �Ű�����(parameter) / void : ��ȯ��(return)�� ����
		System.out.println("this = "+this);
		 this.b = b; //this.b = class �ʵ� ���� 
	}
	public int getB() {
		return this.b; //this�� ��������
	}
	
	public void setC(int c) { //�μ�(argument), �Ű�����(parameter) / void : ��ȯ��(return)�� ����
		 this.c = c; //
	}
	public int getC() {
		return this.c; //this�� ��������
	}
	
}

public class ThisMain {

	private int a; //�ʵ�, private
	
	public static void main(String[] args) {
		ThisMain tm = new ThisMain();
		tm.a=10;
		System.out.println("a = "+tm.a+"\n");
		
		//b�� 20�� �־ ����Ͻÿ�
		This t = new This();
		System.out.println("��ü t = "+t);
		t.setB(20); //ȣ�� - ȣ���� �޼ҵ�� �ݵ�� ���ƿ´�.
		System.out.println("b = "+t.getB());
		
		//c�� 30�� �־ ����Ͻÿ�
		t.setC(30);
		System.out.println("c = "+t.getC()+"\n");
		
		This w = new This();
		System.out.println("��ü w = "+w);
		w.setB(40);
		w.setC(50);
		System.out.println("b = "+w.getB());
		System.out.println("c = "+w.getC());
	}

}
//��� Ŭ������ �ݵ�� �����ؾ� �Ѵ�.
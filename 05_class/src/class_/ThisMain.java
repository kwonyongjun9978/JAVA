package class_;

class This{
	//�ʵ�
	private int b; 
	private static int c;
	
	//�޼ҵ�(setters,getters)
	//setters�޼ҵ忡�� void ��� -> ��ȯ��(return)�� ����
	public void setB(int b) { //int b : �Ű�����(parameter) 
		System.out.println("this = "+this);
		 this.b = b; //this.b = class �ʵ� ���� 
	}
	
	public int getB() {
		return this.b; //this�� ��������
	}
	
	public void setC(int c) { 
		 this.c = c;
	}
	
	public int getC() {
		return this.c; //this�� ��������
	}
	
}

public class ThisMain {

	private int a; //�ʵ�
	
	public static void main(String[] args) {
		ThisMain tm = new ThisMain();
		tm.a=10;
		System.out.println("a = "+tm.a+"\n");
		
		//b�� 20�� �־ ����Ͻÿ�
		This t = new This();
		System.out.println("��ü t = "+t);
		t.setB(20); //20 : �μ�(argument) / ȣ�� - ȣ���� �޼ҵ�� �ݵ�� ���ƿ´�.
		System.out.println("b = "+t.getB());
		System.out.println();
		
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
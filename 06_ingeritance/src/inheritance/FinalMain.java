package inheritance;

//������� ����ü
enum Color{
	RED, GREEN, BLUE
}

class Final{
	public final String FRUIT = "���";
	
	//Ŭ������ �ʵ忡 �ʱⰪ �ο�(������ ���)
	public final String FRUIT2;
	public Final() {
		System.out.println("�⺻ ������");
		FRUIT2="����";
	}
	
	//static(�������ڸ��� �޸𸮿� �ڵ����� ������ �ȴ�->new X)
	public static final String ANIMAL = "�⸰";
	
	//static final �ʵ�� static �������� �ʱⰪ�� �־�� �Ѵ�
	//static�� ��� �����ڿ��� �ʱ�ȭ�� �ȵȴ�(�����ڴ� new�ؾ� �ϱ� ����)
	public static final String ANIMAL2;
	static {
		System.out.println("static �ʱ�ȭ ����");
		ANIMAL2="�ڳ���";
	}
	
//	public static final int RED=0;
//	public static final int GREEN=1;
//	public static final int BLUE=2;
	
	
	
}

public class FinalMain {

	public static void main(String[] args) {
		final int A =10;//���ȭ(final ������ �빮�ڷθ� ���)
		//A=20; -error(final�� ���� �����Ҽ� ����)
		System.out.println("A = "+A);
		
		//final ������ �ݵ�� �ʱⰪ�� �־�� �Ѵ�
		final int B;
		B=30;
		//B=40; -error
		System.out.println("B = "+B);
		
		Final f = new Final();
		System.out.println("FRUIT = "+f.FRUIT);
		
		System.out.println("FRUIT2 = "+f.FRUIT2);
		
		System.out.println("ANIMAL = "+Final.ANIMAL);
		
		System.out.println("ANIMAL2 = "+Final.ANIMAL2);
		System.out.println();
		
		System.out.println("���� = "+Color.RED);
		System.out.println("���� = "+Color.RED.ordinal());
		
		for(Color data : Color.values()) {
			System.out.println(data+"\t"+data.ordinal());
		}

	}

}
//final �޼ҵ�� Override�� �� �� ����(���� �޼ҵ�)
//final Ŭ������ �ڽ�Ŭ������ ���� �� ���� - ����� �ȵȴ�(���� Ŭ����)

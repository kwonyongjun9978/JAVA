package basic;

public class Variable01 {

	public static void main(String[] args) {
		//����(variable) : �Ѱ��� Ÿ���� ���� ������ �� �ִ� �޸� ����, ������ ����� ���({})�������� ��� ����.
		//������ : ù���ڴ� ������(�ҹ���)
		//DataType : ��� ������ type�� ������, Ÿ�Կ� ���� ������ �� �ִ� ���� ������ ������ �޶�����.
		//�⺻��
		//1.����(boolean, 1bit)
		boolean a;
		a = 25 > 36;
		System.out.println("a = " + a);
		
		//2.������
		//char(2byte, 16bit, 0~32767, '')  
		char b;
		b = 'A'; //65, 0100 0001
		System.out.println("b = " + b);
		
		char c;
		c = 65;
		System.out.println("c = " + c); 
		
		//3.������
		//byte(1byte, 8bit, -128 ~ +127) 
		byte d = 0;
		//d = 128; //error
		//d=127;
		System.out.println("d = " + d);
		
		//int(4byte, 32bit, -21�� ~ 21��, default) 
		int e; 
		e = 65; //0000 0000 0000 0000 0000 0000 0100 0001
		System.out.println("e = " + e);
		
		int f;
		f = 'A';
		System.out.println("f = " + f); 
		
		//long(8byte, 64bit)
		long g;
		g = 25L; //25L�� long�� ���
		System.out.println("g = " + g); 
		
		//4.�Ǽ���
		//float(4byte, 32bit)
		float h;
		//h = 43.8; //43.8�� double�� ���, error
		//h = (float)43.8; //��������ȯ
		h = 43.8F; //43.8F�� float�� ���	
		System.out.println("h = " + h);
		
		//double(8byte, 64bit, default)
		
		System.out.println(Byte.MAX_VALUE + "," + Byte.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + "," + Integer.MAX_VALUE); //MAX_VALUE : ���(��������)
		System.out.println(Long.MIN_VALUE + "," + Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE + "," + Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + "," + Double.MAX_VALUE);
	}

}

//long�� float Ÿ�� ������ �ڿ� l(L)�� f(F)�� ���̴� ������ �ش� ���� � ������ Ÿ���� ��Ÿ������ ��������� �����ϱ� ���� ���Դϴ�.
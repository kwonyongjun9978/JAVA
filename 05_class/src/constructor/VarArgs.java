package constructor;

public class VarArgs {
	public VarArgs() {
		System.out.println("�⺻ ������");
	}
	
//	int sum(int a, int b) {
//		return a+b;
//	}
//	int sum(int a, int b, int c) {
//		return a+b+c;
//	}
//	int sum(int a, int b, int c, int d) {
//		return a+b+c+d;
//	}
	public int sum(int...ar) {
		int hap=0;
		for(int i=0; i<ar.length; i++) {
			hap += ar[i];
		}
		return hap;
	}
	
	public static void main(String[] args) {
		VarArgs va = new VarArgs(); //�⺻ ������ ����
		
		System.out.println("�� = "+va.sum(10,20));
		System.out.println("�� = "+va.sum(10,20,30));
		System.out.println("�� = "+va.sum(10,20,30,40));

	}

}

/*
...ar�� �ڹٿ��� "varargs" �Ǵ� "variable-length argument"�� ��Ÿ���� Ư���� �����Դϴ�. 
�̸� ���� �޼��忡 ���� ������ ���ڸ� ������ �� �ֽ��ϴ�. 
�޼��� ���ǿ��� �Ķ���� Ÿ�� �ڿ� ...�� ����Ͽ� ǥ���ϸ�, �̸� ���� �޼��� ȣ�� �� ���޵Ǵ� ������ ������ ���������� ó���� �� �ֽ��ϴ�.
*/

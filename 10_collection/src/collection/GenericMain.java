package collection;

class GenericTest<T>{
	//������ Ÿ���� �����Ҷ� ����
	private T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	
	
}
public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();
		aa.setA("ȫ�浿");
		System.out.println("�̸� = "+aa.getA());

		//aa.setA(25); //error : StringŸ������ ��������� ������ intŸ���� ���Ұ�
		
		GenericTest<Integer> bb = new GenericTest<Integer>();
		bb.setA(25);
		System.out.println("���� = "+bb.getA());

	}
}

package inheritance;

class Test extends Object {
	
}

class Sample extends Object{
	@Override
	public String toString() {
		return getClass()+"@����";
	}
}

class Exam extends Object{
	private String name = "�ǿ���";
	private int age = 25;
	
	@Override
	public String toString() {
//		return super.toString();
		return name + "\t" + age;
	}
}

public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("��ü t = "+t);//Ŭ������@16����
		System.out.println("��ü t = "+t.toString());
		System.out.println("��ü t = "+t.hashCode()); //hashCode() : �ּ��� ���� 10������ ����
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("��ü s = "+s.toString());
		System.out.println();
		
		Exam e = new Exam();
		System.out.println("��ü e = "+e.toString());
		System.out.println();
		
		String aa = "apple";
		System.out.println("��ü aa = "+aa);
		System.out.println("��ü aa = "+aa.toString()); // toString�� �ᵵ ���ڿ��� ���(�ּ�X)
		System.out.println("��ü t = "+aa.hashCode());
		System.out.println();
		
		String bb = new String("apple");
		String cc = new String("apple");
		System.out.println("bb==cc : "+(bb==cc)); //�ּ� ��
		System.out.println("bb.equals(cc) : "+bb.equals(cc)); //���ڿ� ��
		System.out.println();
		
		Object dd = new Object();
		Object ee = new Object();
		System.out.println("dd==ee : "+(dd==ee)); //�ּ� ��
		System.out.println("dd.equals(ee) : "+dd.equals(ee)); //�ּ� ��
		System.out.println();
		
		Object ff = new String(); //�θ�Ŭ������ �ڽ�Ŭ������ ����(�θ� = �ڽ�)
		Object gg = new String();
		System.out.println("ff==gg : "+(ff==gg)); //�ּ� ��
		System.out.println("ff.equals(gg) : "+ff.equals(gg)); //���ڿ� ��
		System.out.println();
		
	}

}
/*
class Object {
   public String toString() {}      	Ŭ������@16����
   public int hashCode() {}      		10����
   public boolean equals(Object ob){}   ������ ��
}

class String extends Object
   public String toString() {}      		���ڿ�
   public int hashCode() {}      			10���� (������ �ȵȴ�) - ǥ���� �� �ִ� ���ڿ��� ���Ѵ��̱� ������ 10�����δ� �� ǥ���� �� ����.
   public boolean equals(Object ob){}   	���ڿ� ��
}
*/

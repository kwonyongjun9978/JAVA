package nested;

public class Outer {
	private String name;
	
	public void output() {
		Inner in = new Inner(); //���� Ŭ����(Inner)�� �ν��Ͻ� ����(age)�� ����ϱ� ���ؼ� ���� Ŭ����(Inner)��ü ����
								//Outer -> Inner ���� X, ��ü ���� �� ����
		System.out.println("�̸� = " + this.name + "\t���� = " + in.age);
	}
	
		class Inner{
			private int age;
			
			public void disp() {
				System.out.println("�̸� = " + Outer.this.name +"\t���� = " + this.age);
				//inner class���� outer class�� �ִ� private variable�� ���� ����
			}
			
		}
	
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "ȫ�浿";
		System.out.println("�̸� = " + ou.name);
		System.out.println();
		ou.output();
		System.out.println();
		
		//Inner in2 = new Inner(); // inner class�θ� ���� �� ����
		//outer class ���ο� inner class memory allocation
		//���� Ŭ����(Inner)�� ��ü�� �ܺ� Ŭ����(Outer)�� ��ü�� ���� �����Ǿ� �־�� ������ �� �ִ�.
		Outer.Inner in2 = ou.new Inner(); 
		in2.age = 20;
		in2.disp();
		System.out.println();
		
		Outer.Inner in3 = ou.new Inner();
		in3.age = 30;
		in3.disp();
		System.out.println();
		
		/*
		Outer Ŭ������ ���� Ŭ������ Inner Ŭ������ �ν��Ͻ��� �����ϴ� �ڵ�
		���� Ŭ������ �ܺ� Ŭ������ �ν��Ͻ��� ���� �����ǹǷ�, new Outer().new Inner() �������� Outer()�� ������ Outer Ŭ������ �ν��Ͻ��� ����Ͽ� Inner Ŭ������ �ν��Ͻ��� �����մϴ�. 
		�̷��� ������ Inner Ŭ������ �ν��Ͻ��� Outer Ŭ������ �ν��Ͻ��� ������ �ֽ��ϴ�. 
		�̷��� ���������� ����, Inner Ŭ������ Outer Ŭ������ ��� ���� �� �޼��忡 ������ �� �ֽ��ϴ�.
		 */
		Outer.Inner in4 = new Outer().new Inner();
		//in4.name = "�ڳ�"; //error (Ŭ���� �ȿ����� ���� ����)
		in4.age = 35;
		in4.disp();
		System.out.println();
		
	}

}
/*
���ʿ� �ִ� Ŭ������ �ٱ��� Ŭ������ ��� ����� ���� ����
������ �ٱ��� Ŭ������ ������ Ŭ������ ����� ���� �Ұ���
�� ������ Ŭ������ ��ü�� �����ϸ� ���� �����ϴ�.
*/

package nested;

public class Outer {
	private String name;
	
	public void output() {
		Inner in = new Inner();
		System.out.println("�̸� = " + this.name + "\t���� = " + in.age);
	}
	
		class Inner{
			private int age;
			
			public void disp() {
				System.err.println("�̸� = " + Outer.this.name +"\t���� = " + this.age);
			}
		}
	
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "ȫ�浿";
		System.out.println("�̸� = " + ou.name);
		System.out.println();
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 20;
		in2.disp();
		System.out.println();
		
		Outer.Inner in3 = ou.new Inner();
		in2.age = 30;
		in2.disp();
		System.out.println();
		
		Outer.Inner in4 = new Outer().new Inner();
		//in4.name = "�ڳ�"; //error (Ŭ���� �ȿ����� ���� ����)
		in4.age = 35;
		in4.disp();
		System.out.println();
	}

}

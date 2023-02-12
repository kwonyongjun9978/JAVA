package inheritance;

public class ChildMain extends Super {
	private String name;
	private int age;
	
	ChildMain(){
		System.out.println("ChildMain�� �⺻ ������");
	}
	ChildMain(String name, int age, double weight, double height){
		super(weight,height); //�θ� ������ ȣ��
		
		this.name = name;
		this.age = age;
//		super.weight = weight; //this.weight = weight;
//		super.height = height;
	}
	
	public void disp() {
		System.err.println("�̸� = "+name);
		System.err.println("���� = "+age);
		super.disp(); 
	}
	public static void main(String[] args) {
		ChildMain aa = new ChildMain("ȫ�浿", 25, 73.5, 182.6);
		aa.disp();
		System.out.println("-----------------");
		
		Super bb = new ChildMain("�ڳ�", 13, 53.5, 156.6);
		bb.disp(); //Override(�θ�Ŭ������ �ڽ�Ŭ������ ���� �޼ҵ� ����)
				   //��� �켱���� �ڽ�Ŭ������ ���´�.

	}

}

package inheritance;

public class ChildMain extends Super {
	private String name;
	private int age;
	
	ChildMain(){
		System.out.println("ChildMain�� �⺻ ������");
	}
	ChildMain(String name, int age, double weight, double height){
		super(weight,height); //�θ� ������ ȣ��, super() �� �������� ù�ٿ� ��� �Ѵ�
//		super.weight = weight; //this.weight = weight;
//		super.height = height;
		this.name = name;
		this.age = age;
	}
	
	public void disp() {
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age);
		super.disp(); 
	}
	
	public static void main(String[] args) {
		//Sub class�� ��ü�� �����ϸ� Super class�� �ڽ��� �����ڸ� ��� ȣ���Ѵ�.
		ChildMain aa = new ChildMain("ȫ�浿", 25, 73.5, 182.6);
		aa.disp();
		System.out.println("-----------------");
		
		Super bb = new ChildMain("�ڳ�", 13, 53.5, 156.6);
		bb.disp(); //Override(�θ�Ŭ������ �ڽ�Ŭ������ ���� �޼ҵ� ����)
				   //��� �켱���� �ڽ�Ŭ������ ���´�.

	}

}

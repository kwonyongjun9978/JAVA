package inheritance;

public class SubMain extends Super{
	private String name;
	private int age;
	
	SubMain(){
		System.out.println("SubMain�� �⺻ ������");
	}
	SubMain(String name, int age, double weight, double height){
		this.name = name;
		this.age = age;
		super.weight = weight; //this.weight = weight;
		super.height = height;
	}
	public void output() {
		System.err.println("�̸� = "+name);
		System.err.println("���� = "+age);
		super.disp(); //this.disp();
	}

	public static void main(String[] args) {
		SubMain aa = new SubMain("ȫ�浿", 25, 73.5, 182.6);
		aa.disp(); //�θ� �޼ҵ� ȣ��
		System.out.println("-----------------");
		aa.output();
		System.out.println("-----------------");
		
		Super bb = new SubMain("�ڳ�", 13, 53.5, 156.6);
//		bb.output(); //error(ħ������ bb�� SuperŬ������ �����ϱ� �����̴�)
		bb.disp();
	}

}

/*
�ڽ�Ŭ������ �޸� ������ �� 
1.�θ� Ŭ���� ���� / new �θ�() <- �⺻ ������
2.�ڽ� Ŭ���� ���� / new �ڽ�()
*/
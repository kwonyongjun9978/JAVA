package inheritance;

//��ӹ޴� Ŭ������ ������ִ� Ŭ������ �����ڿ� private�� ������ ��� ���� ��ӹ޴´�
public class SubMain extends Super{
	private String name;
	private int age;
	
	SubMain(){
		System.out.println("SubMain�� �⺻ ������");
	}
	
	SubMain(String name, int age, double weight, double height){
//		this();
		this.name = name;
		this.age = age;
		super.weight = weight; //this.weight = weight;
		super.height = height;
	}
	public void output() {
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age);
		super.disp(); //this.disp();
		/*
		super.disp() : �׻� �θ� Ŭ������ disp() �޼��带 ȣ���ϸ�, �θ� Ŭ������ ������ ����մϴ�.
		this.disp() : ���� Ŭ�������� �������̵��� ��쿡�� �ڽ� Ŭ������ disp() �޼��带 ȣ���ϰ�, �׷��� ������ �θ� Ŭ������ disp() �޼��带 ȣ���մϴ�.
		*/
	}

	public static void main(String[] args) {
		//Sub class�� ��ü�� �����ϸ� Super class�� �ڽ��� �����ڸ� ��� ȣ���Ѵ�.
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
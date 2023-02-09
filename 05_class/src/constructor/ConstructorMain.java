package constructor;

public class ConstructorMain {
	private String name;
	private int age;
	
	//������ Overload
	public ConstructorMain() {
		System.out.println("default ������");
	}
	public ConstructorMain(String name) {
		this();
		System.out.println("name ó�� ������");
		this.name = name;
	}
	public ConstructorMain(int age) {
		this("�ڳ�");//Overload�� �ٸ� �����ڸ� ȣ���� �� �ִ�
		System.out.println("age ó�� ������");
		this.age = age;
	}
	
	public static void main(String[] args) {
		ConstructorMain aa = new ConstructorMain();
		System.out.println(aa.name + "\t" + aa.age);
		System.out.println();
		
		ConstructorMain bb = new ConstructorMain("ȫ�浿");
		System.out.println(bb.name + "\t" + bb.age);
		System.out.println();
		
		ConstructorMain cc = new ConstructorMain(25);
		System.out.println(cc.name + "\t" + cc.age);
		System.out.println();
	}

}

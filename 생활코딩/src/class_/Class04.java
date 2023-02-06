package class_;
class Foo{
	public static String classVar="I class var";
	public String instanceVar="I instance var";
	public static void classMethod() {
		System.out.println(classVar); //ok
//		System.out.println(instanceVar); //error
	}
	public void instanceMethod() {
		System.out.println(classVar); //ok
		System.out.println(instanceVar); //ok
	}
	
}
public class Class04 {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //ok
//		System.out.println(Foo.instanceVar); //error
		Foo.classMethod();
//		Foo.instanceMethod(); //error
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); 
	    System.out.println(f1.instanceVar); 
    
	    f1.classVar = "changed by f1";
	    System.out.println(Foo.classVar); 
	    System.out.println(f1.classVar);
	    System.out.println(f2.classVar); 
      
        f1.instanceVar = "changed by f1";
	    System.out.println(f1.instanceVar); 
	    System.out.println(f2.instanceVar); // I instance var

//	    1. static�� �ִ� �� Ŭ���� �Ҽ�, static�� ���� �� �ν��Ͻ� �Ҽ�
//	    2. Ŭ������ ���ǵ� ������ �޼ҵ�� Ŭ������ ���ؼ� ���� ���������� �ν��Ͻ��� ���ǵ� ������ �޼ҵ�� �ش� Ŭ������ �ν��Ͻ��� �����ؾ߸� ������ �� �ִ�.
//	    3. �ν��Ͻ����� �ش� Ŭ������ ���ǵ� ������ �����ϸ� �� Ŭ������ ������ ��� �ν��Ͻ��� ������ ����������, �ν��Ͻ����� �ش� �ν��Ͻ��� ���ǵ� ������ �����ϸ� �ش� �ν��Ͻ��� ������ �����ȴ�.
	}

}
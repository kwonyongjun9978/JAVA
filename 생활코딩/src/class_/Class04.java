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

//	    1. static이 있는 건 클래스 소속, static이 없는 건 인스턴스 소속
//	    2. 클래스로 정의된 변수나 메소드는 클래스를 통해서 접근 가능하지만 인스턴스로 정의된 변수나 메소드는 해당 클래스의 인스턴스를 생성해야만 접근할 수 있다.
//	    3. 인스턴스에서 해당 클래스로 정의된 변수를 수정하면 그 클래스를 포함한 모든 인스턴스의 변수가 수정되지만, 인스턴스에서 해당 인스턴스로 정의된 변수를 수정하면 해당 인스턴스의 변수만 수정된다.
	}

}
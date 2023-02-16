package constructor;

public class ConstructorMain {
	
	private String name;
	private int age;
	
	/*
	★ 생성자 
	기본 생성자(매개 변수가 없는 생성자, 자동적으로 모든 맴버 변수(name,age)들을 기본값으로 초기화한다.)
	만약 개발자가 생성자를 하나도 정의하지 않으면 자바 컴파일러는 기본 생성자를 자동으로 만든다.
	만약 생성자를 하나라도 선언하면 컴파일러는 기본 생성자를 추가하지 않는다. 
	매개변수가 있는 생성자 하나가 선언되어 있으면 객체가 new연산자로 생성될 때 동일한 타입의 매개변수가 있어야한다.
	
	★ Overload 메소드 Overloading
	하나의 클래스 안에서 똑같은 이름의 메소드가 2개 이상 존재 할 때
	- 인수(매개변수) 형이 틀리거나 
	- 인수(매개변수) 개수가 틀린 경우
	*/
	
	public ConstructorMain() {
		System.out.println("default 생성자");
	}
	
	public ConstructorMain(String name) {
		this(); //Overload 된 다른 생성자를 호출할 때, 생성자에서 반드시 첫줄에 써야 한다.
		System.out.println("name 처리 생성자");
		this.name = name;
	}
	
	public ConstructorMain(int age) {
		this("코난");//Overload한 다른 생성자를 호출할 수 있다
		System.out.println("age 처리 생성자");
		this.age = age;
	}
	
	public static void main(String[] args) {
		ConstructorMain aa = new ConstructorMain();
		System.out.println(aa.name + "\t" + aa.age);
		System.out.println();
		
		ConstructorMain bb = new ConstructorMain("홍길동");
		System.out.println(bb.name + "\t" + bb.age);
		System.out.println();
		
		ConstructorMain cc = new ConstructorMain(25);
		System.out.println(cc.name + "\t" + cc.age);
		System.out.println();
	}

}

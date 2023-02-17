package class__;

class StaticTest{
	/*
	 ★ static - 클래스변수
	 1. 메모리 static 영역에 1번만 생성된다. → 초기화 1번만 수행
		★★★모든 객체가 공유한다.(공유변수)★★★
     2. static메소드에서는 static변수만 사용 가능
		static메소드에서는 this를 참조할 수 없다
	 3. static변수나 메소드는 호출시 클래스명으로 직접 호출 할 수 있다.
		객체로도 호출이 가능하다
     4. static{ } - 초기화 영역
        		  - 생성자보다도 먼저 수행한다.
	 */
	private int a; //필드, 인스턴스 변수(객체 생성 후에만 사용이 가능, 객체가 소멸되면 인스턴스 변수도 없어진다.)
	private static int b; //필드, 클래스 변수
	
	static { //static block : 클래스가 메모리에 로드될 때 한 번만 실행되는 문장들의 집합이다, 일반적으로 정적 변수들을 초기화하는 용도로 많이 사용된다.
		System.out.println("초기화 영역");
		StaticTest.b=5;
	}
	
	public StaticTest() {
		System.out.println("기본 생성자");
		this.a=5;
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a = "+this.a+" b = "+this.b);
	}                                          //StaticTest.b
	
	public static void output() {
		System.out.println("static method...");
		//System.out.println("a = "+a+" b = "+b); //error(static메소드안에서는 static 변수만 사용 가능)
	}
	
}

public class StaticMain {	
	public static void main(String[] args) {
		StaticTest aa = new StaticTest();
		aa.calc();
		aa.disp();
		System.out.println();
		
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp();
		System.out.println();
		
		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp();
		System.out.println();
		
		StaticTest.output(); //클래스명.메소드()
		aa.output(); //객체.메소드()
	}

}

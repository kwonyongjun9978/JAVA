package basic;

class Test{
	int a =10;
	static int b = 20;
	static String str;
}
//Variable02.java파일 1개를 컬파일하면 class파일이 2개 생긴다(Test.class,Variable02.class)

public class Variable02 {
	int a; //전역변수(필드, 0값으로 초기화가 되어있다, 범위 : class)
	double b; 
	static int c; //실행하자마자 메모리에 잡힌다, 인스턴스화 필요없음
	
	public static void main(String[] args) {
		//int a; //지역변수(local variable, 범위 : 메소드({}), 현재 garbage값이 들어있다(초기화가 안되어있을시))
		int a = 5; //초기값 5를 할당한다(초기화시킨다)
		System.out.println("지역변수 a = "+a);
		
		Variable02 v = new Variable02(); //메모리 할당(생성),객체형
		System.out.println("객체 = "+v); //주소(클래스@16진수)
		System.out.println("필드 a = "+v.a); //int타입의 초기화 값 : 0
		System.out.println("필드 b = "+v.b); //double타입의 초기화 값 : 0.0
		
		System.out.println("static 필드 c = "+Variable02.c);
		System.out.println("static 필드 c = "+c); //자신의 클래스 영역이니까 생략가능
		
		
		//Test클래스의 값을 출력하시오
		Test t = new Test();
		System.out.println("Test클래스의 필드 a = "+t.a);
		System.out.println("Test클래스의 static 필드 b = "+Test.b);
		System.out.println("Test클래스의 static 필드 str = "+Test.str); //String 타입의 초기화값 : null
	}

}
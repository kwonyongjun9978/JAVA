package basic;

public class Variable01 {

	public static void main(String[] args) {
		//변수(variable) : 한가지 타입의 값만 저장할 수 있는 메모리 공간, 변수는 선언된 블록({})내에서만 사용 가능.
		//변수명 : 첫글자는 영문자(소문자)
		//DataType : 모든 변수에 type이 있으며, 타입에 따라 저장할 수 있는 값의 종류와 범위가 달라진다.
		//기본형
		//1.논리형(boolean, 1bit)
		boolean a;
		a = 25 > 36;
		System.out.println("a = " + a);
		
		//2.문자형
		//char(2byte, 16bit, 0~32767, '')  
		char b;
		b = 'A'; //65, 0100 0001
		System.out.println("b = " + b);
		
		char c;
		c = 65;
		System.out.println("c = " + c); 
		
		//3.정수형
		//byte(1byte, 8bit, -128 ~ +127) 
		byte d = 0; //지역(local)변수는 garbage값을 가지고 있기때문에 초기화를 시켜야한다
		//d = 128; //error
		//d=127;
		System.out.println("d = " + d);
		
		//int(4byte, 32bit, -21억 ~ 21억, default) 
		int e; 
		e = 65; //0000 0000 0000 0000 0000 0000 0100 0001
		System.out.println("e = " + e);
		
		int f;
		f = 'A';
		System.out.println("f = " + f); 
		
		//long(8byte, 64bit)
		long g;
		g = 25L; //25L은 long형 상수
		System.out.println("g = " + g); 
		
		//4.실수형
		//float(4byte, 32bit)
		float h;
		//h = 43.8; //43.8은 double형 상수, error
		//h = (float)43.8; //강제형변환
		h = 43.8F; //43.8F은 float형 상수	
		System.out.println("h = " + h);
		
		//double(8byte, 64bit, default)
		
		
		System.out.println(Integer.MIN_VALUE + "," + Integer.MAX_VALUE); //MAX_VALUE : 상수(정해진값)
		System.out.println(Long.MIN_VALUE + "," + Long.MAX_VALUE);
	}

}

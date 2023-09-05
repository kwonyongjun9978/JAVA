package inheritance;

//상수들의 집합체
enum Color{
	RED, GREEN, BLUE
}

class Final{
	public final String FRUIT = "사과";
	
	//클레스의 필드에 초기값 부여(생성자 사용)
	public final String FRUIT2;
	public Final() {
		System.out.println("기본 생성자");
		FRUIT2="딸기";
	}
	
	//static(실행하자마자 메모리에 자동으로 생성이 된다->new X)
	public static final String ANIMAL = "기린";
	
	//static final 필드는 static 구역에서 초기값을 주어야 한다
	//static인 경우 생성자에서 초기화가 안된다(생성자는 new해야 하기 때문)
	public static final String ANIMAL2;
	static {
		System.out.println("static 초기화 영역");
		ANIMAL2="코끼리";
	}
	
//	public static final int RED=0;
//	public static final int GREEN=1;
//	public static final int BLUE=2;
	
	
	
}

public class FinalMain {

	public static void main(String[] args) {
		final int A =10;//상수화(final 변수는 대문자로만 기술)
		//A=20; -error(final은 값을 변경할수 없다)
		System.out.println("A = "+A);
		
		//final 변수는 반드시 초기값을 주어야 한다
		final int B;
		B=30;
		//B=40; -error
		System.out.println("B = "+B);
		
		Final f = new Final();
		System.out.println("FRUIT = "+f.FRUIT);
		
		System.out.println("FRUIT2 = "+f.FRUIT2);
		
		System.out.println("ANIMAL = "+Final.ANIMAL);
		
		System.out.println("ANIMAL2 = "+Final.ANIMAL2);
		System.out.println();
		
		System.out.println("빨강 = "+Color.RED);
		System.out.println("빨강 = "+Color.RED.ordinal());
		
		for(Color data : Color.values()) {
			System.out.println(data+"\t"+data.ordinal());
		}

	}

}
//final 메소드는 Override를 할 수 없다(종단 메소드)
//final 클래스는 자식클래스를 가질 수 없다 - 상속이 안된다(종단 클래스)

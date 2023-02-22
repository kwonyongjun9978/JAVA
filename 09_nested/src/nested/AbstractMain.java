package nested;

public class AbstractMain {
	
	public static void main(String[] args) {
		/*
		추상클래스는 자신의 클래스로 메모리 생성을 할 수 없다
    	=> 생성하려면
     	가. 추상클래스를 상속 했을때, Sub Class를 이용(반드시 Sub Class가 추상메소드를 Override 해야 한다)
     	나. 메소드 이용
     	다. 익명 클래스 이용
		*/
		
		//추상클래스를 상속(extends), 인터페이스를 구현(implements) 안했는데도 추상클래스와 인터페이스를 다른 클래스에서 메모리 생성이 가능한가?? -> 가능
		
		//다.
		AbstractTest at = new AbstractTest() { //익명 내부 클래스를 이용하여 추상클래스를 다른 클래스에서 메모리 생성(인스턴스화, 객체생성)
			
			public void setName(String name) { //자식 클래스가 아닌데 꼭 오버라이드를 해줘야 하나? -> 가능
				this.name = name;
			}
		};
		
		InterA in = new InterA() { //익명 내부 클래스를 이용하여 인터페이스를 다른 클래스에서 메모리 생성(인스턴스화, 객체생성)
			//인터페이스를 구현(implements)한 클래스가 아니여도 인터페이스 객체를 생성하면 추상메소드를 오버라이드 해줘야한다.
			public void aa() {} 
			public void bb() {}
		};
		
		//다.
		AbstractExam ae = new AbstractExam() { //익명 내부 클래스
			//추상메소드가 없기 때문에 원하는 메소드를 골라서 Override
		};
		
	}

}
//익명 클래스도 내부 클래스와 같이 필드와 다른 메소드들을 정의할 수 있다, 다만 메소드 안에 정의되는 지역 변수 중에서는 final로 선언된 변수만 사용이 가능하다.


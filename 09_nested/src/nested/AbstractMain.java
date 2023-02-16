package nested;

public class AbstractMain {
	
	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() { //익명 내부 클래스
			
			public void setName(String name) { //구현
				this.name = name;
			}
		};
		
		InterA in = new InterA() { //익명 내부 클래스, interface를 new시킨게 아니라 익명 내부 클래스를 만든거다.
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() { //익명 내부 클래스
			//추상메소드가 없기 때문에 원하는 메소드를 골라서 Override
		};
		
	}

}

//추상클래스 생성
//1. 상속 - 자식클래스를 이용하여 생성
//2. 메소드를 이용하여 생성

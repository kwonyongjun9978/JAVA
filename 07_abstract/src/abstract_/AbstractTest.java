package abstract_;

public abstract class AbstractTest { //POJO(Plain Old Java Object) - 기본적인 형식
	protected String name;

	public AbstractTest() {
		
	}

	public AbstractTest(String name) {
		super();
		this.name = name;
	}


	public String getName() { //메소드 구현
		return name;
	}

	public abstract void setName(String name); //추상메소드
											   
	
}
//추상메소드를 만들면 추상클래스로 정의되어야 한다.
//추상클래스 입장에서는 추상메소드가 있을수도 있고 없을수도 있다.

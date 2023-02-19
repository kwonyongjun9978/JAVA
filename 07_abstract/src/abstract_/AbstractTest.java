package abstract_;

//추상클래스(완전하게 구현되어 있지 않은 메소드를 가지고 있는 클래스)
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
/*
추상메소드를 만들면 추상클래스로 정의되어야 한다.
추상 클래스를 상속받는 자식 클래스에서는 반드시 추상 메소드를 재정의하여야 한다.(추상메소드는 반드시 Sub Class에서 Override를 꼭 해 주어야 한다, Override를 안하면 Sub Class 마저도 abstract 가 되어야 한다)
추상클래스 입장에서는 추상메소드가 있을수도 있고 없을수도 있다.(없는경우 추상클래스의 메소드는 모두 빈body로 되어있다)
추상클레스는 직접적으로(자신의 클래스로) 메모리에 생성(new)할수 없다(추상 클래스로 객체생성X)
=>생성하려면
	     가. Sub Class를 이용(반드시 Sub Class가 추상메소드를 Override 해야 한다)
	     나. 메소드를 이용
*/
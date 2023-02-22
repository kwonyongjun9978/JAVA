package nested;

//추상클래스
public abstract class AbstractTest { //POJO 형식
	String name;

	public String getName() {
		return name;
	}

	public abstract void setName(String name);  //추상메소드
	
}
//추상메소드가 있으면 반드시 해당 클래스도 추상클래스여야 한다.

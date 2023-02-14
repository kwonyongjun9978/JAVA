package interface_;

public interface InterA {
	//only 상수
	public static final String NAME = "홍길동";
	int AGE = 25; //public static final생략가능
	
	//only 추상 메소드
	public abstract void aa();
	public void b(); //abstract생략가능
}

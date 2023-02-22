package interface_;

public interface InterC extends InterA, InterB{ //다중 상속 가능
	//추상 메소드 4개
//	@Override
//	default void aa() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//	default void b() {
//			// TODO Auto-generated method stub
//			
//	}
//	
//	@Override
//	default void cc() {
//			// TODO Auto-generated method stub
//			
//	}
//	
//	@Override
//	default void dd() {
//			// TODO Auto-generated method stub
//			
//	}
	
/*
extends 하는 경우, 추상메소드는 반드시 Sub Class에서 Override 꼭 해 주어야 한다.
but, 하위 인터페이스(Inter C)에서는 상위 인터페이스(Inter A, Inter B)의 추상 메서드를 반드시 오버라이드(override)할 필요는 없습니다.
이 경우, 하위 인터페이스(InterC)를 구현(implement)한 클래스(InterMain)에서 상위 인터페이스(Inter A, Inter B)의 추상 메서드를 모두 구현해야 합니다.

interface간 상속 가능
class는 다중상속이 불가능하지만, interface는 다중상속 가능
단, 상속(extends)의 경우 class extends class, interface extends interface 만 가능(Mix X)

상수와 추상메소드만 존재(필드 선언 X)
인터페이스만으로 객체 생성 X -> 인터페이스의 변수를 가지고 (인터페이스를 구현한)클래스의 객체를 참조, 익명 내부 클래스 사용
*/
}

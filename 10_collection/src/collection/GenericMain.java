package collection;

class GenericTest<T>{
	//제네릭은 동적으로 타입을 결정하지 않고 컴파일 시 타입이 결정되므로 보다 안전한 프로그래밍이 가능하다
	//객체를 생성할 때, T(타입 매개 변수)자리에 구체적인 자료형을 적어주면 된다.
	private T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	
	
}
public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();
		aa.setA("홍길동");
		System.out.println("이름 = "+aa.getA());

		//aa.setA(25); //error : String타입으로 생성해줬기 때문에 integer타입은 사용불가
		
		GenericTest<Integer> bb = new GenericTest<Integer>(); //int X
		bb.setA(25);
		System.out.println("나이 = "+bb.getA());

	}
}

package inheritance;

class AA{
	public int a =3;
	
	AA(){
		System.out.println("부모클래스의 기본 생성자");
	}
	
	public void disp() {
		this.a += 5;
		System.out.println("AA : "+ a + " ");
	}
}

class BB extends AA{
	//필드는 Override 개념이 없다, 메소드에만 해당한다
	public int a =8;
	
	BB(){
		System.out.println("자식클래스의 기본 생성자");
	}
	
	@Override
	public void disp() {
//		super.disp();
		this.a+=5;
		System.out.println("BB : "+ a + " ");
//		super.disp();
	}
}
public class OverrideMain {

	public static void main(String[] args) {
		BB aa = new BB(); //AA클래스와 BB클래스 메소드,필드 모두 사용 가능(AA클래스의 메소드,필드 private제외)
		aa.disp(); //BB : 13, 오버라이딩된 자식 메소드 호출
		System.out.println("aa : "+aa.a); 
		System.out.println();
		
		/*업캐스팅(부모 = 자식)
		부모 클래스 변수를 가지고 자식 클래스의 객체를 참조하는 경우에는 부모 클래스에서 정의된 부분만 사용할 수 있다.
		자식 클래스(BB) 중에서 부모 클래스(AA)로부터 상속받은 부분(disp())만을 bb를 통해서 사용할 수 있고 나머지는 사용하지 못한다.(부모 클래스(AA)의 메소드 필드 사용)
		 */
		AA bb = new BB();   
		bb.disp(); //BB : 13
		System.out.println("bb : "+bb.a); //3
		System.out.println();
		
		//다운캐스팅( 자식 = 부모, 부모 객체를 자식 참조 변수로 참조(error) -> 자식 = (자식)부모 )
		BB cc = (BB)bb; //자식 = (자식)부모
		cc.disp();//BB : 18 //위에서 업캐스팅을 통해 객체가 생성되어서 a 값이 13으로 설정된후 다시 BB클래스의 disp()를 호출
		System.out.println("cc : "+cc.a); //18
		System.out.println();
		
		AA dd = new AA();
		dd.disp();
		System.out.println("dd : "+dd.a); 
		System.out.println();
		
		//instanceof : 객체 타입 확인, 반환값:true,false
		if(dd instanceof AA) System.out.println("ddd");

	}

}
/*
Override 메소드
Super클래스와 Sub클래스에 똑같은 메소드가 존재
모든 우선권은 Sub클래스가 갖는다.
Super, Sub 클래스의 접근제어자(Modifier)는 틀려도 되지만
Super보다 Sub클래스의 접근제어자(Modifier)가 더 커야한다.
*/

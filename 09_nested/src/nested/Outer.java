package nested;

public class Outer {
	private String name;
	
	public void output() {
		Inner in = new Inner(); //내부 클래스(Inner)의 인스턴스 변수(age)를 사용하기 위해서 내부 클래스(Inner)객체 선언
								//Outer -> Inner 접근 X, 객체 생성 시 가능
		System.out.println("이름 = " + this.name + "\t나이 = " + in.age);
	}
	
		class Inner{
			private int age;
			
			public void disp() {
				System.out.println("이름 = " + Outer.this.name +"\t나이 = " + this.age);
				//inner class에서 outer class에 있는 private variable에 접근 가능
			}
			
		}
	
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "홍길동";
		System.out.println("이름 = " + ou.name);
		System.out.println();
		ou.output();
		System.out.println();
		
		//Inner in2 = new Inner(); // inner class로만 만들 수 없음
		//outer class 내부에 inner class memory allocation
		//내부 클래스(Inner)의 객체는 외부 클래스(Outer)의 객체가 먼저 생성되어 있어야 생성할 수 있다.
		Outer.Inner in2 = ou.new Inner(); 
		in2.age = 20;
		in2.disp();
		System.out.println();
		
		Outer.Inner in3 = ou.new Inner();
		in3.age = 30;
		in3.disp();
		System.out.println();
		
		/*
		Outer 클래스의 내부 클래스인 Inner 클래스의 인스턴스를 생성하는 코드
		내부 클래스는 외부 클래스의 인스턴스를 통해 생성되므로, new Outer().new Inner() 구문에서 Outer()로 생성한 Outer 클래스의 인스턴스를 사용하여 Inner 클래스의 인스턴스를 생성합니다. 
		이렇게 생성된 Inner 클래스의 인스턴스는 Outer 클래스의 인스턴스와 연관이 있습니다. 
		이러한 연관성으로 인해, Inner 클래스는 Outer 클래스의 멤버 변수 및 메서드에 접근할 수 있습니다.
		 */
		Outer.Inner in4 = new Outer().new Inner();
		//in4.name = "코난"; //error (클래스 안에서만 접근 가능)
		in4.age = 35;
		in4.disp();
		System.out.println();
		
	}

}
/*
안쪽에 있는 클래스는 바깥쪽 클래스의 모든 멤버에 접근 가능
하지만 바깥쪽 클래스는 안쪽의 클래스의 멤버에 접근 불가능
단 안쪽의 클래스로 객체를 선언하면 접근 가능하다.
*/

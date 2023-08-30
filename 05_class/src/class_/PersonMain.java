package class_;

class Person{
	//private : 해당 class 안에서만 접근
	private String name; //필드, 초기값 : null
	private int age; //필드, 초기값 : 0
	
	//method 구현
	//setters,getters
	//setters메소드에는 void 사용 -> 반환값(return)이 없다
	public void setName(String n){ //String n : 매개변수(parameter) : 메소드에 전달되는 값을 전달하는 변수
		this.name=n; //this.name = class 필드 변수 
	}
	
	public void setAge(int a) { 
		age=a;
	}
	
	public void setData(String n, int a) {
		name = n;
		age = a;
	}
	
	public void setData() {
		
	}
	
	public String getName(){
		return name; //반환값
	}
	
	public int getAge(){
		return age; //반환값
	}
	
}
public class PersonMain {

	public static void main(String[] args) {
		
		Person a; //객체 선언(class형 변수=참조변수)
		a = new Person(); //생성, 메모리의 heap영역에 생성(이름부여X, 주소O)
		/*
		클래스 타입의 객체(a)를 선언(클래스로부터 객체를 선언하는 과정을 클래스의 인스턴스 화)
		인스턴스(instance) : 선언된 해당 클래스 타입의 객체를 인스턴스(a)라고 한다.
		즉, 인스턴스란 메모리에 할당된 객체를 의미.
		 */
		System.out.println("객체 a = "+a); //주소
		a.setName("용준"); //호출 - 호출한 함수는 반드시 제자리로 돌아온다.
		a.setAge(30); //호출 /30 : 인수(argument) 
		System.out.println("이름 = "+a.getName()+"  나이 = "+a.getAge());
		
		Person b = new Person();
		System.out.println("객체 b = "+b);
		
		b.setName("용우"); 
		b.setAge(27); 
		System.out.println("이름 = "+b.getName()+"  나이 = "+b.getAge());
		
		Person c = new Person();
		System.out.println("객체 c = "+c);
		c.setData("", 100); 
		System.out.println("이름 = "+c.getName()+"  나이 = "+c.getAge());
		
		Person d = new Person();
		d.setData();
		System.out.println("이름 = "+d.getName()+"  나이 = "+d.getAge());
	}

}
